import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class MediumPriorityRequest implements RequestProduct {
    private String priority;
    private String status;
    private LocalDate expireDay;

    @Override
    public void setPriority() {
        this.priority = "Medium";
    }

    @Override
    public void setStatus() {
        this.status = "Accepted";
    }

    @Override
    public void setExpire() {
        this.expireDay = LocalDate.now().plus(1, ChronoUnit.MONTHS);
    }

    @Override
    public void processRequest() {
        System.out.println("Request accept, estimated completion date is " + expireDay);
    }
}