package Phones;

interface PhoneModel extends Phone {
    void call_pn(String phoneNumber);

    void call_fn(String firstName);

    String getModelName();
}

