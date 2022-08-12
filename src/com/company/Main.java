package com.company;

public class Main {

    public static void main(String[] args) {
        Person person = new Person("Burulai", 20, "female");
        Child child1 = new Child("Gul", "Nurila", "Zulaika", 6, "female");
        Child child2 = new Child("Kind", "Gulchehra", "Kulen", 3, "male");
        Child child3 = new Child("Best", "Bakyt", "Musya", 5, "female");
        Child child4 = new Child("Gul", "Kairat", "Asan", 2, "male");
        Child child5 = new Child("Gul", "Kairat", "Uson", 2, "male");

        Person[] people = {person, child1, child2, child3, child4, child5};
        for (Person i: people) {
            System.out.println(i);
        }
    }
}
