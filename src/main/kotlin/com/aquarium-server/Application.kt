package com.`aquarium-server`

import io.ktor.server.engine.*
import io.ktor.server.netty.*
import com.`aquarium-server`.plugins.*

fun main() {
    embeddedServer(Netty, port = 8080, host = "0.0.0.0") {
        configureRouting()
        configureSerialization()
    }.start(wait = true)
}


interface Sensor {
    val id: Int
    val readings: List<Reading>
}

interface Reading {
    val id: Int
    val
}
