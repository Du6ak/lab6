package lab6.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import lab6.entity.Group;

public interface GroupRepository extends JpaRepository<Group, Long> {

	Group findByName(String name);

}
