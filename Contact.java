/**
 *   CONTACT
 *
 *   Description:  Not sure if this will be used in the overall app.
 */

public class Contact {

    // F
    private String key;
    private String fName;
    private String lName;
    private String number;
    private String email;


    // CON
    public Contact(){}
    public Contact(String key, String fName, String lName, String number, String email) {
        this.key = key;
        this.fName = fName;
        this.lName = lName;
        this.number = number;
        this.email = email;
    }

    // GETS
    public String getKey() {
        return key;
    }
    public String getFName() {
        return fName;
    }
    public String getLName() {
        return lName;
    }
    public String getNumber() {
        return number;
    }
    public String getEmail() {
        return email;
    }

    // SETS
    public void setKey(String key) {
        this.key = key;
    }
    public void setFName(String fName) {
        this.fName = fName;
    }
    public void setLName(String lName) {
        this.lName = lName;
    }
    public void setNumber(String number) {
        this.number = number;
    }
    public void setEmail(String email) {
        this.email = email;
    }



}  //  <--END
