
class Q7A {
    public static void main(String[] args) {
        Apple a=new Apple("Apple", "Sweet", 9);
        a.eat();
        Orange o=new Orange("Orange", "Sour", 2);
        o.eat();
    }    
}

class Fruit{
    String name;
    String taste;
    int size;

    Fruit(String name, String taste, int size){
        this.name = name;
        this.taste = taste;
        this.size = size;
    }

    void eat(){
        System.out.println("The name of the fruit is "+name);
        System.out.println("The taste of the fruit is "+taste);
    }
}

class Apple extends Fruit{

    Apple(String name, String taste, int size){
        super(name, taste, size);
    }

    void eat(){
        System.out.println("The name of the fruit is "+name);
        System.out.println("The taste of the fruit is "+taste);
    }
}

class Orange extends Fruit{
    Orange(String name, String taste, int size){
        super(name, taste, size);
    }

    void eat(){
        System.out.println("The name of the fruit is "+name);
        System.out.println("The taste of the fruit is "+taste);
    }
}
