package concretes;

import abstracts.Animal;

import java.util.stream.Stream;

public class Cat extends Animal {
    String race;

    int humanYears;

    public Cat(String name, int age, String race) {
        super(name, age);
        this.race = race;
    }

    @Override
    protected int getAgeInHumanYears() {
        this.humanYears = age <= 2 ? (age + 11) : (22 + ((age - 2) * 5));
        return this.humanYears;
    }

    @Override
    public String toString() {
        return "Name: " + name + "\n" +
                "Race: " + race + "\n" +
                "Age in calendar years: " + age + "\n" +
                "Age in human years: " + getAgeInHumanYears();
    }

    public boolean equals(Cat cat) {
        boolean isSameName = this.name == cat.name;
        boolean isSameAge = this.age == cat.age;
        boolean isSameBreed = this.race == cat.race;

        return Stream.of(isSameName, isSameAge, isSameBreed).allMatch(Boolean::booleanValue);
    }
}


