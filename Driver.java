import Shapes.Rectangle;
import Shapes.Square;
import utils.Math;


public class Driver {
    public static void main(String[] args){
        Square sq = new Square(100);
        int areaOfSq = sq.getArea();
        System.out.println(areaOfSq);
        Rectangle rect = new Rectangle(50, 80);
        int areaOfRect = rect.getArea();
        System.out.println(areaOfRect);
        double num = 15.6;
        int changedNumber = (int) num;
        System.out.println(Math.factorial(changedNumber));
        System.out.println(Math.factorialLoop(changedNumber));
    }
}
