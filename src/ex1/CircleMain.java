package ex1;

public class CircleMain {
    public static void main(String[] args) {
        Circle a = new Circle(2,3,5);
        Circle b = new Circle(2,3,30);
        System.out.println("원 a : " + a);
        System.out.println("원 b : " + b);
        if (a.equals(b)){
            System.out.println("같은 원");
        }
        else{
            System.out.println("서로 다른 원");
        }
    }
}
