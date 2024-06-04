package model;

import enums.Gender;
import enums.Role;

public class User {
    private String name;
    private int age;
    private Gender gender;
    private Role role;
    private Library library;

    public User(String name, int age, Gender gender, Role role) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.role = role;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Gender getGender() {
        return gender;
    }

    public Role getRole() {
        return role;
    }

    public Library getLibrary() {
        return library;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public void setLibrary(Library library) {
        this.library = library;
    }

    @Override
    public String toString() {
        return STR."User{name='\{name}\{'\''}, age=\{age}, gender=\{gender}, role=\{role}\{'}'}";
    }
}
