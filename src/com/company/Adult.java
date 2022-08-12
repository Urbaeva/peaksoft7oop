package com.company;

public class Adult extends Person{
    private int childNum;
    private boolean married;
    private int salary;

    @Override
    public String toString() {
        return "Adult{" + "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", gender='" + getGender() + '\'' +
                "childNum=" + childNum +
                ", married=" + married +
                ", salary=" + salary +
                '}';
    }

    public Adult(int childNum, boolean married, int salary, String name, int age, String gender){
        super(name, age, gender);
        this.childNum = childNum;
        this.married = married;
        this.salary = salary;
    }

    public int getChildNum() {
        return childNum;
    }

    public boolean isMarried() {
        return married;
    }

    public int getSalary() {
        return salary;
    }
}
