
class Q13B {
    public static void main(String[] args) throws PayOutOfBoundsException {
        MonthlySal m = new MonthlySal();
        m.mSal(2000);
    }    
}

class MonthlySal {
    void mSal(int sal) throws PayOutOfBoundsException{
        if(sal < 10000){
            throw new PayOutOfBoundsException("Bad Sal");
        }
        else{
            System.out.println("Your salary is good");
        }
    }
}

class PayOutOfBoundsException extends Exception{
    PayOutOfBoundsException(){
        super("Your salary is less than 10,000");
    }
    PayOutOfBoundsException(String mes){
        super(mes);
    }
}