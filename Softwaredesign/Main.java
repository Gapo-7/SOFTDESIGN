public class Main {
    public static void main(String[] args) {
        PhoneDirector director = new PhoneDirector();

        //flagman phone
        PhoneBuilder builder = new ConcretePhoneBuilder() ;
        director.constructFlashingPhone(builder);
        Phone flagman = builder.getPhone();

        System.out.println("Флагманский : " + flagman);


        //budget phone
        builder = new ConcretePhoneBuilder() ;
        director.constructBudgetPhone(builder);
        Phone budget = builder.getPhone();

        System.out.println("Бюджетный : " + budget);

        //custom phone

        ConcretePhoneBuilder custombuilder = new ConcretePhoneBuilder() ;
        custombuilder.setBrand("Apple");
        custombuilder.setModel("Iphone 13 pro ");
        custombuilder.setStorage(2560);
        custombuilder.setRam(1024);
        custombuilder.setBattery(50000);
        custombuilder.set5GEnabled(true);

        Phone custom = custombuilder.getPhone();

        System.out.println("ручная сборка : " + custom);


    }
}
