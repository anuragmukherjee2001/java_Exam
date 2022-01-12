class MoreException {
    public static void main(String[] args) {
        AException AE = new AException();
        AE.m1();
    }
}

class AException{
    void m1(){
        try{
            int a[]=new int[5];                    
            System.out.println(a[10]);

            String s = "saturday";
            s.charAt(20);
        }
        catch(ArrayIndexOutOfBoundsException aioobe){
            System.out.println("This is a ArrayIndexOutOfBoundsException exception");
        }
        catch(StringIndexOutOfBoundsException sioobe){
            System.out.println("This is StringIndexOutOfBoundsException exception");
        }
    }
}
