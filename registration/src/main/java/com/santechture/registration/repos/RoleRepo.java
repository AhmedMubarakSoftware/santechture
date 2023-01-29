package com.santechture.registration.repos;

import com.santechture.registration.models.ERole;
import com.santechture.registration.models.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;


public interface RoleRepo extends JpaRepository<Role, Integer> {
    Optional<Role> findByName(ERole name);

}