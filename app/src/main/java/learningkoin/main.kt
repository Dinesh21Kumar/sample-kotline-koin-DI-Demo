package learningkoin

import org.koin.core.context.startKoin
import org.koin.dsl.module

fun main(vararg args: String) {

    startKoin {
        // use Koin logger
        printLogger()
        // declare modules
        val helloModule = module {
            //single { HelloMessageData() }
            single { HelloServiceImpl( HelloMessageData() ) as HelloService }
        }
        modules(helloModule)
    }

    HelloApplication().sayHello()
}