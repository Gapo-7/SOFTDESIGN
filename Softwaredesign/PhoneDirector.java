public class PhoneDirector {

    public void constructFlashingPhone(PhoneBuilder builder) {

        builder.setBrand("Samsung");
        builder.setModel("Galaxy S25 Ultra");
        builder.setStorage(512);
        builder.setRam(12);
        builder.setBattery(5000);
        builder.set5GEnabled(true);

    }
    public void constructBudgetPhone(PhoneBuilder builder) {
        builder.setBrand("Xiaomi");
        builder.setModel("Redmi 15C");
        builder.setStorage(128);
        builder.setRam(8);

        builder.setBattery(5000);
        builder.set5GEnabled(false);

    }
}