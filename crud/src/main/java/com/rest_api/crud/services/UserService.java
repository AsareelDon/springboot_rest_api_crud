package com.rest_api.crud.services;

import org.hibernate.mapping.List;

import com.rest_api.crud.entity.UserEntity;

public interface UserService {
    List<UserEntity> findAllUser();
    UserEntity findById(Long id);
    UserEntity createUser(UserEntity userEntity);
    UserEntity updateUser(UserEntity userEntity);
    void deleteUser(Long id);
}
