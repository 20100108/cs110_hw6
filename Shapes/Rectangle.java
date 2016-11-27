package Shapes;

public class Rectangle {
    private int height;
    private int width;
    public Rectangle(int width, int height){
        this.height = height;
        this.width = width;
    }
    public int getArea(){
        return width * height;
    }
}
