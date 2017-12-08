package controllers

import javax.inject.Inject
import play.api.mvc._

class HelloController  @Inject()(cc: ControllerComponents) extends AbstractController(cc) {

  //  http://localhost:9000/hello
  def hello = Action {
    Ok("Hello")
  }

  //  http://localhost:9000/helloWithName/houzhang
  def helloWithName(name: String) = Action {
    Ok(s"Hello ${name}")
  }

  //  http://localhost:9000/helloWithQueryParams?name=houzhang
  def helloWithQueryParams = Action { implicit request =>
    Ok(s"Hello ${request.queryString}")
  }

  //  def hello = Action(parse.json) { implicit request =>
  //    Ok("Hello got request [" + request.body + "]")
  //  }
}
