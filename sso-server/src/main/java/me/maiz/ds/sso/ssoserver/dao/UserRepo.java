package me.maiz.ds.sso.ssoserver.dao;

import me.maiz.ds.sso.ssoserver.dao.model.EmallUser;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.validation.constraints.Email;

public interface UserRepo extends JpaRepository<EmallUser,Integer> {


    EmallUser findByUsername(String username);

}
