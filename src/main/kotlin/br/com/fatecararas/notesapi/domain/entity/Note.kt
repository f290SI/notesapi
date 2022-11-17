package br.com.fatecararas.notesapi.domain.entity

import java.time.LocalDateTime
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.JoinColumn
import javax.persistence.ManyToOne
import javax.persistence.Table

@Entity
class Note() {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long = 0L

    @ManyToOne
    @JoinColumn(name = "category_id")
    lateinit var category: Category
    lateinit var note: String
    var data: LocalDateTime = LocalDateTime.now()

    constructor(note: String, category: Category) : this() {
        this.note = note
        this.category = category
    }

}