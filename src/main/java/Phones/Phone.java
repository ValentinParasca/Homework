package Phones;
public interface Phone {
    void addContact(String phoneNumber, String firstName, String lastName);
    Contact getFirstContact();
    Contact getLastContact();
    void sendMessage(String phoneNumber, String messageContent);
    Message getFirstMessage(String phoneNumber);
    Message getSecondMessage(String phoneNumber);

    void call_pn(String phoneNumber);

    void call_fn(String firstName);
    void viewHistory();
}
