package concretes;

import abstracts.Animal;

public class Dog extends Animal {


    String breed;

    int humanYears;

    public Dog(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }


    @Override
    protected int getAgeInHumanYears() {
        this.humanYears = age <= 2 ? (age + 11) : (22 + ((age - 2) * 5));
        return this.humanYears;
    }

    @Override
    public String toString() {
        return "Name: " + name + "\n" +
                "Breeed: " + breed + "\n" +
                "Age in calendar years: " + age + "\n" +
                "Age in human years: " + getAgeInHumanYears();
    }

    public boolean equals(Dog dog) {
        return this.name == dog.name && this.age == dog.age && this.breed == dog.breed;
    }
}
