package com.empresa.apikotlin

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
open class ApiKotlinApplication

fun main(args: Array<String>) {
	runApplication<ApiKotlinApplication>(*args)
}
