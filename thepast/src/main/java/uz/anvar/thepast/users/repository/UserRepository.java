package uz.anvar.thepast.users.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uz.anvar.thepast.users.model.User;

@Repository
public interface UserRepository extends JpaRepository<User,Integer> {
}
