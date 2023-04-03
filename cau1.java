interface Shape{
    public void draw();
}
class Rectangle implements Shape{

    @Override
    public void draw() {
        System.out.println("Ve HCN");
}
}
class Circle implements Shape{

    @Override
    public void draw() {
        System.out.println("Ve HT");
}
}
public class cau1{
    public static void main(String[] args) {
       Shape s=new Rectangle();
       s.draw();

       Shape sh=new Circle();
        sh.draw();
    }
}