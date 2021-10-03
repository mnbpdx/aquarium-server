package com.aquariumserver

import com.aquariumserver.models.FixMeDateTime
import com.aquariumserver.models.MyDateTime
import com.aquariumserver.models.Reading
import com.aquariumserver.models.ReadingType
import com.aquariumserver.models.Sensor
import io.ktor.server.engine.*
import io.ktor.server.netty.*
import com.aquariumserver.plugins.*

fun main() {
    embeddedServer(Netty, port = 8080, host = "0.0.0.0") {
        configureRouting()
        configureSerialization()
    }.start(wait = true)
}





