package entities;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.Collection;

@Entity
@Table(name = "AIRLINE")
public class Airline implements Serializable {

    public Airline() {
    }

    public Airline(@NotNull @Size(min = 1, max = 2000) String name, @Size(max = 2) String iata, Collection<Flight> flightId) {
        Name = name;
        this.iata = iata;
        this.flightId = flightId;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private int Id;

    @Basic(optional = false)
    @NotNull
    @Column(name = "NAME")
    @Size(min = 1, max = 2000)
    private String Name;

    @Basic(optional = false)
    @Size(max = 2)
    @Column(name = "IATA")
    private String iata;

    @OneToMany
    private Collection<Flight> flightId;

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getIata() {
        return iata;
    }

    public void setIata(String iata) {
        this.iata = iata;
    }

    public Collection<Flight> getFlightId() {
        return flightId;
    }

    public void setFlightId(Collection<Flight> flightId) {
        this.flightId = flightId;
    }
}
