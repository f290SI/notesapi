package br.com.fatecararas.notesapi.api.dto

import br.com.fatecararas.notesapi.domain.entity.Category
import java.time.LocalDateTime

class NoteDTO() {
    var id: Long = 0L
    var note: String = ""
    var data: LocalDateTime = LocalDateTime.now()
    lateinit var category: CategoryDTO

    constructor(note: String, categoryDTO: CategoryDTO) : this() {
        this.note = note
        this.category = categoryDTO
    }
}


