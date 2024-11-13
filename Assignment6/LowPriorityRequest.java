import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class LowPriorityRequest implements RequestProduct {
    private String priority;
    private String status;
    private LocalDate expireDay;

    @Override
    public void setPriority() {
        this.priority = "Ignore";
    }

    @Override
    public void setStatus() {
        this.status = "Done";
    }

    @Override
    public void setExpire() {
        this.expireDay = LocalDate.now();
    }

    @Override
    public void processRequest() {
        System.out.println("Request denied");
    }
}
