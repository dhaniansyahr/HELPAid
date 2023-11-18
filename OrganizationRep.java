public class OrganizationRep extends User {
    private String jobTitle;

    public OrganizationRep(String username, String password, String fullname, String email, String mobileNo,
            String jobTitle) {
        super(username, password, fullname, email, mobileNo);
        this.jobTitle = jobTitle;
    }

    /**
     * @return String
     */
    public String getJobTitle() {
        return jobTitle;
    }

    /**
     * @param jobTitle
     */
    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }
}
