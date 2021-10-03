package com.aquariumserver.models.sensors

import com.aquariumserver.models.FixMeDateTime
import com.aquariumserver.models.TestSite
import kotlinx.serialization.Serializable

interface Reading {
    val id: Int
    val dateTime: FixMeDateTime
    val location: TestSite
    val value: ReadingFormat
    val note: String?
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
