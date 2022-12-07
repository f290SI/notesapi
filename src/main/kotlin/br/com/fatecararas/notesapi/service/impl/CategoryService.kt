package br.com.fatecararas.notesapi.service.impl

import br.com.fatecararas.notesapi.config.exceptions.ObjectNotFoundException
import br.com.fatecararas.notesapi.domain.entity.Category
import br.com.fatecararas.notesapi.domain.repository.CategoryRepository
import br.com.fatecararas.notesapi.service.ICategoryService
import org.springframework.stereotype.Service

@Service
class CategoryService(private val repository: CategoryRepository): ICategoryService {

    override
    fun salvar(category: Category): Category {
        return repository.save(category)
    }

    override
    fun buscarTodos(): List<Category> {
        val categories = repository.findAll()
        if(categories.isEmpty()) throw ObjectNotFoundException("Ainda não existem registros na API.")
        return categories
    }

    override
    fun apagar(id: Int) {
        repository.deleteById(id)
    }

    override
    fun buscarPorId(id: Int): Category {
        return repository.findById(id)
            .orElseThrow { ObjectNotFoundException("Categoria não encontrada") }
    }
}