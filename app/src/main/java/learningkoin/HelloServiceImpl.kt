package learningkoin

interface HelloService {
    fun hello(): String
}
class HelloServiceImpl (val helloMessageData: HelloMessageData ) : HelloService{
    override fun hello(): String {
        return "Hey, ${helloMessageData.message}"
    }
}