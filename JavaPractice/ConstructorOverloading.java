package JavaPractice;

class Box {
    double width;
    double height;
    double depth;

    Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    Box(double len) {
        width = height = depth = len;
    }

    Box() {
        width = height = depth = 0;
    }

    double volume() {
        return width * height * depth;
    }
}

public class ConstructorOverloading {
    public static void main(String[] args) {
        Box box1 = new Box(10, 20, 15);
        Box box2 = new Box();
        Box box3 = new Box(7);

        System.out.println("Volume of box1 is " + box1.volume());
        System.out.println("Volume of box2 is " + box2.volume());
        System.out.println("Volume of box3 is " + box3.volume());
    }
}
