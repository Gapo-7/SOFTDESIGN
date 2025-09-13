public class ConcretePhoneBuilder implements PhoneBuilder {
    private Phone phone;
    public ConcretePhoneBuilder() {
        this.phone = new Phone();

    }

    @Override
    public void setBrand(String brand) {
        phone.setBrand(brand);
    }
    @Override
    public void setModel(String model) {
        phone.setModel(model);
    }
    @Override
    public void setStorage(int storage) {
        phone.setStorage(storage);
    }
    @Override
    public void setRam(int ram) {
        phone.setRam(ram);

    }
    @Override
    public void setBattery(int battery) {
        phone.setBattery(battery);
    }
    @Override
    public void set5GEnabled(boolean enabled) { phone.set5GEnabled(enabled); }


    @Override
    public Phone getPhone() {
        return phone;
    }

}