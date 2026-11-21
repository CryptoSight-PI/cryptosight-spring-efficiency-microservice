package school.sptech.pool_service.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import school.sptech.pool_service.entity.EficienciaMaquina;

public interface EficienciaMaquinaRepository extends JpaRepository<EficienciaMaquina, Long> {
}
