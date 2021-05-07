package com.smartcontact.manager.repository;

import org.springframework.data.repository.CrudRepository;

import com.smartcontact.manager.entity.Permission;

public interface PermissionInt extends CrudRepository<Permission,Integer> {

}
