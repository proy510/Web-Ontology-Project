// @GENERATOR:play-routes-compiler
// @SOURCE:D:/Demo/owlproject/owlproject/owlproject/conf/routes
// @DATE:Fri Dec 07 15:35:03 EST 2018

import play.api.routing.JavaScriptReverseRoute


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers.javascript {

  // @LINE:6
  class ReverseHomeController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:17
    def addMerchant: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.addMerchant",
      """
        function(uniqueID0) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "addmerchant/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("uniqueID", uniqueID0))})
        }
      """
    )
  
    // @LINE:26
    def isCommercial: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.isCommercial",
      """
        function(transactionID0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "iscommercial/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("transactionID", transactionID0))})
        }
      """
    )
  
    // @LINE:29
    def isPersonal: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.isPersonal",
      """
        function(transactionID0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "ispersonal/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("transactionID", transactionID0))})
        }
      """
    )
  
    // @LINE:35
    def isRefund: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.isRefund",
      """
        function(transactionID0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "isrefund/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("transactionID", transactionID0))})
        }
      """
    )
  
    // @LINE:23
    def addTransaction: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.addTransaction",
      """
        function(senderID0,receiverID1,transactionID2) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "addtransaction/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("senderID", senderID0)) + "/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("receiverID", receiverID1)) + "/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("transactionID", transactionID2))})
        }
      """
    )
  
    // @LINE:32
    def isPurchase: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.isPurchase",
      """
        function(transactionID0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "ispurchase/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("transactionID", transactionID0))})
        }
      """
    )
  
    // @LINE:20
    def addConsumer: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.addConsumer",
      """
        function(uniqueID0) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "addconsumer/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("uniqueID", uniqueID0))})
        }
      """
    )
  
    // @LINE:38
    def isTrusted: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.isTrusted",
      """
        function(merchantID0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "istrusted/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("merchantID", merchantID0))})
        }
      """
    )
  
    // @LINE:14
    def reset: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.reset",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "reset"})
        }
      """
    )
  
    // @LINE:6
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + """"})
        }
      """
    )
  
  }

  // @LINE:9
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:9
    def versioned: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.versioned",
      """
        function(file1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[play.api.mvc.PathBindable[Asset]].javascriptUnbind + """)("file", file1)})
        }
      """
    )
  
  }


}
