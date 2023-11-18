public class OrganizationRep extends User {
    private String jobTitle;
    Organization employOrganization; // Organization Return Association Relationship

    public OrganizationRep(String username, String password, String fullname, String email, String mobileNo,
            String jobTitle, Organization employOrganization) {
        super(username, password, fullname, email, mobileNo);
        this.jobTitle = jobTitle;
        this.employOrganization = employOrganization;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public Organization getEmployOrganization() {
        return employOrganization;
    }
}
