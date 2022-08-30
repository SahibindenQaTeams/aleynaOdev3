package concretes;

import abstracts.Animal;

import java.util.stream.Stream;

public class Bird extends Animal {
    boolean canTalk;

    int humanYears;

    public Bird(String name, int age, boolean canTalk) {
        super(name, age);
        this.canTalk = canTalk;
    }

    @Override
    protected int getAgeInHumanYears() {
        this.humanYears = age <= 2 ? (age + 11) : (22 + ((age - 2) * 5));
        return this.humanYears;
    }

    @Override
    public String toString() {
        return "Name: " + name + "\n" +
                "Can Talk: " + canTalk + "\n" +
                "Age in calendar years: " + age + "\n" +
                "Age in human years: " + getAgeInHumanYears();
    }

    public boolean equals(Bird bird) {
        boolean isSameName = this.name == bird.name;
        boolean isSameAge = this.age == bird.age;
        boolean isSameBreed = this.canTalk == bird.canTalk;

        return Stream.of(isSameName, isSameAge, isSameBreed).allMatch(Boolean::booleanValue);
    }
}


