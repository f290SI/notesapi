package br.com.fatecararas.notesapi.config

import br.com.fatecararas.notesapi.config.exceptions.ObjectNotFoundException
import org.springframework.dao.EmptyResultDataAccessException
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.ControllerAdvice
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler
import java.time.LocalDateTime
import javax.servlet.http.HttpServletRequest

@ControllerAdvice
class ExceptionConfig: ResponseEntityExceptionHandler() {

    @ExceptionHandler(value = [(ObjectNotFoundException::class),
        (EmptyResultDataAccessException::class)])
    fun notFoundException(e: ObjectNotFoundException, request: HttpServletRequest): ResponseEntity<ApiError> {
        val apiError = ApiError(
            localDateTime = LocalDateTime.now(),
            status = HttpStatus.NOT_FOUND.value(),
            message = "Recurso não Localizado",
            error = e.message.toString(),
            path = request.requestURI
        )
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(apiError)
    }
}

data class ApiError(
    val localDateTime: LocalDateTime,
    val status: Int,
    val error: String,
    val message: String,
    val path: String
)