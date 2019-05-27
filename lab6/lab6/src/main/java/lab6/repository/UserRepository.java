package lab6.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import lab6.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

    User findByUsername(String username);

}
