package entities;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Entity
@Table(name = "TICKET")
public class Ticket implements Serializable {
    public Ticket() {
    }

    public Ticket(@NotNull String firstname, @NotNull String lastName, @NotNull FlightInstance flightInstance, @NotNull Booking booking) {
        this.firstname = firstname;
        this.lastName = lastName;
        this.flightInstance = flightInstance;
        this.booking = booking;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    private int Id;

    @NotNull
    @Column(name = "FIRSTNAME")
    private String firstname;

    @NotNull
    @Column(name = "LASTNAME")
    private String lastName;

    @NotNull
    @ManyToOne
    private FlightInstance flightInstance;

    @ManyToOne
    @NotNull
    private Booking booking;


    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public FlightInstance getFlightInstance() {
        return flightInstance;
    }

    public void setFlightInstance(FlightInstance flightInstance) {
        this.flightInstance = flightInstance;
    }

    public Booking getBooking() {
        return booking;
    }

    public void setBooking(Booking booking) {
        this.booking = booking;
    }
}
