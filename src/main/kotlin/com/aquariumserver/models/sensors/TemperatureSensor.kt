package com.aquariumserver.models.sensors

import com.aquariumserver.models.FixMeDateTime

data class TemperatureSensor(override val id: Int, override val readings: List<TemperatureReading>) : Sensor

data class TemperatureReading(
    override val id: Int,
    override val dateTime: FixMeDateTime, //use proper DateTime here
    override val value: ReadingType.Temperature
) : Reading

/*    // DEMO
    fun getTempFromSensor(): Float = 78.3F

    val temperature = getTempFromSensor()

    val firstReading = TemperatureReading(1234, MyDateTime(2021,10,2, 5, 58), ReadingType.Temperature(temperature))
*/