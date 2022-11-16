package br.com.fatecararas.notesapi.domain.repository

import br.com.fatecararas.notesapi.domain.entity.Category
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface CategoryRepository: JpaRepository<Category, Int> {
}