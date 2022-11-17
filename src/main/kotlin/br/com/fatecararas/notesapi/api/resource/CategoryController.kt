package br.com.fatecararas.notesapi.api.resource

import br.com.fatecararas.notesapi.domain.entity.Category
import br.com.fatecararas.notesapi.service.impl.CategoryService
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/categories")
class CategoryController(private val service: CategoryService) {

    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/all")
    fun getAll(): List<Category> {
        return service.buscarTodos()
    }

    //16.11.22
    //Julio, Camila, Guilherme, Ricardo,Bruna, Willian, Vitor, Rubens, Jose Carlos
}