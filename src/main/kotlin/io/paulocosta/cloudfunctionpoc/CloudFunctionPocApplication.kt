package io.paulocosta.cloudfunctionpoc

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.context.annotation.Bean
import java.util.function.Consumer
import java.util.function.Function
import java.util.function.Supplier

class Test(var name: String?) {
    constructor(): this("")
}

@SpringBootApplication
class CloudFunctionPocApplication {

    // suppliers
    @Bean
    fun testSup(): () -> Test {
        return { Test("hai") }
    }

    @Bean
    fun testSup2(): Supplier<Test> {
        return Supplier { Test("Hai") }
    }

    // consumer
    @Bean
    fun testCons(): (Test) -> Unit {
        return {}
    }

    @Bean
    fun testCons1(): Consumer<Test> {
        return Consumer {  }
    }

    // function
    @Bean
    fun testFunc(): (Test) -> Test {
        return { x -> x }
    }

    @Bean
    fun testFunc1(): Function<Test, Test> {
        return Function { x -> x }
    }

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            SpringApplication.run(CloudFunctionPocApplication::class.java, *args)
        }
    }

}

