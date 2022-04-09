package pietrekpl.userRegistrationAndLogin.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pietrekpl.userRegistrationAndLogin.model.User;



@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
