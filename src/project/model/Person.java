package project.model;

import project.enums.Gender;

public class Person {
    private   Long id;
    private String name;
    private int age;
    private Gender gender;

    public Person(Long id, String name, int age, Gender gender) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "\n<<Person>>" +
                "\n id: " + id +
                "\n name: " + name +
                "\n age: " + age +
                "\n gender: " + gender ;
    }
}
