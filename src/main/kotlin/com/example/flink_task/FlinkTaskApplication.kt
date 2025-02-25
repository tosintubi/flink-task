package com.example.flink_task

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class FlinkTaskApplication

fun main(args: Array<String>) {
	runApplication<FlinkTaskApplication>(*args)
}
