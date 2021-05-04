package com.codeup.lunablog.models;

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
}
