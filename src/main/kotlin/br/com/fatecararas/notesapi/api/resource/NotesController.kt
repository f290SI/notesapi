package br.com.fatecararas.notesapi.api.resource

import br.com.fatecararas.notesapi.api.dto.NoteDTO
import br.com.fatecararas.notesapi.domain.entity.Note
import br.com.fatecararas.notesapi.domain.repository.NoteRepository
import org.modelmapper.ModelMapper
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.web.bind.annotation.RestController
import java.util.stream.Collectors

@RestController
@RequestMapping("/api/notes")
class NotesController(
    private val repository: NoteRepository,
    private val modelMapper: ModelMapper
) {

    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/all")
    fun getAll(): List<NoteDTO> {
        return repository.findAll()
            .stream()
            .map { note -> modelMapper.map(note, NoteDTO::class.java) }
            .collect(Collectors.toList())
    }

    @PostMapping("/new")
    @ResponseStatus(HttpStatus.CREATED)
    fun create(@RequestBody note: Note): Note {
        return repository.save(note)
    }
}