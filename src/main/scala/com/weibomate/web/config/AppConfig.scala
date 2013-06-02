package com.weibomate.web.config

import org.springframework.context.annotation.{ Bean, Configuration, ImportResource }
import org.springframework.beans.factory.annotation.Value
import org.springframework.beans.factory.config.PropertiesFactoryBean
import org.springframework.core.io.ClassPathResource
import org.springframework.web.multipart.commons.CommonsMultipartResolver
import org.springframework.web.servlet.view.freemarker.FreeMarkerConfigurer
import org.springframework.web.servlet.view.freemarker.FreeMarkerViewResolver

import org.slf4j.LoggerFactory

import com.weibomate.web._

@Configuration
class AppConfig {
  val logger = LoggerFactory.getLogger(classOf[AppConfig])

  @Bean
  def indexController = new IndexController

  @Bean
  def freemarkerConfig = {
    val f = new FreeMarkerConfigurer
    f.setTemplateLoaderPath("/")
    f.setDefaultEncoding("UTF-8")
    f
  }

  @Bean
  def viewResolver = {
    var vr = new FreeMarkerViewResolver
    vr.setCache(false)
    vr.setPrefix("")
    vr.setSuffix(".html")
    vr.setContentType("text/html;charset=UTF-8")
    vr
  }
}