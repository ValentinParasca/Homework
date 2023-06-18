package Phones;

import java.util.ArrayList;
import java.util.List;
abstract class PhoneBrand {
    protected String brandName;
    protected List<PhoneModel> models;

    public PhoneBrand(String brandName) {
        this.brandName = brandName;

    }

    public abstract void addModel(String modelName);

    public PhoneModel getModel(int index) {
        return models.get(index);
    }
}