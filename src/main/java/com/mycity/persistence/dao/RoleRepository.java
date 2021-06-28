package com.mycity.persistence.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mycity.persistence.model.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {

    Role findByName(String name);

    @Override
    void delete(Role role);

}
