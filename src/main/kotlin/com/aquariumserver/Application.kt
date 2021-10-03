package com.aquariumserver

import com.aquariumserver.plugins.configureSerialization
import io.ktor.application.Application

fun main(args: Array<String>): Unit = io.ktor.server.netty.EngineMain.main(args)

fun Application.module() {
    configureSerialization()
}