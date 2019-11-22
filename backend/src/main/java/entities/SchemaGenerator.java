package entities;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.TimeZone;

public class SchemaGenerator {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("sebastian");
        EntityManager em = emf.createEntityManager();
        System.out.println(em.getReference(FlightInstance.class, 7));
    }

    public static void basicSetup(EntityManager em){
        entities.Flight flight1 = new entities.Flight(200, 341);
        entities.Flight flight2 = new entities.Flight(200, 298);
        entities.Country country1 = new entities.Country("Denmark", TimeZone.getTimeZone("Europe/Copenhagen"));
        entities.Country country2 = new entities.Country("Sweden", TimeZone.getTimeZone("Europe/Stockholm"));
        entities.Airport airport1 = new entities.Airport("Copenhagen", "cph", country1);
        entities.Airport airport2 = new entities.Airport("Stockholm", "arn", country2);
        entities.Airline airline = new entities.Airline("SAS", "AS", new ArrayList<>());
        airline.getFlightId().add(flight1);
        airline.getFlightId().add(flight2);
        entities.FlightInstance fi = new FlightInstance(flight1.getCapacity(), 200.0, "Monday", new Timestamp(10000l), new Timestamp(100000l), airport1, airport2, flight1);

        em.getTransaction().begin();
        em.persist(flight1);
        em.persist(flight2);
        em.persist(country1);
        em.persist(country2);
        em.persist(airport1);
        em.persist(airport2);
        em.persist(fi);
        em.persist(airline);
        em.getTransaction().commit();
    }
}
