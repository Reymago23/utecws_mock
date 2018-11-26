package com.utecws.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.utecws.entity.Response;
import com.utecws.entity.User;

public interface IUsuarioRepository extends JpaRepository<User, Long> {

	public abstract User getUserByUserAndPassword(String user, String password);
}
