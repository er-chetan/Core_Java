package ExceptionHandling.CustomException;

public class Voting {
    public void votingAge(int age) throws InvalidAgeException{
        if(age<18){
            InvalidAgeException i1=new InvalidAgeException("you are under age");
            throw i1;
        }
    }

    public static void main(String[] args) {
        Voting v1=new Voting();
        try {
            v1.votingAge(19);
            System.out.println("you can vote");
        } catch (InvalidAgeException e) {
            e.printStackTrace();
        }
        System.out.println("you are in vote conditon");
    }
}
