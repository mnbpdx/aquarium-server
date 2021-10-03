package com.aquariumserver.models

import com.aquariumserver.models.sensors.ReadingFormat
import com.aquariumserver.models.sensors.Sensor
import com.aquariumserver.models.sensors.TemperatureReading
import com.aquariumserver.models.sensors.TemperatureSensor

val testTemperatureSensor = TemperatureSensor(
    5,
    listOf(TemperatureReading(4, MyDateTime(5, 3, 4, 5, 6), ReadingFormat.Temperature(75.5F), Aquarium(4)))
)
val testTemperatureSensorStorage = mutableListOf<TemperatureSensor>() as MutableList<Sensor>
val testTemperatureReadingStorage = mutableListOf<TemperatureReading>()
val testSensorStorage: List<MutableList<Sensor>> = listOf(testTemperatureSensorStorage).toList()

interface FixMeDateTime {
    val year: Int
    val month: Int
    val day: Int
    val hour: Int
    val minute: Int
}

class MyDateTime(
    override val year: Int,
    override val month: Int,
    override val day: Int,
    override val hour: Int,
    override val minute: Int
) : FixMeDateTime
