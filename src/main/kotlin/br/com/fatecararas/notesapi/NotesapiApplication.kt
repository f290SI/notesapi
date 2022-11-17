package br.com.fatecararas.notesapi

import br.com.fatecararas.notesapi.domain.entity.Category
import br.com.fatecararas.notesapi.domain.entity.Note
import br.com.fatecararas.notesapi.domain.repository.CategoryRepository
import br.com.fatecararas.notesapi.domain.repository.NoteRepository
import br.com.fatecararas.notesapi.service.impl.CategoryService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class NotesapiApplication(
    private val categoryRepository: CategoryRepository,
    private val noteRepository: NoteRepository
) : CommandLineRunner {

    override fun run(vararg args: String?) {
        val c1 = Category(description = "Java")
        categoryRepository.save(c1)

        val n1 = Note(note = "Lorem ipsum dolor sit amet", category = c1)
        noteRepository.save(n1)
    }
}

fun main(args: Array<String>) {
    runApplication<NotesapiApplication>(*args)
}
