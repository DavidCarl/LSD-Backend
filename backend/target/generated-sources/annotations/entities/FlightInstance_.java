package entities;

import entities.Airport;
import entities.Flight;
import java.sql.Timestamp;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-11-22T20:46:42")
@StaticMetamodel(FlightInstance.class)
public class FlightInstance_ { 

    public static volatile SingularAttribute<FlightInstance, Airport> origginAirport;
    public static volatile SingularAttribute<FlightInstance, Double> price;
    public static volatile SingularAttribute<FlightInstance, Timestamp> depTime;
    public static volatile SingularAttribute<FlightInstance, Flight> flightId;
    public static volatile SingularAttribute<FlightInstance, Integer> Id;
    public static volatile SingularAttribute<FlightInstance, Airport> destAirport;
    public static volatile SingularAttribute<FlightInstance, Integer> seats;
    public static volatile SingularAttribute<FlightInstance, String> day;
    public static volatile SingularAttribute<FlightInstance, Timestamp> arrTime;

}