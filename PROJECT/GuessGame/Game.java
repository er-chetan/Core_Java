package PROJECT.GuessGame;

import java.util.Scanner;

public class Game extends mix {
    int play;
    mix m1=new mix();
    Scanner obj=new Scanner(System.in);
    public void gamestart() {
        System.out.println("ARE YOU WANT TO PLAY ");
        System.out.println("####### 1.START   2.EXIT #######");
        play = obj.nextInt();
        if (play == 1) {
            System.out.println("CHOOSE THE PATTERN");
            System.out.println("1.PATTERN A");
            System.out.println("2.PATTERN B");
            System.out.println("3.PATTERN C");
            System.out.println("4.PATTERN D");
            System.out.println("enter your choice");
            int t = obj.nextInt();
            switch (t) {
                case 1:
                    m1.pattern1(1);
                    break;
                case 2:
                    m1.pattern2(1);
                    break;
                case 3:
                    m1.pattern3(1);
                    break;
                case 4:
                    m1.pattern4(1);
            }
        } else {
            System.out.println("exit");
            System.out.println("GIVE THE REASON WHY ARE YOU QUIT THE GAME");
            String write=obj.next();
            System.out.println("########## THANK YOU #############");
        }
    }

    public static void main(String[] args) {
        Game g1=new Game();
        g1.gamestart();
    }
}

