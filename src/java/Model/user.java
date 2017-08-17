package Model;

public class user {
    private String NIC;
    private String fName;
    private String email;

    public user(){}
    
    public user(String NIC, String fName, String email) {
        this.NIC = NIC;
        this.fName = fName;
        this.email = email;
    }
    public String getNIC() {
        return NIC;
    }

    public void setNIC(String NIC) {
        this.NIC = NIC;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    
}
