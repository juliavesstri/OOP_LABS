package LAB6.task3;

public class task3 { public static void main(String[] args) {
    Animal[] animals = new Animal[3];

    animals[0] = new Animal();
    animals[0].setName("Dog");
    animals[0].setSound("Bark");

    animals[1] = new Animal();
    animals[1].setName("Cat");
    animals[1].setSound("Meow");

    animals[2] = new Animal();
    animals[2].setName("Donkey");
    animals[2].setSound("Hee-haw");

    for (Animal animal : animals){
        animal.makeSound();
    }
}
}
