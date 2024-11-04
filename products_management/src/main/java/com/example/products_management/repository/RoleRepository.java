package com.example.products_management.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.products_management.entity.Role;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role, Integer> {
    Role findByRoleName(String roleName);
}