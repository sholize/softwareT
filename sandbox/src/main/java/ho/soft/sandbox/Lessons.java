package ho.soft.sandbox;

public class Lessons {

  public static void main(String[] args) {

    hello("Vasia");

    Square s = new Square(5);
    System.out.println("Площадь квадрата со стороной " + s.l + " = " + s.area());

    Rectangle r = new Rectangle(5,6);
    System.out.println("Площадь прямогульника со сторонами " + r.a + " и " + r.b + " = " + r.area());

  }

  public static void hello(String somebody) {
    System.out.println("Hello " + somebody + "!");
  }



}
