package com.pathalogy.repository;

import org.springframework.data.repository.CrudRepository;

import com.pathalogy.entities.Permission;

public interface PermissionInt extends CrudRepository<Permission,Integer> {

}
