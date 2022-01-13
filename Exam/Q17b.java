class Q17b {
    public static void main(String[] args) {
        MultipleInheritance obj = new MultipleInheritance();
        obj.show1();
        obj.show2();
    }    
}

class MultipleInheritance implements I1,I2{
    @Override
    public void show1() {
        System.out.println("This is a show 1 method");
    }

    @Override
    public void show2() {
        System.out.println("This is a show 2 method");
    }
}

interface I1{
    void show1();
}

interface I2{
    void show2();
}