package entities;

import entities.Flight;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-11-22T20:46:42")
@StaticMetamodel(Airline.class)
public class Airline_ { 

    public static volatile SingularAttribute<Airline, String> iata;
    public static volatile CollectionAttribute<Airline, Flight> flightId;
    public static volatile SingularAttribute<Airline, Integer> Id;
    public static volatile SingularAttribute<Airline, String> Name;

}