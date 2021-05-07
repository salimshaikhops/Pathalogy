package com.smartcontact.manager.repository;

import org.springframework.data.repository.CrudRepository;

import com.smartcontact.manager.entity.Test;

public interface TestInt extends CrudRepository<Test,Integer> {

}
