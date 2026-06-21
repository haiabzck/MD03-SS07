package Exercise1;

public class Rectangle {
    private double width;
    private double height;

    public Rectangle(){
        this.width = 1.0;
        this.height = 1.0;
    }
    public  Rectangle(double width,double height){
        this.height = height;
        this.width = width;
    }

    public double getArea(){
        return width * height;
    }

    public double getPerimeter(){
        return (width + height) * 2;
    }

    public void display(){
        System.out.println("Chiều dài : " + width);
        System.out.println("Chiều rộng : " + height);
        System.out.println("Diện tích : " + getArea());
        System.out.println("Chu vi : " + getPerimeter()+"\n");
    }
}
