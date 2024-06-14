package com.vscode.user.service.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "micro_users")
public class User {
    @Id
    private String userId;
    private String name;
    private String email;
    private String about;




}
