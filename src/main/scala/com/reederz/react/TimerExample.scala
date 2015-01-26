package com.reederz.react

import scala.scalajs.js.JSApp
import scala.scalajs.js
import japgolly.scalajs.react._
import japgolly.scalajs.react.vdom.all._
import org.scalajs.dom.document
/*
 var Timer = React.createClass({displayName: 'Timer',
  getInitialState: function() {
    return {secondsElapsed: 0};
  },
  tick: function() {
    this.setState({secondsElapsed: this.state.secondsElapsed + 1});
  },
  componentDidMount: function() {
    this.interval = setInterval(this.tick, 1000);
  },
  componentWillUnmount: function() {
    clearInterval(this.interval);
  },
  render: function() {
    return (
      React.createElement("div", null, "Seconds Elapsed: ", this.state.secondsElapsed)
    );
  }
});

React.render(React.createElement(Timer, null), mountNode);
 */

object TimerExample extends JSApp {
  case class State(secondsElapsed: Long)

  class Backend($: BackendScope[_, State]) {
    var interval: js.UndefOr[js.timers.SetIntervalHandle] =
      js.undefined
    def tick() =
      $.modState(s => State(s.secondsElapsed + 1))
    def start() =
      interval = js.timers.setInterval(1000)(tick())
  }

  def main: Unit = {

    val content = Util.createExampleMountPoint("Timer Example", document.body)

    val Timer = ReactComponentB[Unit]("Timer")
      .initialState(State(0))
      .backend(new Backend(_))
      .render((_, s, _) => div("Seconds elapsed: ", s.secondsElapsed))
      .componentDidMount(_.backend.start())
      .componentWillUnmount(_.backend.interval foreach js.timers.clearInterval)
      .buildU
      
    React.render(Timer(), content)
  }
}