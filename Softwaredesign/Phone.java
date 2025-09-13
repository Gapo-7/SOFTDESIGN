public class Phone {
    private  String brand ;
    private  String model ;
    private  int storage;
    private  int ram ;
    private  int battery ;
    private boolean is5GEnabled;

   public void  setBrand(String brand ) { this.brand = brand ; }
   public void setModel(String model) { this.model = model ; }
   public void setStorage(int storage) { this.storage = storage ; }
   public void setRam(int ram) { this.ram = ram ; }
    public void setBattery(int battery ) { this.battery = battery ; }
    public void set5GEnabled(boolean enabled) { this.is5GEnabled = enabled; }

    public String getBrand() { return brand ; }
    public String getModel() { return model ; }
    public int getStorage() { return storage ; }
    public int getRam() { return ram ; }
    public int getBattery() { return battery ; }
    public boolean is5GEnabled() { return is5GEnabled; }


    @Override
    public String toString() {
        return "Phone{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", storage=" + storage + "GB" +
                ", ram=" + ram + "GB" +
                ", battery=" + battery + "mAh" +
                ", 5G=" + is5GEnabled +
                '}';
    }
}