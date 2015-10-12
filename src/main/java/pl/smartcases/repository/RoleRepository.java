package pl.smartcases.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import pl.smartcases.entity.Role;

public interface RoleRepository extends JpaRepository<Role, Integer> {

}
