package entities;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.sql.Timestamp;

@Entity
@Table(name = "FLIGHTINSTANCE")
public class FlightInstance implements Serializable {
    public FlightInstance() {
    }

    public FlightInstance(@NotNull @Size(min = 1, max = 290) int seats, @NotNull @Size(min = 0, max = 200000) double price, @NotNull String day, @NotNull Timestamp depTime, @NotNull Timestamp arrTime, @NotNull Airport destAirport, @NotNull Airport origginAirport, @NotNull Flight flightId) {
        this.seats = seats;
        this.price = price;
        this.day = day;
        this.depTime = depTime;
        this.arrTime = arrTime;
        this.destAirport = destAirport;
        this.origginAirport = origginAirport;
        this.flightId = flightId;
    }

    @Id
    @NotNull
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id;

    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 290)
    @Column(name = "SEATS")
    private int seats;

    @Basic(optional = false)
    @NotNull
    @Size(min = 0, max = 200000)
    @Column(name = "PRICE")
    private double price;

    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "DAY")
    private String day;

    @Basic(optional = false)
    @NotNull
    @Column(name = "DEPARTURETIME")
    private Timestamp depTime;

    @Basic(optional = false)
    @NotNull
    @Column(name = "ARRIVALTIME")
    private Timestamp arrTime;

    @ManyToOne
    @NotNull
    private Airport destAirport;

    @ManyToOne
    @NotNull
    private Airport origginAirport;

    @ManyToOne
    @NotNull
    private Flight flightId;


    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public Timestamp getDepTime() {
        return depTime;
    }

    public void setDepTime(Timestamp depTime) {
        this.depTime = depTime;
    }

    public Timestamp getArrTime() {
        return arrTime;
    }

    public void setArrTime(Timestamp arrTime) {
        this.arrTime = arrTime;
    }

    public Airport getDestAirport() {
        return destAirport;
    }

    public void setDestAirport(Airport destAirport) {
        this.destAirport = destAirport;
    }

    public Airport getOrigginAirport() {
        return origginAirport;
    }

    public void setOrigginAirport(Airport origginAirport) {
        this.origginAirport = origginAirport;
    }

    public Flight getFlightId() {
        return flightId;
    }

    public void setFlightId(Flight flightId) {
        this.flightId = flightId;
    }
}

