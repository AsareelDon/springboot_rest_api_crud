package com.rest_api.crud.services;

import java.util.List;
import java.util.Optional;

import com.rest_api.crud.entity.UserEntity;

public interface UserService {
    List<UserEntity> findAllUser();
    Optional<UserEntity> findById(Long id);
    UserEntity createUser(UserEntity userEntity);
    UserEntity updateUser(UserEntity userEntity);
    void deleteUser(Long id);
}
