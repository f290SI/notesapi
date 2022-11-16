package br.com.fatecararas.notesapi.service.impl

import br.com.fatecararas.notesapi.domain.entity.Category
import br.com.fatecararas.notesapi.domain.repository.CategoryRepository
import org.springframework.stereotype.Service

@Service
class CategoryService(private val repository: CategoryRepository) {

    fun salvar(category: Category): Category {
        return repository.save(category)
    }

    fun buscarTodos(): List<Category> {
        return repository.findAll()
    }
}