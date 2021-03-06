// @GENERATOR:play-routes-compiler
// @SOURCE:D:/Demo/owlproject/owlproject/owlproject/conf/routes
// @DATE:Fri Dec 07 15:35:03 EST 2018

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:6
  HomeController_0: controllers.HomeController,
  // @LINE:9
  Assets_1: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    HomeController_0: controllers.HomeController,
    // @LINE:9
    Assets_1: controllers.Assets
  ) = this(errorHandler, HomeController_0, Assets_1, "/")

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, HomeController_0, Assets_1, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.HomeController.index"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """reset""", """controllers.HomeController.reset"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addmerchant/""" + "$" + """uniqueID<[^/]+>""", """controllers.HomeController.addMerchant(uniqueID:String)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addconsumer/""" + "$" + """uniqueID<[^/]+>""", """controllers.HomeController.addConsumer(uniqueID:String)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addtransaction/""" + "$" + """senderID<[^/]+>/""" + "$" + """receiverID<[^/]+>/""" + "$" + """transactionID<[^/]+>""", """controllers.HomeController.addTransaction(senderID:String, receiverID:String, transactionID:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """iscommercial/""" + "$" + """transactionID<[^/]+>""", """controllers.HomeController.isCommercial(transactionID:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """ispersonal/""" + "$" + """transactionID<[^/]+>""", """controllers.HomeController.isPersonal(transactionID:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """ispurchase/""" + "$" + """transactionID<[^/]+>""", """controllers.HomeController.isPurchase(transactionID:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """isrefund/""" + "$" + """transactionID<[^/]+>""", """controllers.HomeController.isRefund(transactionID:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """istrusted/""" + "$" + """merchantID<[^/]+>""", """controllers.HomeController.isTrusted(merchantID:String)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:6
  private[this] lazy val controllers_HomeController_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_HomeController_index0_invoker = createInvoker(
    HomeController_0.index,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "index",
      Nil,
      "GET",
      this.prefix + """""",
      """ An example controller showing a sample home page""",
      Seq()
    )
  )

  // @LINE:9
  private[this] lazy val controllers_Assets_versioned1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned1_invoker = createInvoker(
    Assets_1.versioned(fakeValue[String], fakeValue[Asset]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      this.prefix + """assets/""" + "$" + """file<.+>""",
      """ Map static resources from the /public folder to the /assets URL path""",
      Seq()
    )
  )

  // @LINE:14
  private[this] lazy val controllers_HomeController_reset2_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("reset")))
  )
  private[this] lazy val controllers_HomeController_reset2_invoker = createInvoker(
    HomeController_0.reset,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "reset",
      Nil,
      "POST",
      this.prefix + """reset""",
      """This should reload the ontology
Need to change this later.""",
      Seq()
    )
  )

  // @LINE:17
  private[this] lazy val controllers_HomeController_addMerchant3_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addmerchant/"), DynamicPart("uniqueID", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_addMerchant3_invoker = createInvoker(
    HomeController_0.addMerchant(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "addMerchant",
      Seq(classOf[String]),
      "POST",
      this.prefix + """addmerchant/""" + "$" + """uniqueID<[^/]+>""",
      """Create a Merchant Individual""",
      Seq()
    )
  )

  // @LINE:20
  private[this] lazy val controllers_HomeController_addConsumer4_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addconsumer/"), DynamicPart("uniqueID", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_addConsumer4_invoker = createInvoker(
    HomeController_0.addConsumer(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "addConsumer",
      Seq(classOf[String]),
      "POST",
      this.prefix + """addconsumer/""" + "$" + """uniqueID<[^/]+>""",
      """Create a Consumer Individual""",
      Seq()
    )
  )

  // @LINE:23
  private[this] lazy val controllers_HomeController_addTransaction5_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addtransaction/"), DynamicPart("senderID", """[^/]+""",true), StaticPart("/"), DynamicPart("receiverID", """[^/]+""",true), StaticPart("/"), DynamicPart("transactionID", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_addTransaction5_invoker = createInvoker(
    HomeController_0.addTransaction(fakeValue[String], fakeValue[String], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "addTransaction",
      Seq(classOf[String], classOf[String], classOf[String]),
      "POST",
      this.prefix + """addtransaction/""" + "$" + """senderID<[^/]+>/""" + "$" + """receiverID<[^/]+>/""" + "$" + """transactionID<[^/]+>""",
      """Create a Transaction Individual""",
      Seq()
    )
  )

  // @LINE:26
  private[this] lazy val controllers_HomeController_isCommercial6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("iscommercial/"), DynamicPart("transactionID", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_isCommercial6_invoker = createInvoker(
    HomeController_0.isCommercial(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "isCommercial",
      Seq(classOf[String]),
      "GET",
      this.prefix + """iscommercial/""" + "$" + """transactionID<[^/]+>""",
      """Detects whether a transaction is Commercial""",
      Seq()
    )
  )

  // @LINE:29
  private[this] lazy val controllers_HomeController_isPersonal7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("ispersonal/"), DynamicPart("transactionID", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_isPersonal7_invoker = createInvoker(
    HomeController_0.isPersonal(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "isPersonal",
      Seq(classOf[String]),
      "GET",
      this.prefix + """ispersonal/""" + "$" + """transactionID<[^/]+>""",
      """Detects whether a transaction is Personal""",
      Seq()
    )
  )

  // @LINE:32
  private[this] lazy val controllers_HomeController_isPurchase8_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("ispurchase/"), DynamicPart("transactionID", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_isPurchase8_invoker = createInvoker(
    HomeController_0.isPurchase(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "isPurchase",
      Seq(classOf[String]),
      "GET",
      this.prefix + """ispurchase/""" + "$" + """transactionID<[^/]+>""",
      """Detects whether a transaction is Purchase""",
      Seq()
    )
  )

  // @LINE:35
  private[this] lazy val controllers_HomeController_isRefund9_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("isrefund/"), DynamicPart("transactionID", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_isRefund9_invoker = createInvoker(
    HomeController_0.isRefund(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "isRefund",
      Seq(classOf[String]),
      "GET",
      this.prefix + """isrefund/""" + "$" + """transactionID<[^/]+>""",
      """Detects whether a transaction is Purchase""",
      Seq()
    )
  )

  // @LINE:38
  private[this] lazy val controllers_HomeController_isTrusted10_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("istrusted/"), DynamicPart("merchantID", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_isTrusted10_invoker = createInvoker(
    HomeController_0.isTrusted(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "isTrusted",
      Seq(classOf[String]),
      "GET",
      this.prefix + """istrusted/""" + "$" + """merchantID<[^/]+>""",
      """Detects whether a Merchant is Trusted""",
      Seq()
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_HomeController_index0_route(params@_) =>
      call { 
        controllers_HomeController_index0_invoker.call(HomeController_0.index)
      }
  
    // @LINE:9
    case controllers_Assets_versioned1_route(params@_) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned1_invoker.call(Assets_1.versioned(path, file))
      }
  
    // @LINE:14
    case controllers_HomeController_reset2_route(params@_) =>
      call { 
        controllers_HomeController_reset2_invoker.call(HomeController_0.reset)
      }
  
    // @LINE:17
    case controllers_HomeController_addMerchant3_route(params@_) =>
      call(params.fromPath[String]("uniqueID", None)) { (uniqueID) =>
        controllers_HomeController_addMerchant3_invoker.call(HomeController_0.addMerchant(uniqueID))
      }
  
    // @LINE:20
    case controllers_HomeController_addConsumer4_route(params@_) =>
      call(params.fromPath[String]("uniqueID", None)) { (uniqueID) =>
        controllers_HomeController_addConsumer4_invoker.call(HomeController_0.addConsumer(uniqueID))
      }
  
    // @LINE:23
    case controllers_HomeController_addTransaction5_route(params@_) =>
      call(params.fromPath[String]("senderID", None), params.fromPath[String]("receiverID", None), params.fromPath[String]("transactionID", None)) { (senderID, receiverID, transactionID) =>
        controllers_HomeController_addTransaction5_invoker.call(HomeController_0.addTransaction(senderID, receiverID, transactionID))
      }
  
    // @LINE:26
    case controllers_HomeController_isCommercial6_route(params@_) =>
      call(params.fromPath[String]("transactionID", None)) { (transactionID) =>
        controllers_HomeController_isCommercial6_invoker.call(HomeController_0.isCommercial(transactionID))
      }
  
    // @LINE:29
    case controllers_HomeController_isPersonal7_route(params@_) =>
      call(params.fromPath[String]("transactionID", None)) { (transactionID) =>
        controllers_HomeController_isPersonal7_invoker.call(HomeController_0.isPersonal(transactionID))
      }
  
    // @LINE:32
    case controllers_HomeController_isPurchase8_route(params@_) =>
      call(params.fromPath[String]("transactionID", None)) { (transactionID) =>
        controllers_HomeController_isPurchase8_invoker.call(HomeController_0.isPurchase(transactionID))
      }
  
    // @LINE:35
    case controllers_HomeController_isRefund9_route(params@_) =>
      call(params.fromPath[String]("transactionID", None)) { (transactionID) =>
        controllers_HomeController_isRefund9_invoker.call(HomeController_0.isRefund(transactionID))
      }
  
    // @LINE:38
    case controllers_HomeController_isTrusted10_route(params@_) =>
      call(params.fromPath[String]("merchantID", None)) { (merchantID) =>
        controllers_HomeController_isTrusted10_invoker.call(HomeController_0.isTrusted(merchantID))
      }
  }
}
