package Phones;

public class Message {
    private Contact contact;
    private String content;

    public Message(Contact contact, String content) {
        this.contact = contact;
        this.content = content;
    }

    public Contact getContact() {
        return contact;
    }

    public String getContent() {
        return content;
    }
}