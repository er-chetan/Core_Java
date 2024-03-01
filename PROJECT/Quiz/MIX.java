package PROJECT.Quiz;

import java.util.ArrayList;
import java.util.Scanner;

public class MIX implements questions,option1,option2,option3,option4,answer {
    ArrayList <String> s5;
    ArrayList <String> s4;
    ArrayList <String> s3;
    ArrayList <String> s2;
    ArrayList <String> s1;
    ArrayList <String> q;
    ArrayList <String> n1;
    ArrayList <String> n2;
    ArrayList <String> n3;
    ArrayList <String> n4;

    int n;
    public void result(){
        s5 =new ArrayList<>();
        s5.add("2");
        s5.add("4");
        s5.add("1");
        s5.add("3");
        s5.add("1");
        s5.add("1");
        s5.add("1");
        s5.add("2");
        s5.add("1");
        s5.add("3");

    }
    public void commoncalling(){
         ques();
         choose1();
         choose2();
         choose3();
         chooe4();
         result();
    }
    @Override
    public int ans() {
        Scanner obj=new Scanner(System.in);
        System.out.println("enter the answer");
        n=obj.nextInt();
        return n;
    }

    @Override
    public void choose1( ) {
        n1=new ArrayList<>();
        s1=new ArrayList<>();
        n1.add("1)Dudhsagar Falls");
        n1.add("1) Delhi");
        n1.add("1) Tarapore Power Station");
        n1.add("1) Saint Andrew Auditorium");
        n1.add("1) Bharat Ratna");
        n1.add("1) Param Vir Chakra");
        n1.add("1) Vijaypat Singhania");
        n1.add("1) The General Bank of India");
        n1.add("1) Punjab National Bank");
        n1.add("1) Bank of India");
        s1.add("1");
        s1.add("1");
        s1.add("1");
        s1.add("1");
        s1.add("1");
        s1.add("1");
        s1.add("1");
        s1.add("1");
        s1.add("1");
        s1.add("1");



    }

    @Override
    public void choose2() {
        n2=new ArrayList<>();
        s2=new ArrayList<>();
        n2.add("2) Jog Falls");
        n2.add("2) Chandigarh");
        n2.add("2) Rajasthan Power Station");
        n2.add("2) Tejpal Auditorium");
        n2.add("2) Padma Vubhushan");
        n2.add("2) Vir Chakra");
        n2.add("2) Gautam Singhania");
        n2.add("2) Bank of Hindustan");
        n2.add("2) Imperial Bank of India");
        n2.add("2) Canara Bank");
        s2.add("2");
        s2.add("2");
        s2.add("2");
        s2.add("2");
        s2.add("2");
        s2.add("2");
        s2.add("2");
        s2.add("2");
        s2.add("2");
        s2.add("2");

    }

    @Override
    public void choose3() {
        n3=new ArrayList<>();
        s3=new ArrayList<>();
        n3.add("3) Palaruvi Falls");
        n3.add("3) Puducherry");
        n3.add("3) Madras Power Station");
        n3.add("3) Sri Shanmukhananda Hall");
        n3.add("3) Padma Bhushan");
        n3.add("3) Mahavir Chakra");
        n3.add("3) Hari Shankar Singhania");
        n3.add("3) State Bank of India");
        n3.add("3) New Bank of India");
        n3.add("3) State Bank of India");
        s3.add("3");
        s3.add("3");
        s3.add("3");
        s3.add("3");
        s3.add("3");
        s3.add("3");
        s3.add("3");
        s3.add("3");
        s3.add("3");
        s3.add("3");
    }

    @Override
    public void chooe4() {
        n4=new ArrayList<>();
        s4=new ArrayList<>();
        n4.add("4) Meenmutty Falls");
        n4.add("4) Lakshadweep");
        n4.add("4) Narora Power Station");
        n4.add("4) Sudarshan Rangmanch");
        n4.add("4) Padma Shri");
        n4.add("4) Shaurya Chakra");
        n4.add("4) Indu Shahaniv");
        n4.add("4) Bank of Bombay");
        n4.add("4) State Bank of India");
        n4.add("4) Union Bank of India");

        s4.add("4");
        s4.add("4");
        s4.add("4");
        s4.add("4");
        s4.add("4");
        s4.add("4");
        s4.add("4");
        s4.add("4");
        s4.add("4");
        s4.add("4");
    }

    @Override
    public void ques() {
        q =new ArrayList<>();
        q.add("1 Which is the highest waterfall in India?");
        q.add("2.Which is the most literate Union territory in India?");
        q.add("3.Which is the first atomic station in India?");
        q.add("4.Which is the largest auditorium in India?");
        q.add("5.Which is the highest award in India?");
        q.add("6.Which is the highest award for gallantry in India?");
        q.add("7.Who achieved the highest balloon flight in India?");
        q.add("8.Which is the first bank in India?");
        q.add("9.Which is the first indigenous bank in India?");
        q.add("10. Which is the largest public sector bank in India?c");


    }
}
