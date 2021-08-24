package app

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
open class MockApplication

fun main() {
    runApplication<MockApplication>()
}