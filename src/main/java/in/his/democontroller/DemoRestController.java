package in.his.democontroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

@RestController
public class DemoRestController {

    @GetMapping(value = "/getMsg")
    public String getMsg() {
        return "Hello Nilesh";
    }

    @GetMapping(value = "/getMsg/{msg}")
    public String getMsgByUrl(@PathVariable String msg) {
        return "Hello " + msg;
    }

    @GetMapping(value = "/time")
    public String getTime(){
        LocalTime now = LocalTime.now();
        String time = now.format(DateTimeFormatter.ofPattern("hh:mm:ss"));
        System.out.println("Time: "+time);
        return time;
    }
}
