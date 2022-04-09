import util.Input;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

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
    // Add
    public void addContact(){
        String name = input.getString("Enter First Name: ") +
                " " +
                input.getString("Enter Last Name: ");
        String phone = input.getString("Enter Phone Number: ");
        String email = input.getString("Enter Email: ");
        contactsManager.addLines(name + ", " + phone + ", " + email);
        contactsManager.printLines();
    }



    // Find
    public void findContactByName(String prompt){
        String name = input.getString(prompt);
        for (String line : contactsManager.getFileData()) {
            if (checkFirstName(line.toLowerCase(), name.toLowerCase())){
                System.out.println(line);
            }
        }
    }
    public void findContactByName(String prompt1, String prompt2){
        String name1 = input.getString(prompt1);
        String name2 = input.getString(prompt2);
        for (String line : contactsManager.getFileData()) {
//            System.out.println(line);
//            System.out.println(name2);
            if (
                    checkFirstName(line.toLowerCase(), name1.toLowerCase())
                    &&
                    checkLastName(line.toLowerCase(), name2.toLowerCase())){
                System.out.println(line);
            }
        }

    }

    // CHECKS
    private boolean checkFirstName(String line, String name){
        return name.equals(line.substring(0, line.indexOf(" ")));
    }
    private boolean checkLastName(String line, String name){
        return name.contains(line.substring(line.indexOf(" ") + 1, line.indexOf(",")));
    }

    public boolean checkContactExists(String name1, String name2){
        for (String line : contactsManager.getFileData()) {
            if (checkFirstName(line, name1) && checkLastName(line, name2)){
                System.out.println("That name already exists.");
                return true;
            }
        }
        return false;
    }








}
