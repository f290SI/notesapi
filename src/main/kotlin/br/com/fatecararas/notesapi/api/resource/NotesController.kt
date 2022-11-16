package br.com.fatecararas.notesapi.api.resource

import br.com.fatecararas.notesapi.domain.entity.Note
import br.com.fatecararas.notesapi.domain.repository.NoteRepository
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/notes")
class NotesController(private val repository: NoteRepository) {

    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/all")
    fun getAll(): List<Note> {
        return repository.findAll()
    }
}