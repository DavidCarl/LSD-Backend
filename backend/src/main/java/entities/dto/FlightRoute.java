package entities.dto;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.Collection;

@Entity
@Table( name = "FLIGHTROUTE")
public class FlightRoute {
    public FlightRoute(boolean directFlight, Collection<Flight> flights) {
        this.directFlight = directFlight;
        this.flights = flights;
    }

    public FlightRoute() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    int id;

    @NotNull
    @Basic(optional = false)
    @Column(name = "DIRECTFLIGHT")
    private boolean directFlight;

    @ManyToMany
    private Collection<Flight> flights;

    public FlightRoute(contract.dto.FlightRoute fr) {
        this.directFlight = fr.isDirectFlight();
        this.flights = new ArrayList();
        for (contract.dto.Flight f: fr.getFlights()) {
            this.flights.add(new Flight(f));
        }
    }

    public contract.dto.FlightRoute toDto() {
        Collection<contract.dto.Flight> tmp = new ArrayList();
        for (Flight f: this.getFlights()) {
            tmp.add(f.toDto());
        }

        return new contract.dto.FlightRoute(
                this.directFlight,
                tmp
        );
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isDirectFlight() {
        return directFlight;
    }

    public void setDirectFlight(boolean directFlight) {
        this.directFlight = directFlight;
    }

    public Collection<Flight> getFlights() {
        return flights;
    }

    public void setFlights(Collection<Flight> flights) {
        this.flights = flights;
    }
}