package controllers

import org.scalatest.FunSpec
import play.api.mvc.{Request, AnyContentAsEmpty, Result, Call}
import play.api.test.{FakeRequest, FakeApplication}
import play.api.test.Helpers._

import scala.concurrent.Future

class WebApplicationSpec extends FunSpec {
  def fakeRequest(call: Call): FakeRequest[AnyContentAsEmpty.type] = FakeRequest(call.method, call.url)

  def routeOf[T](req: Request[T])(implicit w : play.api.http.Writeable[T]): Future[Result] =
    route(req).getOrElse(throw new IllegalArgumentException)

  describe("WebApplication") {
    it("signUpPage") {
      running(FakeApplication()) {
        val res = routeOf(fakeRequest(Calls.signUpPage))
        pending
        assert(status(res) === OK)
      }
    }
  }
}
