import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Appeal {
    private String appealID;
    private Date formDate;
    private Date toDate;
    private String description;
    private String outcome;

    Organization organization; // Organization Return Association Relationship
    // private Contribution[] receives;
    List<Contribution> receives = new ArrayList<Contribution>(); // Contribution Return Association Relationship
    // private Disbursement[] results_in;
    List<Disbursement> results_in = new ArrayList<Disbursement>(); // Disbursement Return Association Relationship

    public Appeal(String appealID, Date formDate, Date toDate, String description, String outcome,
            Organization organization, List<Contribution> receives, List<Disbursement> results_in) {
        this.appealID = appealID;
        this.formDate = formDate;
        this.toDate = toDate;
        this.description = description;
        this.outcome = outcome;
        this.organization = organization;
        this.receives = (receives != null) ? new ArrayList<>(receives) : new ArrayList<>();
        this.results_in = (results_in != null) ? new ArrayList<>(results_in) : new ArrayList<>();
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

    public List<Contribution> getReceives() {
        return receives;
    }

    public List<Disbursement> getResults_in() {
        return results_in;
    }

    public void setAppealID(String appealID) {
        this.appealID = appealID;
    }

    public void setFormDate(Date formDate) {
        this.formDate = formDate;
    }

    public void setToDate(Date toDate) {
        this.toDate = toDate;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setOutcome(String outcome) {
        this.outcome = outcome;
    }

    public void setOrganization(Organization organization) {
        this.organization = organization;
    }

    public void setReceives(List<Contribution> receives) {
        this.receives = receives;
    }

    public void setResults_in(List<Disbursement> results_in) {
        this.results_in = results_in;
    }

    public void addContribution(Contribution contribution) {
        // Ensure contributions list is initialized
        if (receives == null) {
            receives = new ArrayList<>();
        }

        receives.add(contribution);
    }

    // public void addCashDonation(int amount, String paymentChannel, String
    // referenceNo) {
    // // Create CashDonation object
    // CashDonation cashDonation = new CashDonation(amount, paymentChannel,
    // referenceNo, new Date(),
    // "CD" + new HelpAid().randomNumber());

    // // Add contribution to the appeal
    // addContribution(cashDonation);
    // }

    // public void addGoods(String description, int estimatedValue) {
    // // Create Goods object
    // Goods goods = new Goods(description, estimatedValue, new Date(), "GD" + new
    // HelpAid().randomNumber());

    // // Add contribution to the appeal
    // addContribution(goods);
    // }

    // Overloaded method to specifically add CashDonation
    public void addContribution(CashDonation cashDonation) {
        // Ensure contributions list is initialized
        if (receives == null) {
            receives = new ArrayList<>();
        }

        receives.add(cashDonation);
    }

    // Overloaded method to specifically add Goods
    public void addContribution(Goods goods) {
        // Ensure contributions list is initialized
        if (receives == null) {
            receives = new ArrayList<>();
        }

        receives.add(goods);
    }

    public void addDisbursement(Disbursement disbursement) {
        // Ensure disbursements list is initialized
        if (results_in == null) {
            results_in = new ArrayList<>();
        }

        results_in.add(disbursement);
    }

}
