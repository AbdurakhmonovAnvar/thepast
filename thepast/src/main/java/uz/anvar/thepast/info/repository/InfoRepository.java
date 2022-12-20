package uz.anvar.thepast.info.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uz.anvar.thepast.info.model.Info;

@Repository
public interface InfoRepository extends JpaRepository<Info,Integer> {
}
