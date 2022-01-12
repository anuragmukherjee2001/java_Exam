//package Assignment-9;

class TestAE {
    public static void main(String[] args) {
        AException AE = new AException();
        AE.m1();
    }
}

class AException{
    void m1(){
        try{
            System.out.println(10/0);
        }
        catch(ArithmeticException ae){
            System.out.println("This is a exception");
        }
    }
}