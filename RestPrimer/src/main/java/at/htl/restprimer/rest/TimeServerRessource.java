package at.htl.restprimer.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import java.text.SimpleDateFormat;
import java.util.Date;


@Path("time")
public class TimeServerRessource {

    @GET
    public String time(){

        SimpleDateFormat date = new SimpleDateFormat("dd. MMMM yyyy, hh:mm:ss aaa");
        String dt = date.format(new Date());
        return "Time: " + dt;
    }

}
