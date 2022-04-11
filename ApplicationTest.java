public class ApplicationTest {
    public static void main(String[] args) {

        // ACTIVATION
        ContactApplication contactApplication = new ContactApplication();
        contactApplication.runApp();


//        ContactsManager contactsManager = new ContactsManager("contacts.txt", "data");
//        ContactPrograms contactPrograms = new ContactPrograms();





         /**
         * MASSIVE WAYG TESTS
//        contactPrograms.findContactByName("Enter First Name");
//        contactPrograms.findContactByName("Enter First Name", "Enter Last Name");
//        contactPrograms.checkContactExists("John", "Smith");
//        c
//        contactPrograms.addContact();
//        contactPrograms.readAllContacts();

//        contactsManager.printLines();
//        System.out.println("--------------------------------------------");
//        contactsManager.deleteLine("Smash Moon, 456-789-2583, moon@here.com");
//        System.out.println("--------------------------------------------");
//        contactsManager.printLines();
//        contactPrograms.deleteContact();

//        contactsManager.modLine("", "");

        contactPrograms.modContact();
        */

        /**
         * SUBSTRING TESTS
         *
        String x = "Jason Cameron, 123-456-7890, jason@gmail.com";
        int n = x.indexOf(",");
        int o = x.indexOf(",", n + 1);
        System.out.println(x.substring(0, n));
        System.out.println(x.substring(n + 2, o));
        System.out.println(x.substring(o + 2));
        */

        /**
         * SUBSTRING GUIDS
         *
        String str = "(a+b)*(c+d)*(e+f)";

        int first  = str.indexOf("(");
        int second = str.indexOf("(", first + 1);
        int third = str.indexOf("(", second + 1);
        System.out.println("first: " + first);
        System.out.println("second: " + second);
        System.out.println("third: " + third);
        */

    }  //  <--END MAIN

}  //  <--END
