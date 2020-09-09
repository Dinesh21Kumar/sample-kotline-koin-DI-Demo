package com.example.purekotlineproject

import org.koin.experimental.property.inject

class Car (val eng: Engine,val lights: Light) {
    fun start() {
        eng.start()
        lights.start()
        println("car started")
    }
}