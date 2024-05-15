package ma.fsm.jpafsm.entities;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;
@Entity
@Data @NoArgsConstructor @AllArgsConstructor

public class Role {
    @Id  @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name="DESCRIPTION")
    private String desc;
    @Column( unique=true,length = 20)
    private String roleName;
    @ManyToMany(fetch = FetchType.EAGER)
    //@JoinTable(name="USERS_ROLES")
    @ToString.Exclude
    @JsonProperty(access=JsonProperty.Access.WRITE_ONLY)
    private List<User> users=new ArrayList<>();

}
