package br.com.tamawilson.records;

import java.util.Objects;

public class ExampleClass {
    private String name;
    private int age;
    private double salary;
    private boolean isActive;
    private long id;
    private float height;
    private String address;

    //Código boilerplate
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean isActive) {
        this.isActive = isActive;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }


    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        ExampleClass that = (ExampleClass) object;
        return age == that.age && Double.compare(salary, that.salary) == 0 && isActive == that.isActive && id == that.id && Float.compare(height, that.height) == 0 && Objects.equals(name, that.name) && Objects.equals(address, that.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, salary, isActive, id, height, address);
    }

    @Override
    public String toString() {
        return "ExampleClass{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                ", isActive=" + isActive +
                ", id=" + id +
                ", height=" + height +
                ", address='" + address + '\'' +
                '}';
    }
}