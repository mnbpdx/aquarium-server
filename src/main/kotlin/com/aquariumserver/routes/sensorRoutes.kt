package com.aquariumserver.routes

import com.aquariumserver.models.testSensorStorage
import io.ktor.application.call
import io.ktor.http.HttpStatusCode
import io.ktor.response.respond
import io.ktor.response.respondText
import io.ktor.routing.Route
import io.ktor.routing.delete
import io.ktor.routing.get
import io.ktor.routing.post
import io.ktor.routing.route

fun Route.sensorRouting() {
    route("/sensor") {
        get {
            if (testSensorStorage.isNotEmpty()) {
                call.respond(testSensorStorage)
            } else {
                call.respondText("No sensors found", status = HttpStatusCode.NotFound)
            }
        }
        get("{id}") {

        }
        post {

        }
        delete("{id}") {

        }
    }
}