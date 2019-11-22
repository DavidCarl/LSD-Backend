package entities;

import java.util.TimeZone;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-11-22T20:46:42")
@StaticMetamodel(Country.class)
public class Country_ { 

    public static volatile SingularAttribute<Country, String> name;
    public static volatile SingularAttribute<Country, TimeZone> timeZone;
    public static volatile SingularAttribute<Country, Integer> Id;

}