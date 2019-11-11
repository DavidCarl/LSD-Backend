package bean;

import contract.dto.*;
import contract.interfaces.BeanInterface;

import javax.annotation.Resource;
import javax.ejb.SessionContext;
import javax.ejb.Stateless;
import java.util.Collection;
import java.util.Date;

@Stateless(name = "Backend")
public class ContractBean implements BeanInterface {

    @Resource
    private SessionContext context;

    @Override
    public Collection<FlightRoute> getFlightRoutes(Date date, Date date1, String s, String s1, boolean b) {
        return null;
    }

    @Override
    public Booking makeBooking(Collection<Long> collection, FFNCCIdenitfier ffnccIdenitfier, Collection<Passenger> collection1) {
        return null;
    }

    @Override
    public Booking getBooking(PNRIdentifier pnrIdentifier) {
        return null;
    }

    @Override
    public boolean cancelBooking(PNRIdentifier pnrIdentifier) {
        return false;
    }

    @Override
    public String whoAmI(String s) {
        return "Hello, " + s + " I am backend!";
    }
}
