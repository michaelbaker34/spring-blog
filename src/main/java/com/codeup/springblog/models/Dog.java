package com.codeup.springblog.models;

import javax.persistence.*;

@Entity
@Table(name = "dogs",
        uniqueConstraints = @UniqueConstraint(name = "UK_name_AND_reside_state",
                columnNames = {"name", "reside_State"}))
public class Dog {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(columnDefinition = "int(11) UNSIGNED")
    private int id;

    @Column(nullable = false, columnDefinition = "tinyint(3) UNSIGNED")
    private int age;

    @Column(nullable = false, length = 200)
    private String name;

    @Column(columnDefinition = "char(2) DEFAULT 'XX'")
    private String reside_state;

    public Dog() {
    }

    public Dog(int id, int age, String name, String reside_state) {
        this.id = id;
        this.age = age;
        this.name = name;
        this.reside_state = reside_state;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getReside_state() {
        return reside_state;
    }

    public void setReside_state(String reside_state) {
        this.reside_state = reside_state;
    }
}
