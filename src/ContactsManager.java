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
}
