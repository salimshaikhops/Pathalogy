package com.pathalogy.repository;

import org.springframework.data.repository.CrudRepository;

import com.pathalogy.entities.Test;

public interface TestInt extends CrudRepository<Test,Integer> {

}
