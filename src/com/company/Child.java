package com.company;

public class Child extends Person{
     private String kindergarten;
     private String nameParents;

    public Child(String kindergarten, String nameParents, String name, int age, String gender){
        super(name, age, gender);
        this.kindergarten = kindergarten;
        this.nameParents = nameParents;
    }


    public String getKindergarten() {
        return kindergarten;
    }

    public String getNameParents() {
        return nameParents;
    }

    @Override
    public String toString() {
        return "Child{" +" name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", gender='" + getGender() + '\'' +
                "kindergarten='" + kindergarten + '\'' +
                ", nameParents='" + nameParents + '\'' +
                '}';
    }
}
