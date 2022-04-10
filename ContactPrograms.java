import util.Input;

import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/**
 *  CONTACT PROGRAMS
 *
 *  Description: Combines cm crud and file i/o functions into larger programs the user
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
    // Read All
    public void readAllContacts(){
        contactsManager.printLines();
    }

    // Mod Contact

    // Sort Contacts

    // Delete Contact


    // Add
    public void addContact(){
        String fName = input.getString("Enter First Name: ");
        String lName = input.getString("Enter Last Name: ");
        String phone = "";
        String email = "";

        if (checkContactExists(fName, lName)) {
            System.out.println("Would Like to Continue?  ");
            if(input.yesNo()){
                phone = input.getString("Enter Phone Number: ");
                email = input.getString("Enter Email: ");
                contactsManager.addLines(fName + " " +
                        lName + ", " + phone + ", " + email);
                contactsManager.printLines();
            } else {
                System.out.println("This function has terminated... ");
            }
        } else {
            phone = input.getString("Enter Phone Number: ");
            email = input.getString("Enter Email: ");
            contactsManager.addLines(fName + " " +
                    lName + ", " + phone + ", " + email);
            contactsManager.printLines();
        }
    }


    // Find
    public void findContactByFirstName(){
        String name = input.getString("Enter First Name: ");
        for (String line : contactsManager.getFileData()) {
            if (checkFirstName(line.toLowerCase(), name.toLowerCase())){
                System.out.println(line);
            }
        }
    }
    public void findContactByLastName(){
        String name = input.getString("Enter Last Name: ");
        for (String line : contactsManager.getFileData()) {
            if (checkLastName(line.toLowerCase(), name.toLowerCase())){
                System.out.println(line);
            }
        }
    }
    public void findContactByBothName(){
        String name1 = input.getString("Enter First Name: ");
        String name2 = input.getString("Enter Last Name: ");
        for (String line : contactsManager.getFileData()) {
            if (checkFirstName(line.toLowerCase(), name1.toLowerCase())
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
    private boolean checkContactExists(String name1, String name2){
        for (String line : contactsManager.getFileData()) {
            if (checkFirstName(line.toLowerCase(), name1.toLowerCase())
                            &&
                            checkLastName(line.toLowerCase(), name2.toLowerCase())){
                System.out.println("That contact already exists.");
                return true;
            }
        }
        return false;
    }
//    private String checkContactExists(String name1, String name2, String prompt){
//        for (String line : contactsManager.getFileData()) {
//            if (checkFirstName(line.toLowerCase(), name1.toLowerCase())
//                    &&
//                    checkLastName(line.toLowerCase(), name2.toLowerCase())){
//                System.out.println(prompt);
//                return line;
//            }
//        }
//        return "";
//    }







}
