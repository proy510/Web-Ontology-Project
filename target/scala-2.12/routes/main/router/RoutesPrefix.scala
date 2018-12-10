// @GENERATOR:play-routes-compiler
// @SOURCE:D:/Demo/owlproject/owlproject/owlproject/conf/routes
// @DATE:Fri Dec 07 15:35:03 EST 2018


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
