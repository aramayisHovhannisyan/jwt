package com.example.core.repository;

import java.util.Optional;

import com.example.core.entity.Role;
import com.example.core.security.ERole;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
	Optional<Role> findByName(ERole name);
}
