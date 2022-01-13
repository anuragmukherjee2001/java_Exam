
class Q9A {
    public static void main(String[] args) {
        Animal a = new Animal();
        a.eat();
        a.sleep();

        Bird b = new Bird();
        b.eat();
        b.sleep();
        b.fly();
    }
}

class Animal{
    void eat(){
        System.out.println("The Animal is eating");
    }
    void sleep(){
        System.out.println("The animal is sleeping");
    }
}

class Bird extends Animal{
    void eat(){
        System.out.println("The Bird is eating");
    }
    void sleep(){
        System.out.println("The Bird is sleeping");
    }
    void fly(){
        System.out.println("The bird can fly");
    }
}