package com.luciano.AppGym.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.luciano.AppGym.entity.Role;

@Repository
public interface RoleRepository extends CrudRepository<Role, Long>{

}