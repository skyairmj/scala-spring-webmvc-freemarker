package com.weibomate.web

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping

@Controller
class IndexController {
  @RequestMapping(Array("/"))
  def index = {
    "/index"
  }
}