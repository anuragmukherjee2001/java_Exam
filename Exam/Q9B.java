
class Q9B {
    public static void main(String[] args) {
        AException a = new AException();
        a.m1();
    }    
}

class AException{
    void m1(){
        try{
            System.out.println(10/0);
        }
        catch(ArithmeticException ae){
            System.out.println("Arithmetic Exception handled");
        }
    }
}
