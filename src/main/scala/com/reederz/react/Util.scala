package com.reederz.react

import org.scalajs.dom.document
import org.scalajs.dom.Element

object Util {
  def createExampleMountPoint(hdrTxt: String, parent: Element): Element = {
    val content = document.createElement("div")
    val s = document.createElement("section")
    val hdr = document.createElement("h3")
    val hdrTxtNode = document.createTextNode(hdrTxt)
    hdr.appendChild(hdrTxtNode)
    s.appendChild(hdr)

    s.appendChild(content)
    parent.appendChild(s)
    content
  }
}