package com.rest_api.crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rest_api.crud.entity.Users;

@Repository
public interface UserRepository extends JpaRepository <Users, Long> {

}
