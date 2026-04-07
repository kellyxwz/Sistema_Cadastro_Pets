package org.sistema.model;

import java.util.Objects;

public class Pet {

    private String name;
    private PetType type;
    private Sex Sex;
    private String address;
    private int age;
    private double weight;
    private String race;

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Pet pet = (Pet) o;
        return age == pet.age && Double.compare(weight, pet.weight) == 0 && Objects.equals(name, pet.name) && type == pet.type && Sex == pet.Sex && Objects.equals(address, pet.address) && Objects.equals(race, pet.race);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, type, Sex, address, age, weight, race);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PetType getType() {
        return type;
    }

    public void setType(PetType type) {
        this.type = type;
    }

    public Sex getSex() {
        return Sex;
    }

    public void setSex(Sex Sex) {
        this.Sex = Sex;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    @Override
    public String toString() {
        return "Pet" +
                "name='" + name + '\'' +
                ", type=" + type +
                ", Sex=" + Sex +
                ", address='" + address + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                ", race='" + race + '\'' +
                '}';
    }
}
