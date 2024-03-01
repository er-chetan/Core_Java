package PROJECT.GuessGame;

import Abstraction.First;

import java.util.Scanner;

public class mix implements Pattern1,pattern2,pattern3,pattern4 {
    int guess;
    int match;
    int m;
    int rep1;
    boolean isrun = true;
    Scanner obj = new Scanner(System.in);

    @Override
    public void pattern1(int i) {
        boolean isrun = true;
        while (isrun) {
            m = i + i;
            System.out.println("new  number is" + " " + m);
            System.out.println("###### 1.REPEAT      2.GUESS ######");
             rep1 = obj.nextInt();
            if (rep1 == 2) {
                i++;
                m=i+i;
                match = m ;
                System.out.println("GUESS THE NUMBER");
                guess = obj.nextInt();
                if (match == guess) {
                    System.out.println("YOU ARE WIN CONGRATULATION");
                    System.out.println("########## THANK YOU #############");
                    isrun=false;
                } else if (match != guess) {
                    System.out.println("you are losse");
                    System.out.println("\n\nARE YOU WANT TO PLAY AGAIN :-");
                    System.out.println("1.START AGAIN");
                    System.out.println("2.START FROM LOSS");
                    System.out.println("3.EXIT");
                    System.out.println("CHOOSE ANY ONE :");
                    int choose= obj.nextInt();
                    switch (choose){
                        case 1:
                             pattern1(1);
                             isrun=false;
                             break;
                             case  2:
                            pattern1(i-1);
                            isrun=false;
                            break;
                        case  3:
                            System.out.println("########## THANK YOU #############");
                            isrun = false;
                    }
                }
            } else {
                i++;
            }

        }

    }


    @Override
    public void pattern2(int i) {
        while (isrun) {
            m = i * i;
            System.out.println("new  number is" + " " + m);
            System.out.println("###### 1.REPEAT      2.GUESS ######");
            int rep1 = obj.nextInt();
            if (rep1 == 2) {
                i++;
                m = i * i;
                match = m;
                System.out.println("GUESS THE NUMBER");
                guess = obj.nextInt();
                if (match == guess) {
                    System.out.println("YOU ARE WIN CONGRATULATION");
                    System.out.println("########## THANK YOU #############");
                    isrun = false;
                } else if (match != guess) {
                    System.out.println("you are losse");
                    System.out.println("\n\nARE YOU WANT TO PLAY AGAIN :-");
                    System.out.println("1.START AGAIN");
                    System.out.println("2.START FROM LOSS");
                    System.out.println("3.EXIT");
                    System.out.println("CHOOSE ANY ONE : ");
                    int choose = obj.nextInt();
                    switch (choose) {
                        case 1:
                            pattern2(1);
                            isrun = false;
                            break;
                        case 2:
                            pattern2(i - 1);
                            isrun = false;
                            break;
                        case 3:
                            System.out.println("########## THANK YOU #############");
                            isrun = false;
                    }
                }
            }else {
                i++;
            }
        }
    }

    @Override
    public void pattern3(int i) {
        while (isrun) {
            m = i * i * i;
            System.out.println("new  number is" + " " + m);
            System.out.println("###### 1.REPEAT      2.GUESS ######");
            int rep1 = obj.nextInt();
            if (rep1 == 2) {
                i++;
                m = i * i * i;
                match = m;
                System.out.println("GUESS THE NUMBER");
                guess = obj.nextInt();
                if (match == guess) {
                    System.out.println("YOU ARE WIN CONGRATULATION");
                    System.out.println("########## THANK YOU #############");
                    isrun = false;
                } else if (match != guess) {
                    System.out.println("you are losse");
                    System.out.println("\n\nARE YOU WANT TO PLAY AGAIN :-");
                    System.out.println("1.START AGAIN");
                    System.out.println("2.START FROM LOSS");
                    System.out.println("3.EXIT");
                    System.out.println("CHOOSE ANY ONE :");
                    int choose = obj.nextInt();
                    switch (choose) {
                        case 1:
                            pattern3(1);
                            isrun = false;
                            break;
                        case 2:
                            pattern3(i - 1);
                            isrun = false;
                            break;
                        case 3:
                            System.out.println("########## THANK YOU #############");
                            isrun = false;
                    }
                }
            } else {
                i++;
            }
        }
    }

    @Override
    public void pattern4(int i) {
        while (isrun) {
            m = i+i+i;
            System.out.println("new  number is" + " " + m);
            System.out.println("###### 1.REPEAT      2.GUESS ######");
            int rep1 = obj.nextInt();
            if (rep1 == 2) {
                i++;
                m = i+i+i;
                match = m;
                System.out.println("GUESS THE NUMBER");
                guess = obj.nextInt();
                if (match == guess) {
                    System.out.println("YOU ARE WIN CONGRATULATION");
                    System.out.println("########## THANK YOU #############");
                    isrun = false;
                } else if (match != guess) {
                    System.out.println("you are losse");
                    System.out.println("\n\nARE YOU WANT TO PLAY AGAIN :-");
                    System.out.println("1.START AGAIN");
                    System.out.println("2.START FROM LOSS");
                    System.out.println("3.EXIT");
                    System.out.println("CHOOSE ANY ONE :");
                    int choose = obj.nextInt();
                    switch (choose) {
                        case 1:
                            pattern4(1);
                            isrun = false;
                            break;
                        case 2:
                            pattern4(i - 1);
                            isrun = false;
                            break;
                        case 3:
                            System.out.println("########## THANK YOU #############");
                            isrun = false;
                    }
                }
            }else {
                i++;
            }
        }
    }
}