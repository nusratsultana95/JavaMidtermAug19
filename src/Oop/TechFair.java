package Oop;

public class TechFair extends Technology2019 implements Technology{
    @Override
    public void Mobile() {
        System.out.println("Mobile-->A device to make calls & msgs");
    }
    @Override
    public void Desktop() {
        System.out.println("Desktop-->User should be able to put data and run softwares");
    }
    @Override
    public void Car() {
        System.out.println("Car-->Should have 4 wheels with an ability to transport people & goods");
    }
    @Override
    public void Watch() {
        System.out.println("Watch-->User should be able to see the time");
    }
    @Override
    public void Drone() {
        System.out.println("Drone--> It should fly through a remote control system");
    }
    public static void main(String[] args) {
    TechFair techFair = new TechFair();
        techFair.Watch();
        techFair.Mobile();
        techFair.Car();
        techFair.Desktop();
        TechForPrivateUse techForPrivateUse = new TechForPrivateUse();
        techForPrivateUse.setPassword(1234);
        System.out.println(techForPrivateUse.getPassword());
        techForPrivateUse.setAccountNumber(6785785);
        System.out.println(techForPrivateUse.getAccountNumber());
    }
}
