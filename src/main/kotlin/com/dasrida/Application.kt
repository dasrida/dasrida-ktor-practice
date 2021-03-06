package com.dasrida

import com.dasrida.plugins.*
import io.ktor.server.engine.*
import io.ktor.server.netty.*

fun main() {
    embeddedServer(Netty, port = 8080, host = "0.0.0.0") {
        configureRouting()
        configureSecurity()
        configureMonitoring()
        configureTemplating()
        configureSerialization()
    }.start(wait = true)
}
