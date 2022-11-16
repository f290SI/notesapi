package br.com.fatecararas.notesapi

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class NotesapiApplication

fun main(args: Array<String>) {
	runApplication<NotesapiApplication>(*args)
}
