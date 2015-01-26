package com.reederz.react

import scala.scalajs.js.JSApp
import japgolly.scalajs.react._
import japgolly.scalajs.react.vdom.all._
import org.scalajs.dom.document

/*
 var HelloMessage = React.createClass({displayName: 'HelloMessage',
  render: function() {
    return React.createElement("div", null, "Hello ", this.props.name);
  }
});

React.render(React.createElement(HelloMessage, {name: "John"}), mountNode);
 */

object HelloMessageExample extends JSApp{
  
  def main():Unit = {

    
    val content = Util.createExampleMountPoint("Hello world example", document.body)
    val HelloMessage = ReactComponentB[String]("HelloMessage")
      .render(name => div("Hello ", name))
      .build
      

    React.render(HelloMessage("Justas"), content)
  }
}