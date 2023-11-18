import java.util.List;

public class Applicant extends User {
    private String IDno;
    private String address;
    private String householdIncome;

    List<Document> submits;

    public Applicant(String username, String password, String fullname, String email, String mobileNo, String IDno,
            String address, String householdIncome) {
        super(username, password, fullname, email, mobileNo);
        this.IDno = IDno;
        this.address = address;
        this.householdIncome = householdIncome;
    }

    public String getIDno() {
        return IDno;
    }

    public String getAddress() {
        return address;
    }

    public String getHouseholdIncome() {
        return householdIncome;
    }

    public void setIDno(String IDno) {
        this.IDno = IDno;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setHouseholdIncome(String householdIncome) {
        this.householdIncome = householdIncome;
    }

    public List<Document> getSubmits() {
        return submits;
    }

    public void setSubmits(List<Document> submits) {
        this.submits = submits;
    }

    public void addSubmit(Document submit) {
        this.submits.add(submit);
    }

    @Override
    public String toString() {
        return "Applicant \naddress = " + address + ",\nhouseholdIncome = " + householdIncome + ",\nIDno = " + IDno
                + "\n";
    }
}
