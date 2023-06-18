package Phones;

public class Main {
    public static void main(String[] args) {
        Phone phone1 = new Iphone();

        Phone phone = new Iphone13();

        phone.addContact("0740205060", "Ionut", "Popescu");
        phone.addContact("0740205061", "Vasile", "Chirila");
        phone.addContact("0787654321", "Maria", "Nica");

        Contact firstContact = phone.getFirstContact();
        System.out.println("First Contact: " + firstContact);

        Contact lastContact = phone.getLastContact();
        System.out.println("Last Contact: " + lastContact);

        phone.sendMessage("1", "Hello, John!");

        Message firstMessage = phone.getFirstMessage("1");
        System.out.println("First Message: " + firstMessage);

        Message secondMessage = phone.getSecondMessage("1");
        System.out.println("Second Message: " + secondMessage);

        phone.call_pn("0740205060");
        phone.call_pn("0740205061");
        phone.call_fn("Maria");
        phone.call_fn("Vasile");

        phone.viewHistory();
    }
}