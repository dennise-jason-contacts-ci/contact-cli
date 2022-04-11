import util.Input;


/**
 *  CONTACT APPLICATION
 *
 *  Description: Provides user with menus, calls program according to user selection,
 *               includes overall application run and terminate function
 */

public class ContactApplication {

    // I
    ContactPrograms contactPrograms = new ContactPrograms();
    Input input = new Input();

    // F

    // CON

    // METH
    // Run App
    public void runApp(){
        appGreeting();
        while(appMenuActions(appMenu()));
    }

    // Greeting
    private void appGreeting(){
        System.out.println("<--------------------(^>,<^)------------------->\n" +
                "Welcome to our Contacts Application!!!\n" +
                "<---------------------------------------------->"
        );
    }

    // Menu
    private int appMenu(){
        return input.getInt(1, 6, "" +
                        "Please select an option from the list.\n" +
                        "--> Must Select a Number <--\n" +
                        "1. View All Contacts\n" +           //  <-- will need to be sorted later!
                        "2. View A Contact\n" +
                        "3. Add Contact\n" +
                        "4. Edit Contact\n" +
                        "5. Delete Contact\n" +
                        "6. Exit App\n" +
                        "<---------------------------------------------->\n"
        );
    }

    // Menu action
    private boolean appMenuActions(int appMenuSelection){
        switch (appMenuSelection){
            case 1:
                contactPrograms.readAllContacts();
                return true;
            case 2:
                contactPrograms.findContactByBothName(true);
                return true;
            case 3:
                contactPrograms.addContact();
                return true;
            case 4:
                contactPrograms.modContact();
                return true;
            case 5:
                contactPrograms.deleteContact();
                return true;
            case 6:
                appTerminated();
                return false;
        }
        return true;
    }


    // Exit
    private void appTerminated(){
        System.out.println("Contacts Application is Terminated. \n" +
                "<--------------------(^>,<^)------------------->");

    }



}
