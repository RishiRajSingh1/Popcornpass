package in.popcornpass.popcornpass.Repositories;

import in.popcornpass.popcornpass.Entities.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TicketRepo extends JpaRepository<Ticket,Integer> {
}
