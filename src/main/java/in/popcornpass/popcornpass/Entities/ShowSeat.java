package in.popcornpass.popcornpass.Entities;


import in.popcornpass.popcornpass.Enums.SeatType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "SHOW_SEATS")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ShowSeat {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id ;

    private String seatNo;

    @Enumerated(value = EnumType.STRING)
    private SeatType seatType;

    private Integer price;
    private Boolean isAvailable;
    private Boolean isFoodContains;

    @ManyToOne
    @JoinColumn
    private Show show;
}
