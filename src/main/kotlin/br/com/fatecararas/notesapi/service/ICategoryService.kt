package br.com.fatecararas.notesapi.service

import br.com.fatecararas.notesapi.domain.entity.Category

interface ICategoryService {
    fun salvar(category: Category): Category
    fun buscarTodos(): List<Category>
    fun apagar(id: Int)
    fun buscarPorId(id: Int): Category
}