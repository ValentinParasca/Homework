package Phones;

import java.util.ArrayList;
import java.util.List;

class Iphone13 implements PhoneModel {
    ArrayList<String> list = new ArrayList<>();
    protected List<Contact> contacts = new ArrayList<>();
    protected List<Message> messages;
    protected List<String> callHistory;

    public Iphone13() {
        String modelName = "iPhone 13";
        contacts = new ArrayList<Contact>();
        messages = new ArrayList<>();
        callHistory = new ArrayList<>();
    }

    @Override
    public void addContact(String phoneNumber, String firstName, String lastName) {
        Contact contact = new Contact(phoneNumber, firstName, lastName);
        contacts.add(contact);
    }

    @Override
    public Contact getFirstContact() {
        if (contacts.isEmpty()) {
            return null;
        }
        return contacts.get(0);
    }

    @Override
    public Contact getLastContact() {
        if (contacts.isEmpty()) {
            return null;
        }
        return contacts.get(contacts.size() - 1);
    }

    @Override
    public void sendMessage(String phoneNumber, String messageContent) {
        if (messageContent.length() <= 100) {
            Contact contact = findContactByPhoneNumber(phoneNumber);
            if (contact != null) {
                Message message = new Message(contact, messageContent);
           //     messages.add(message);
                System.out.println("Message sent successfully.");
            } else {
                System.out.println("Contact not found.");
            }
        } else {
            System.out.println("Message content exceeds the maximum limit of 100 characters.");
        }
    }

    @Override
    public Message getFirstMessage(String phoneNumber) {
        Contact contact = findContactByPhoneNumber(phoneNumber);
        if (contact != null) {
            for (Message message : messages) {
                if (message.getContact().equals(contact)) {
                    return message;
                }
            }
        }
        return null;
    }

    @Override
    public Message getSecondMessage(String phoneNumber) {
        Contact contact = findContactByPhoneNumber(phoneNumber);
        if (contact != null) {
            int count = 0;
            for (Message message : messages) {
                if (message.getContact().equals(contact)) {
                    count++;
                    if (count == 2) {
                        return message;
                    }
                }
            }
        }
        return null;
    }

    @Override
    //This function is used to make a call based on PHONE NUMBER
    public void call_pn(String phoneNumber) {
        Contact contact = findContactByPhoneNumber(phoneNumber);
        if (contact != null) {
            callHistory.add(findFirstNameByPhoneNumber(phoneNumber));
            System.out.println("Call made successfully to:" + " " +phoneNumber);
        } else {
          System.out.println("Contact not found.");
        }
    }
    @Override
    //This function is used to make a call based on FIRST NAME
    public void call_fn(String firstName) {
        Contact contact = findContactByFirstName(firstName);
        if (contact != null) {
            callHistory.add(firstName);
            System.out.println("Call made successfully to:" + " " +firstName);
        } else {
            System.out.println("Contact not found.");
        }
    }

    @Override
    public void viewHistory() {
        System.out.println("Call History:");
        for (int cnt = 0;cnt<callHistory.size();cnt++) {
            System.out.println(callHistory.get(cnt));
        }
   }
    @Override
    public String getModelName() {
        return "Maine";
    }

    private Contact findContactByPhoneNumber(String phoneNumber) {
        for (Contact contact : contacts) {
            if (contact.getPhoneNumber().equals(phoneNumber)) {
                return contact;
            }
        }
        return null;
    }
    private Contact findContactByFirstName(String firstName) {
        for (Contact contact : contacts) {
            if (contact.getFirstName().equals(firstName)) {
                return contact;
            }
        }
        return null;
    }
    private String findFirstNameByPhoneNumber(String phoneNumber) {
        for (Contact contact : contacts) {
            if (contact.getPhoneNumber().equals(phoneNumber)) {
                return contact.getFirstName();
            }
        }
        return null;
    }
}
