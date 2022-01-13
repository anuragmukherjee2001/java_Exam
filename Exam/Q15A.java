
class Q15A{
    public static void main(String[] args){
        Circle c = new Circle(22);
        System.out.println("The area of the circle is "+c.area());

        Rectangle r = new Rectangle(20,20);
        System.out.println("The area of the circle is "+r.area());
    }
}

interface Shape{
    double PI = 3.14;
}

class Circle implements Shape{
    int rad;

    Circle(int rad){
        this.rad=rad;
    }

    double area(){
        return PI * this.rad * this.rad;
    }
}

class Rectangle implements Shape {
    int l;
    int b;

    Rectangle(int l, int b) {
        this.l = l;
        this.b = b;
    }

    double area(){
        return this.l * this.b;
    }
}

