package controllers

import play.api.mvc.{AnyContent, Action, Controller}

import scala.concurrent.Future

trait WebApplication extends Controller {
  def signUpPage: Action[AnyContent] = Action.async { request =>
    Future.successful(NotImplemented)
  }
}

object WebApplication extends WebApplication
