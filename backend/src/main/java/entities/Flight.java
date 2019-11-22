package entities;

import com.sun.jndi.ldap.sasl.LdapSasl;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;

@Entity
@Table(name = "FLIGHT")
public class Flight implements Serializable {
    @Id
    @NotNull
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int Id;

    @NotNull
    @Basic(optional = false)
    @Column(name = "CAPACITY")
    @Size(min = 1, max = 290)
    private int capacity;

    @NotNull
    @Basic(optional = false)
    @Column(name = "IATA")
    @Size(min = 3, max = 3)
    private int iata;

    public Flight() {
        this.capacity = capacity;
    }

    public Flight(@NotNull @Size(min = 1, max = 290) int capacity, @NotNull @Size(min = 3, max = 3) int iata) {
        this.capacity = capacity;
        this.iata = iata;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getIata() {
        return iata;
    }

    public void setIata(int iata) {
        this.iata = iata;
    }
}
