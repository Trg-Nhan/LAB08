interface icar{
     void Accelerate();
     void getColor(String color);
     void getSpeed(double speed);
}
abstract class Car implements icar{

    @Override
    public void Accelerate(){
        System.out.println("Accelerate: ");
    }
    public void getColor(String color){
        System.out.println("Mau xe:" +color);
    }
    public void getSpeed(double speed){
        System.out.println("Toc do: "+ speed);
    }
}
class Bmw extends Car implements icar{

    @Override
    public void Accelerate(){
        System.out.println("Accelerate: ");
    }
    public void getColor(String color){
        System.out.println("Mau xe:" +color);
    }
    public void getSpeed(double speed){
        System.out.println("Toc do: "+ speed);
    }
}
class Civic extends Car implements icar{
    @Override
    public void Accelerate(){
        System.out.println("Accelerate: ");
    }
    public void getColor(String color){
        System.out.println("Mau xe:" +color);
    }
    public void getSpeed(double speed){
        System.out.println("Toc do: "+ speed);
    }
}
public class cau3{
    public static void main(String[] args) {
        Bmw bmw=new Bmw();
        System.out.println("Hieu xe BMW: ");
        bmw.getColor("Den");
        bmw.getSpeed(240);

        System.out.println("\nHieu xe Civic: ");
        Civic cv= new Civic();
        cv.getColor("Trang");
        cv.getSpeed(120);
    }
}