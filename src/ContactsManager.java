public class ContactsManager {
    Contact[] myFriends;
    int friendsCount;
    ContactsManager() {
        this.friendsCount = 0;
        this.myFriends = new Contact[500];
    }

    //methode d'ajout de contact
    void addContact(Contact contact) {
        myFriends[friendsCount] = contact;
        friendsCount++;}

    //methode de recherche de contact
    Contact searchContact(String searchName) {
        for (int i = 0; i < friendsCount; i++) {
            if (myFriends[i].name.equals(searchName)) {
                return myFriends[i];
            }
        }
        return null;
    }
}
