/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package asm2_ap;

/**
 *
 * @author Hoang Ca
 */
public class AnimalManagement {
    private Animal[] animals;

    public AnimalManagement() {
        animals = new Animal[0];
    }

   public void addAnimal(int id, String name, int age, double wingSpan) {
    Animal bird = new Bird(id, name, age, wingSpan);
    Animal[] newAnimals = new Animal[animals.length + 1];
    for (int i = 0; i < animals.length; i++) {
        newAnimals[i] = animals[i];
    }
    newAnimals[newAnimals.length - 1] = bird;
    animals = newAnimals;
}

    public void deleteAnimal(int id) {
    int index = -1;
    for (int i = 0; i < animals.length; i++) {
        if (animals[i] != null && animals[i].getId() == id) {
            index = i;
            break;
        }
    }
    if (index != -1) {
        animals[index] = null;
        for (int i = index; i < animals.length - 1; i++) {
            animals[i] = animals[i + 1];
        }
        animals[animals.length - 1] = null;
    }
}


    public void updateAnimal(Animal animal) {
        for (int i = 0; i < animals.length; i++) {
            if (animals[i].getId() == animal.getId()) {
                animals[i] = animal;
                break;
            }
        }
    }

    public Animal[] getAnimals() {
        return animals;
    }
    
    public Animal searchAnimal(int id) {
        for (int i = 0; i < animals.length; i++) {
            if (animals[i].getId() == id) {
                return animals[i];
            }
        }
        return null;
    }
    
    public void displayList() {
    if (animals.length == 0) {
        System.out.println("No animals in the list.");
    } else {
        for (Animal animal : animals) {
            if (animal != null) {
                System.out.println("ID: " + animal.getId());
                System.out.println("Name: " + animal.getName());
                System.out.println("Age: " + animal.getAge());
                if (animal instanceof Bird) {
                    System.out.println("Wing span: " + ((Bird) animal).getWingSpan());
                }
                System.out.println();
            }
        }
    }
}
}