public class Main {

    public static void main(String[] args) {

        ContactsManager myContactsManager = new ContactsManager();

        // attributs de la variable contact
        String[] name = {"zélika", "aicha", "haramatou", "zeïnab"};

        String[] phoneNumber = {
                "0788475809",
                "0102254627",
                "0788350610",
                "0707739576"
        };
        // boucle pour ajouter les contacts
        for (int i = 0; i < name.length; i++) {

            Contact contact = new Contact();

            contact.name = name[i];
            contact.phoneNumber = phoneNumber[i];

            myContactsManager.addContact(contact);
        }

    }
}