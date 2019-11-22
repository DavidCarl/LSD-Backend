package entities;

import entities.Ticket;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-11-22T20:46:42")
@StaticMetamodel(Booking.class)
public class Booking_ { 

    public static volatile SingularAttribute<Booking, Ticket> ticket;
    public static volatile SingularAttribute<Booking, String> pnr;
    public static volatile SingularAttribute<Booking, Double> price;
    public static volatile SingularAttribute<Booking, String> fnncc;
    public static volatile SingularAttribute<Booking, Integer> Id;

}