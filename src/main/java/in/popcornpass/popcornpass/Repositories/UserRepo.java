package in.popcornpass.popcornpass.Repositories;

import in.popcornpass.popcornpass.Entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<User, Integer> {
    User findByEmailId(String emailId);
}
