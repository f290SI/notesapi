package br.com.fatecararas.notesapi.domain.repository

import br.com.fatecararas.notesapi.domain.entity.Note
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface NoteRepository: JpaRepository<Note, Long> {
}