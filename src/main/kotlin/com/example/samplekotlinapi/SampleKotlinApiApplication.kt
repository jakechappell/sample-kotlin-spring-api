package com.example.samplekotlinapi

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SampleKotlinApiApplication

fun main(args: Array<String>) {
	runApplication<SampleKotlinApiApplication>(*args)
}
