package com.example.purekotlineproject

import org.koin.core.context.startKoin
import org.koin.dsl.module

fun main(vararg args: String) {
    startKoin {
        val modules = module {
            single { Engine() as Engine } //objects injected to Application class
            single { Light() as Light }
        }
        modules(modules)
    }
    Application().start()
}