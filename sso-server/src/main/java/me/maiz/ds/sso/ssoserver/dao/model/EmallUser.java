package me.maiz.ds.sso.ssoserver.dao.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "eu_user")
@Data
public class EmallUser {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int userId;

    private String username;

    private String password;

    private Date registerTime;




}
