class NegativeAException {
    public static void main(String[] args) {
        AException ae = new AException();
        ae.m1();
    }    
}

class AException{
    void m1(){
        try{
            // int[] intArray = new int[-5];
        }
        catch(NegativeArraySizeException nase){
            System.out.println("This is a NegativeArraySizeException exception");
        }
    }
}