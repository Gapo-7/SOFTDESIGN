public interface PhoneBuilder {

        void setBrand(String brand);
        void setModel(String model);
        void setStorage(int storage);
        void setRam(int ram);
        void setBattery(int battery);
        void set5GEnabled(boolean enabled);

    Phone getPhone();

}