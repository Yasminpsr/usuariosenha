package com.facul.usuariosenha.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.facul.usuariosenha.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
