public class User {
    private String username;
    private String password;
    private String fullname;
    private String email;
    private String mobileNo;

    public User(String username, String password, String fullname, String email, String mobileNo) {
        this.username = username;
        this.password = password;
        this.fullname = fullname;
        this.email = email;
        this.mobileNo = mobileNo;
    }

    /**
     * @return String
     */
    public String getUsername() {
        return username;
    }

    /**
     * @return String
     */
    public String getPassword() {
        return password;
    }

    /**
     * @return String
     */
    public String getFullname() {
        return fullname;
    }

    /**
     * @return String
     */
    public String getEmail() {
        return email;
    }

    /**
     * @return String
     */
    public String getMobileNo() {
        return mobileNo;
    }

    /**
     * @param username
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @param fullname
     */
    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    /**
     * @param email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @param mobileNo
     */
    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    @Override
    public String toString() {
        return "Username: " + username + "\nPassword: " + password + "\nFullname: " + fullname + "\nEmail: " + email
                + "\nMobile No: " + mobileNo;
    }
}
