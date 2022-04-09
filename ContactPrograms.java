/**
 *  CONTACT PROGRAMS
 *
 *  Description: Combines cm crud functions into larger programs the user
 *  within the ca menus
 */


public class ContactPrograms {

    // I
    ContactsManager contactsManager = new ContactsManager("contacts.txt", "data");

    // F

    // CON
    public ContactPrograms() {
    }



    // METHS
    // Find
    public void findContact(){
        for (String line : contactsManager.getFileData()) {
            if(line.contains("John")){
                System.out.println(line);
                continue;
            }
        }
    }










}
