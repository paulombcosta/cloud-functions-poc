package io.paulocosta.cloudfunctionpoc

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.context.annotation.Bean
import java.util.function.Function

class Test(var name: String?) {
    constructor(): this("")
}

@SpringBootApplication
class CloudFunctionPocApplication {

    @Bean
    fun test(): (Test) -> Test {
        return {it}
    }

    @Bean
    fun test2(): Function<Test, Test> {
        return Function { x -> x }
    }

//    @Bean
//    fun test(): Function<Message<Test>, Message<Test>> {
//        return Function { x -> x }
//    }

//    @Bean
//    fun test2(): () -> Test {
//        return { Test("hai") }
//    }
//
//    @Bean
//    fun test3(): Function<Test, Test> {
//        return Function { x -> x }
//    }

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            SpringApplication.run(CloudFunctionPocApplication::class.java, *args)
        }
    }

}

