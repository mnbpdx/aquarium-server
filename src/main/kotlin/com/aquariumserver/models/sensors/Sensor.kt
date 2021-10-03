package com.aquariumserver.models.sensors

interface Sensor {
    val id: Int
    val readings: List<Reading>
}
