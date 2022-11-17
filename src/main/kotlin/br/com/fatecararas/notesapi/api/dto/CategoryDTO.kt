package br.com.fatecararas.notesapi.api.dto

import com.fasterxml.jackson.annotation.JsonIgnore

class CategoryDTO {
    var id: Int = 0
    var description: String = ""
    @JsonIgnore
    var notes: List<NoteDTO> = emptyList()
}


