package com.aquariumserver.models.sensors

import com.aquariumserver.models.FixMeDateTime

interface Sensor {
    val id: Int
    val readings: List<Reading>
}

interface Reading {
    val id: Int
    val dateTime: FixMeDateTime
    val value: ReadingType
}

sealed class ReadingType {
    class Temperature(val value: Float) : ReadingType()
    class Oxygen(val value: Float) : ReadingType()
    class Ph(val value: Float) : ReadingType()
}