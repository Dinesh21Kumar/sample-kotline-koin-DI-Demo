package com.example.purekotlineproject

import org.koin.core.KoinComponent
import org.koin.core.inject

class Application : KoinComponent {
    fun start() {
        //get injected objects by koin syntax
        val eng by inject<Engine> ()
        val lights by inject<Light> ()
        val car = Car(eng,lights)
        car.start()
    }
}