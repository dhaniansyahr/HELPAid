import java.util.Date;

public class Goods extends Contribution {
    private String description;
    private int estimatedValue;

    public Goods(String description, int estimatedValue, Date receivedDate, String contributionID) {
        super(receivedDate, contributionID);
        this.description = description;
        this.estimatedValue = estimatedValue;
    }

    public String getDescription() {
        return description;
    }

    public int getEstimatedValue() {
        return estimatedValue;
    }
}
