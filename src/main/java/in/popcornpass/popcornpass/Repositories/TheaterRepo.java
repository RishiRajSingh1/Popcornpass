package in.popcornpass.popcornpass.Repositories;

import in.popcornpass.popcornpass.Entities.Theater;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TheaterRepo extends JpaRepository<Theater, Integer> {
    Theater findByAddress(String address);

}
