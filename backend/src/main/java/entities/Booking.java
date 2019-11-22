package entities;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.Collection;
import java.util.List;

@Entity
@Table(name = "BOOKING")
public class Booking implements Serializable {
    public Booking() {
    }

    public Booking(@NotNull @Size(min = 0) double price, @NotNull String fnncc, @NotNull String pnr, Ticket ticket) {
        this.price = price;
        this.fnncc = fnncc;
        this.pnr = pnr;
        this.ticket = ticket;
    }

    @Id
    @NotNull
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id;

    @Basic(optional = false)
    @NotNull
    @Size(min = 0)
    @Column(name = "PRICE")
    private double price;

    @Basic(optional = false)
    @NotNull
    @Column(name = "FNNCC")
    private String fnncc;

    @Basic(optional = false)
    @NotNull
    @Column(name = "PNR")
    private String pnr;

    @ManyToOne
    private Ticket ticket;

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getFnncc() {
        return fnncc;
    }

    public void setFnncc(String fnncc) {
        this.fnncc = fnncc;
    }

    public String getPnr() {
        return pnr;
    }

    public void setPnr(String pnr) {
        this.pnr = pnr;
    }

    public Ticket getTicket() {
        return ticket;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }
}
