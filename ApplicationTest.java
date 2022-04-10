public class ApplicationTest {
    public static void main(String[] args) {

        ContactsManager contactsManager = new ContactsManager("contacts.txt", "data");

        ContactPrograms contactPrograms = new ContactPrograms();
//        contactPrograms.findContactByName("Enter First Name");
//        contactPrograms.findContactByName("Enter First Name", "Enter Last Name");
//        contactPrograms.checkContactExists("John", "Smith");
//        contactPrograms.addContact();
//        contactPrograms.addContact();
//        contactPrograms.readAllContacts();
        contactsManager.deleteLine("Smash Moon, 456-789-2583, moon@here.com");


    }  //  <--END MAIN

}  //  <--END
