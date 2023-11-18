package vn.edu.iuh.fit.backend.repositories;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import vn.edu.iuh.fit.backend.models.User;

public interface UserRepository extends JpaRepository<User, Long> {
  Optional<User> findByEmailAndPasswordHash(String email, String passwordHash);

//  User findByEmailAndPassword(String email,String passwordHash );
  User findByEmail(String email);
}

