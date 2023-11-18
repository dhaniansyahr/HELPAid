import java.util.Date;

public class Contribution {
    private Date receivedDate;
    private String contributionID;

    public Contribution(Date receivedDate, String contributionID) {
        this.receivedDate = receivedDate;
        this.contributionID = contributionID;
    }

    public Date getReceivedDate() {
        return receivedDate;
    }

    public String getContributionID() {
        return contributionID;
    }

    public void setReceivedDate(Date receivedDate) {
        this.receivedDate = receivedDate;
    }

    public void setContributionID(String contributionID) {
        this.contributionID = contributionID;
    }
}
