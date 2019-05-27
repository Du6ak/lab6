package lab6.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import lab6.entity.Kurator;

public interface KuratorRepository extends JpaRepository<Kurator, Long> {

    Kurator findByphone(String name);

    Kurator findByName(String name);

}
