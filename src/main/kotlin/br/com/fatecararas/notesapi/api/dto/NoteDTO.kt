package br.com.fatecararas.notesapi.api.dto

import java.time.LocalDateTime

class NoteDTO {
    private var id: Long = 0L
    private var note: String = ""
    private var data: LocalDateTime = LocalDateTime.now()

    constructor(id: Long, note: String, data: LocalDateTime) {
        this.id = id
        this.note = note
        this.data = data
    }

    constructor(){}
}


