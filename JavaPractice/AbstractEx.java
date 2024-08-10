package JavaPractice;

abstract class Shape{
    abstract void draw();
}
class Rectangle extends Shape{
    void draw(){
        System.out.println("drawing rectangle");
    }
}

class Circle1 extends Shape{
    void draw(){
        System.out.println("drawing circle");
    }
}

class AbstractEx{
    public static void main(String args[]){
        Circle1 s=new Circle1();
        Rectangle R=new Rectangle();
        s.draw();
        R.draw();
    }
}

