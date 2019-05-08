package com.handcoding.entity;

import javax.persistence.*;

@Entity
@Table(name = "User")
public class User {
    @Column(name = "name")
    private String name;

    @Column(name = "password")
    private String password;

    @Column(name = "email")
    private String email;

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String toString(){
        StringBuilder builder = new StringBuilder();
        builder.append(" user : [ ");
        if(id!=null)
        {
            builder.append(" id : ");
            builder.append(id);
        }
        if(name!=null)
        {
            builder.append(" name : ");
            builder.append(name);
        }
        if(email!=null)
        {
            builder.append(" email : ");
            builder.append(email);
        }
        if(id!=null)
        {
            builder.append(" password : ");
            builder.append(password);
        }
        builder.append(" ]");
        return builder.toString();
    }
}
