import java.util.List;
import java.util.ArrayList;

public class Organization {
    private String orgID;
    private String orgName;
    private String address;

    List<OrganizationRep> employs = new ArrayList<OrganizationRep>();
    List<Applicant> records = new ArrayList<Applicant>();
    List<Appeal> appeals = new ArrayList<Appeal>();

    public Organization() {
    }

    public Organization(String orgID, String orgName, String address) {
        this.orgID = orgID;
        this.orgName = orgName;
        this.address = address;
    }

    public String getOrgID() {
        return orgID;
    }

    public String getOrgName() {
        return orgName;
    }

    public String getAddress() {
        return address;
    }

    public List<OrganizationRep> getEmploys() {
        return employs;
    }

    public void setOrgID(String orgID) {
        this.orgID = orgID;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setEmploys(List<OrganizationRep> employs) {
        this.employs = employs;
    }

    // Menambahkan Employees
    public void addEmploy(OrganizationRep employ) {
        this.employs.add(employ);
    }

    public List<Applicant> getRecords() {
        return records;
    }

    public void setRecords(List<Applicant> records) {
        this.records = records;
    }

    public void addRecord(Applicant record) {
        this.records.add(record);
    }

    public List<Appeal> getAppeals() {
        return appeals;
    }

    public void setAppeals(List<Appeal> appeals) {
        this.appeals = appeals;
    }

    public void addAppeal(Appeal appeal) {
        this.appeals.add(appeal);
    }

    public Appeal finAppeal(String appealID) {
        for (Appeal appeal : appeals) {
            if (appeal.getAppealID().equals(appealID)) {
                return appeal;
            }
        }
        return null;
    }

    public Applicant findRecord(String username) {
        for (Applicant record : records) {
            if (record.getUsername().equals(username)) {
                return record;
            }
        }
        return null;
    }

    // For List Of Appeal
    public void printAppeals() {
        System.out.println("List of Appeals");
        System.out.println("====================================");
        for (Appeal appeal : appeals) {
            System.out.println("Appeal ID: " + appeal.getAppealID());
            System.out.println("Form Date: " + appeal.getFormDate());
            System.out.println("To Date: " + appeal.getToDate());
            System.out.println("Description: " + appeal.getDescription());
            System.out.println("Outcome: " + appeal.getOutcome());
            System.out.println("Organization: " + appeal.getOrganization().getOrgName());
            System.out.println("====================================");
        }
    }
}
