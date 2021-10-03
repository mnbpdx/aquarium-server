package com.aquariumserver.models

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