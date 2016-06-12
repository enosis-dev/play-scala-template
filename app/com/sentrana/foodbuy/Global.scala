package com.sentrana.foodbuy

import com.sentrana.appshell.dataaccess.{ ConnectionProviderComponent, ScalikeJdbcConnectionProviderComponent }
import com.sentrana.appshell.logging.{ LoggerComponent, PlayLoggerComponent }
import com.sentrana.appshell.utils.{ DbConnectionInfo }
import play.api.Application
import com.sentrana.appshell.{ Global => BaseGlobal }

trait Global extends BaseGlobal {
  this: ConnectionProviderComponent with LoggerComponent =>

  override def onStart(app: Application): Unit = {
    Logger.debug(s"Application Started Successfully")
  }
}

object Global extends Global with ScalikeJdbcConnectionProviderComponent with PlayLoggerComponent
