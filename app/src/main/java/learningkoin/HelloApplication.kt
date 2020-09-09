package learningkoin

import org.koin.core.KoinComponent
import org.koin.core.inject

class HelloApplication  : KoinComponent {

    private val helloService by inject<HelloService>()
    fun sayHello() = println(helloService.hello())
}