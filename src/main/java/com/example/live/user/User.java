package com.example.live.user;

import jakarta.persistence.*;


@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "email")
    private String email;

    public String getEmail() {
        return email;
    }
    public String getName() {
        return name;
    }
    public Long getId() {
        return id;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

}
