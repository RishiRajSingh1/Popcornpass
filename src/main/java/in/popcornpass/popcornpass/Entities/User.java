package in.popcornpass.popcornpass.Entities;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "Users")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor


public class User  {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Id;

    @Column(nullable = false)
    private String name;

    private String age;
    private String mobileNo;

    @Column(unique = true)
    private String emailId;

    @Column(nullable = false)
    private String password;

    @OneToMany(mappedBy = "user" , cascade = CascadeType.ALL)
    private List<Ticket> ticketList=new ArrayList<>();


}
