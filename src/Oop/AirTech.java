package Oop;

public class AirTech extends AdvancedTech{
    public void Plane(){
        String type="Airbus";
        System.out.println(type);
    }
    public void Plane(int year,int model) {
        year=2019;
        model= 60318;
        int classOfthePlane= year+model;
        System.out.println(classOfthePlane);
    }

    @Override
    public void tech21() {
        super.tech21();
        System.out.println("Added new technology");
    }

    public static void main(String[] args) {
       AirTech airTech= new AirTech();
       airTech.Plane();
       airTech.Plane();
       airTech.tech21();
    }
}
