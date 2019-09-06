package com.crud.app.crudapp.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.crud.app.crudapp.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}