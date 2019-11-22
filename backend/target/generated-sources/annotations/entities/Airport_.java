package entities;

import entities.Country;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-11-22T20:46:42")
@StaticMetamodel(Airport.class)
public class Airport_ { 

    public static volatile SingularAttribute<Airport, String> iata;
    public static volatile SingularAttribute<Airport, Integer> Id;
    public static volatile SingularAttribute<Airport, Country> countryId;
    public static volatile SingularAttribute<Airport, String> Name;

}