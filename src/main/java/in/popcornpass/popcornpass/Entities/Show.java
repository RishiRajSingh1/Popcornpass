package in.popcornpass.popcornpass.Entities;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;
import java.sql.Time;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "SHOW")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Show {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer showId;

    @Column(nullable = false)
    private Time time;

    @Column(nullable = false)
    private Date date;

    @ManyToOne
    @JoinColumn
    private Movie movie;

    @ManyToOne
    @JoinColumn
    private Theater theater;

    @OneToMany(mappedBy = "show" , cascade = CascadeType.ALL)
    private List<ShowSeat> showSeatList=new ArrayList<>();

    @OneToMany(mappedBy = "show" , cascade = CascadeType.ALL)
    private List<Ticket> ticketList=new ArrayList<>();






}
