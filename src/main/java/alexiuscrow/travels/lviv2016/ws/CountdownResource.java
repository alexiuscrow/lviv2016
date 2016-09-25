package alexiuscrow.travels.lviv2016.ws;

import alexiuscrow.travels.lviv2016.models.Time;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.Period;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("countdown")
public class CountdownResource {

    @GET
    public Time getCountdown() {
        DateTimeZone UKRAINE = DateTimeZone.forID("Europe/Kiev");
        DateTime start = new DateTime();
        DateTime end = new DateTime(2016, 9, 29, 18, 50, 0, UKRAINE);
        Period period = new Period(start, end);
        Time result = new Time();
        result.setTitle("Time to dispatch to Lviv");
        result.setTime(String.format("Days: %d, Hours: %d, Minutes: %d",
                period.getDays(), period.getHours(), period.getMinutes()));
        return result;
    }
}
