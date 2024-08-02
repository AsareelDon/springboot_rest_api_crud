package com.rest_api.crud.services.impl;

import org.springframework.stereotype.Service;

import com.rest_api.crud.entity.UserEntity;
import com.rest_api.crud.services.UserService;

@Service
public class UserServiceImp implements UserService {

    @Override
    public UserEntity findById(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findById'");
    }

    @Override
    public UserEntity createUser(UserEntity userEntity) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'createUser'");
    }

    @Override
    public UserEntity updateUser(UserEntity userEntity) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'updateUser'");
    }

    @Override
    public void deleteUser(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteUser'");
    }

}
