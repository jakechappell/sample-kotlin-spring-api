package com.example.samplekotlinapi.repositories

import com.example.samplekotlinapi.models.Animal

interface IAnimalRepository {
    fun getAllAnimals(): List<Animal>
    fun getAnimalById(id: String): Animal?
}