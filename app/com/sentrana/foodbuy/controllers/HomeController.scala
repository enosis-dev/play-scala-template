package controllers

import com.sentrana.appshell.controllers.BaseController
import com.sentrana.appshell.logging.{ LoggerComponent, PlayLoggerComponent }

object HomeController extends HomeController with PlayLoggerComponent

trait HomeController extends BaseController {
  this: LoggerComponent =>

  def index = Action {
    Ok("Welcome to FoodBuy!!!")
  }
}
