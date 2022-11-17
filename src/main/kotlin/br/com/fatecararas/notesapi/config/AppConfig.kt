package br.com.fatecararas.notesapi.config

import org.modelmapper.ModelMapper
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class AppConfig {

    @Bean
    fun getModelMapper(): ModelMapper {

        val modelMapper = ModelMapper()

        modelMapper.configuration
            .setFieldMatchingEnabled(true).fieldAccessLevel = org.modelmapper.config.Configuration.AccessLevel.PRIVATE

        return modelMapper
    }
}