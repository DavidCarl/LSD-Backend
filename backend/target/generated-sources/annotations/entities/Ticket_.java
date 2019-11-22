package entities;

import entities.Booking;
import entities.FlightInstance;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-11-22T22:27:28")
@StaticMetamodel(Ticket.class)
public class Ticket_ { 

    public static volatile SingularAttribute<Ticket, String> lastName;
    public static volatile SingularAttribute<Ticket, String> firstname;
    public static volatile SingularAttribute<Ticket, FlightInstance> flightInstance;
    public static volatile SingularAttribute<Ticket, Integer> Id;
    public static volatile SingularAttribute<Ticket, Booking> bookingId;

}