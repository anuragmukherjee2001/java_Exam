
class Q10B {
    public static void main(String[] args) throws VoteException{
        Voting v = new Voting();
        v.voteTo(45);
    }    
}

class VoteException extends Exception{
    VoteException(){
        super("Not Right Age to vote");
    }
    
    VoteException(String mess){
        super(mess);
    }
}

class Voting{
    void voteTo(int age) throws VoteException{
        // try{
            if(age < 18){
                throw new VoteException("You are still a minor");
            }
            else{
                System.out.println("Can vote easily");
            }
        // }
        // catch(VoteException e){
        //     System.out.println("Vote Exception");
        // }
    }
}