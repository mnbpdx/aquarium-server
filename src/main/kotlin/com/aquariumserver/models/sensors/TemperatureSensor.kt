package com.aquariumserver.models.sensors

import com.aquariumserver.models.FixMeDateTime
import com.aquariumserver.models.TestSite
import kotlinx.serialization.Serializable

// Yeah I know its called a thermometer but you know
@Serializable
data class TemperatureSensor(
    override val id: Int,
    override val readings: List<TemperatureReading>
) : Sensor

@Serializable
data class TemperatureReading(
    override val id: Int,
    override val dateTime: FixMeDateTime, // use proper DateTime here
    override val value: ReadingFormat.Temperature,
    override val location: TestSite,
    override val note: String? = null
) : Reading

/*// DEMO
fun getTempFromSensor(): Float = 78.3F

val temperature = getTempFromSensor()

val firstReading =
    TemperatureReading(
        1234,
        MyDateTime(2021, 10, 2, 5, 58),
        ReadingFormat.Temperature(temperature),
        Aquarium(3), null
    )*/
