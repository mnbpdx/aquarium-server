package com.aquariumserver.models.sensors

import com.aquariumserver.models.FixMeDateTime
import kotlinx.serialization.Serializable

interface Sensor {
    val id: Int
    val readings: List<Reading>
}

interface Reading {
    val id: Int
    val dateTime: FixMeDateTime
    val location: TestSite
    val value: ReadingFormat
    val note: String?
}

interface TestSite {
    val id: Int
}

@Serializable
sealed class ReadingFormat {
    @Serializable
    class Temperature(val value: Float) : ReadingFormat()

    @Serializable
    class Oxygen(val value: Float) : ReadingFormat()

    @Serializable
    class Ph(val value: Float) : ReadingFormat()
}