package pl.smartcases.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import pl.smartcases.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
