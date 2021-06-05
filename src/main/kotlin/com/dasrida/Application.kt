package com.dasrida

import com.dasrida.plugins.*
import io.ktor.application.*

fun main(args: Array<String>): Unit = io.ktor.server.netty.EngineMain.main(args)

fun Application.module(testing: Boolean = false) {
    try {
        configureRouting()
        configureSecurity()
        configureMonitoring()
        configureTemplating()
        configureSerialization()
    } catch (e: Exception) {
        e.printStackTrace()
    }
}
