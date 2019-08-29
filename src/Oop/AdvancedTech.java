package Oop;

public class AdvancedTech extends TechFair {
    @Override
    public void Iphone() {
        super.Iphone();
        System.out.println("Added new technology like Siri and Face recognization");
    }
    public void tech21(){
        System.out.println("tech from 2021");
    }
    public static void main(String[] args) {
        AdvancedTech advancedTech = new AdvancedTech();
        advancedTech.Iphone();
        advancedTech.GPS();
        advancedTech.Car();
    }
}
