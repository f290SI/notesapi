package br.com.fatecararas.notesapi.config

import org.modelmapper.ModelMapper
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class AppConfig {

    @Bean
    fun getModelMapper(): ModelMapper {
        return ModelMapper()
    }
}