package br.com.fatecararas.notesapi.domain.entity

import com.fasterxml.jackson.annotation.JsonIgnore
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.OneToMany
import javax.print.attribute.IntegerSyntax

@Entity
class Category() {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Int = 0
    var description: String = ""

    @JsonIgnore
    @OneToMany(mappedBy = "category")
    var notes: List<Note> = emptyList()

    constructor(description: String) : this() {
        this.description = description
    }
}