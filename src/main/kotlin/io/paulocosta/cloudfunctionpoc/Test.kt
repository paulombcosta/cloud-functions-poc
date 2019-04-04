package io.paulocosta.cloudfunctionpoc

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.stereotype.Service
import java.util.function.Function
import javax.annotation.PostConstruct

@Service
class FunctionTest {

    @Autowired
    @Qualifier("test")
    lateinit var f1: Function<Test, Test>

    @Autowired
    @Qualifier("test2")
    lateinit var f2: Function<Test, Test>

    @PostConstruct
    fun test() {
        f1
        f2
    }

}