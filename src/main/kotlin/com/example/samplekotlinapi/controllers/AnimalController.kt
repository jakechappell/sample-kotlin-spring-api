package com.example.samplekotlinapi.controllers

import com.example.samplekotlinapi.models.Animal
import com.example.samplekotlinapi.repositories.IAnimalRepository
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/animals")
class AnimalController(repository: IAnimalRepository) {
    val repo: IAnimalRepository = repository

    @GetMapping
    fun getAllAnimals(): List<Animal>{
        return repo.getAllAnimals()
    }

    @GetMapping("/{id}")
    fun getAnimalById(@PathVariable id: String): Animal?{
        return repo.getAnimalById(id)
    }
}