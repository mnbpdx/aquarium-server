package com.aquariumserver.models

interface TestSite {
    val id: Int
}

data class Aquarium(override val id: Int) : TestSite
