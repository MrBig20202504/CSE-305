import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class HighPriorityRequest implements RequestProduct {
    private String priority;
    private String status;
    private LocalDate expireDay;

    @Override
    public void setPriority() {
        this.priority = "Emergency";
    }

    @Override
    public void setStatus() {
        this.status = "Accept";
    }

    @Override
    public void setExpire() {
        this.expireDay = LocalDate.now();
    }

    @Override
    public void processRequest() {
        System.out.println("Emergency request, our Administer will contact you immediately!");
    }
}