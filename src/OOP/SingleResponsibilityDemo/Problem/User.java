package OOP.SingleResponsibilityDemo.Problem;


public class User {
    private int id;
    private String primaryEmail;
    private String secondaryEmail;
    private Role role;

    public String getSecondaryEmail() {
        return secondaryEmail;
    }

    public void setSecondaryEmail(String secondaryEmail) {
        this.secondaryEmail = secondaryEmail;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPrimaryEmail() {
        return primaryEmail;
    }

    public void setPrimaryEmail(String primaryEmail) {
        this.primaryEmail = primaryEmail;
    }
    public void sendMoney(User userTo, int dollarAmount ){
        //
    }

    public Role getRole() {
        return role;
    }
}

