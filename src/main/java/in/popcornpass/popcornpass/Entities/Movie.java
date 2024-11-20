package in.popcornpass.popcornpass.Entities;


import in.popcornpass.popcornpass.Enums.Genre;
import in.popcornpass.popcornpass.Enums.Language;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name="MOVIES")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor

public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private String movieName ;

    @Column(nullable = false)
    private Integer duration;

    @Column(scale = 2)
    private Double rating;

    @Enumerated(value = EnumType.STRING)
    private Genre genre;

    @Enumerated(value = EnumType.STRING)
    private Language language;


    private Date releaseDate;


    @OneToMany(mappedBy = "movie" , cascade = CascadeType.ALL)
    private List<Show> shows=new ArrayList<>();

}
