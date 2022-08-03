package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

import com.example.demo.entities.Role;
import com.example.demo.entities.RoleName;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(RoleName roleName);
}