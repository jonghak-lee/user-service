package kr.pe.jonghak.example.user.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;

@Entity
@Data
public class User {

    @Id
    private String id;
    @NotNull
    private String password;
    @NotNull
    private String name;
    @Email
    private String email;
}
