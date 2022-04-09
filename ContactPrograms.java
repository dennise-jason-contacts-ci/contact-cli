import util.Input;

import java.util.ArrayList;
import java.util.List;

/**
 *  CONTACT PROGRAMS
 *
 *  Description: Combines cm crud functions into larger programs the user
 *  within the ca menus
 */


public class ContactPrograms {

    // I
    ContactsManager contactsManager = new ContactsManager("contacts.txt", "data");
    Input input = new Input();
    // F

    // CON
    public ContactPrograms() {
    }



    // METHS
    // Find
    public void findContactByName(String prompt){
        String name = input.getString(prompt);
        for (String line : contactsManager.getFileData()) {
            if (line.contains(name)){
                System.out.println(line);
            }
        }
    }
    public void findContactByName(String prompt1, String prompt2){
        String name1 = input.getString(prompt1);
        String name2 = input.getString(prompt2);
        for (String line : contactsManager.getFileData()) {
            if (line.contains(name1) && line.contains(name2)){
                System.out.println(line);
            }
        }
    }


    // CHECKS
    public boolean checkContactExists(String name1, String name2){
        for (String line : contactsManager.getFileData()) {
            if (line.contains(name1) && line.contains(name2)){
                System.out.println("That name already exists.");
                return true;
            }
        }
        return false;
    }








}
