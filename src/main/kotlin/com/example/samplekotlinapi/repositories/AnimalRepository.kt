package com.example.samplekotlinapi.repositories

import com.example.samplekotlinapi.models.Animal
import org.springframework.stereotype.Component
import java.util.UUID

@Component
class AnimalRepository : IAnimalRepository{

    var animals: MutableList<Animal> = mutableListOf()

    init {
        animals.add(Animal(UUID.randomUUID().toString(), "Jeff", "Dog"))
        animals.add(Animal(UUID.randomUUID().toString(), "Jose", "Cat"))
        animals.add(Animal(UUID.randomUUID().toString(), "Gerald", "Capybara"))
    }

    override fun getAllAnimals(): List<Animal>{
        return animals
    }

    override fun getAnimalById(id: String): Animal? {
//        return animals.firstOrNull { animal: Animal -> animal.id == id }
        return animals.firstOrNull { animal: Animal -> animal.id == id }
    }

}