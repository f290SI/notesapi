package br.com.fatecararas.notesapi.api.resource

import br.com.fatecararas.notesapi.domain.entity.Category
import br.com.fatecararas.notesapi.service.impl.CategoryService
import io.swagger.v3.oas.annotations.OpenAPIDefinition
import io.swagger.v3.oas.annotations.Operation
import io.swagger.v3.oas.annotations.media.Schema
import io.swagger.v3.oas.annotations.responses.ApiResponse
import io.swagger.v3.oas.annotations.responses.ApiResponses
import io.swagger.v3.oas.models.annotations.OpenAPI30
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/category")
class CategoryController(private val service: CategoryService) {

    @Operation(summary = "Obtem todas as categorias.", description = "Lorem ipsum dolor sit amet")
    @ApiResponses(value = [
        ApiResponse(responseCode = "200", description = "Operation realizada com sucesso."),
        ApiResponse(responseCode = "404", description = "Não existem registros.")
    ])
    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/all")
    fun getAll(): List<Category> {
        return service.buscarTodos()
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping()
    fun create(@RequestBody category: Category) : Category{
        return service.salvar(category)
    }

    @GetMapping("/{id}")
    fun findById(@PathVariable("id") id: Int): Category {
        return service.buscarPorId(id)
    }

    @DeleteMapping("/{id}")
    fun deleteById(@PathVariable("id") id: Int) {
        return service.apagar(id)
    }

    //16.11.22
    //Julio, Camila, Guilherme, Ricardo,Bruna, Willian, Vitor, Rubens, Jose Carlos
}