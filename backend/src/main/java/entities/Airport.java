package entities;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;

@Entity
@Table(name = "AIRPORT")
public class Airport implements Serializable {

    public Airport() {
    }

    public Airport(@NotNull @Size(min = 1, max = 2000) String name, @NotNull @Size(max = 3) String iata, @NotNull Country countryId) {
        Name = name;
        this.iata = iata;
        this.countryId = countryId;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private int Id;

    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2000)
    @Column(name = "NAME")
    private String Name;

    @Basic(optional = false)
    @NotNull
    @Size(max = 3)
    @Column(name = "IATA")
    private String iata;

    @ManyToOne
    @NotNull
    private Country countryId;

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

    public Country getCountryId() {
        return countryId;
    }

    public void setCountryId(Country countryId) {
        this.countryId = countryId;
    }
}
