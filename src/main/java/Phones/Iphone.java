package Phones;

class Iphone implements Phone {
    @Override
    public void addContact(String phoneNumber, String firstName, String lastName) {
        System.out.println("Cannot add contact. This operation is not supported by this phone.");
    }

    @Override
    public Contact getFirstContact() {
        System.out.println("Cannot get first contact. This operation is not supported by this phone.");
        return null;
    }

    @Override
    public Contact getLastContact() {
        System.out.println("Cannot get last contact. This operation is not supported by this phone.");
        return null;
    }

    @Override
    public void sendMessage(String phoneNumber, String messageContent) {
        System.out.println("Cannot send message. This operation is not supported by this phone.");
    }

    @Override
    public Message getFirstMessage(String phoneNumber) {
        System.out.println("Cannot get first message. This operation is not supported by this phone.");
        return null;
    }

    @Override
    public Message getSecondMessage(String phoneNumber) {
        System.out.println("Cannot get second message. This operation is not supported by this phone.");
        return null;
    }

    @Override
    public void call_pn(String phoneNumber) {

    }

    @Override
    public void call_fn(String phoneNumber) {
        System.out.println("Cannot make a call. This operation is not supported by this phone.");
    }

    @Override
    public void viewHistory() {
        System.out.println("Cannot view call history. This operation is not supported by this phone.");
    }
}
