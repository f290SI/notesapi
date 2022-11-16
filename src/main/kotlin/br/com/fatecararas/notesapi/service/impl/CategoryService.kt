package br.com.fatecararas.notesapi.service.impl

import org.springframework.stereotype.Service

@Service
class CategoryService(private val repository: CategoryRepository ): ICategoryService {

    override fun save(category: Category): Category = repository.save(category)

    override fun findAll(): List<Category> = repository.findAll()

}