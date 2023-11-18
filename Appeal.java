import java.util.Date;

public class Appeal {
    private String appealID;
    private Date formDate;
    private Date toDate;
    private String description;
    private String outcome;

    Organization organization; // Organization Return Association Relationship
    private Contribution[] receives;
    private Disbursement[] results_in;

    public Appeal(String appealID, Date formDate, Date toDate, String description, String outcome,
            Organization organization, Contribution[] receives) {
        this.appealID = appealID;
        this.formDate = formDate;
        this.toDate = toDate;
        this.description = description;
        this.outcome = outcome;
        this.organization = organization;
        this.receives = receives;
    }

    public String getAppealID() {
        return appealID;
    }

    public Date getFormDate() {
        return formDate;
    }

    public Date getToDate() {
        return toDate;
    }

    public String getDescription() {
        return description;
    }

    public String getOutcome() {
        return outcome;
    }

    public Organization getOrganization() {
        return organization;
    }

    public Contribution[] getReceives() {
        return receives;
    }

    public Disbursement[] getResults_in() {
        return results_in;
    }
}
