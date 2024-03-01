package PROJECT.Quiz;

public class Choose extends MIX{

    int count=0;
    int right,wrong;
    boolean isrun=true;
    String responsetext,rigthtext;
    public void main(){

        commoncalling();

        while(isrun){
            common(count);
            ans();
            switch (n){
                case 1:
                  responsetext = s1.get(count);
                  rigthtext = s5.get(count);
                  break;
                case 2:
                    responsetext = s2.get(count);
                    rigthtext = s5.get(count);
                    break;
                case 3:
                    responsetext = s3.get(count);
                    rigthtext = s5.get(count);
                    break;
                case 4:
                    responsetext = s4.get(count);
                    rigthtext = s5.get(count);
                    break;
            }
            if(responsetext==rigthtext){
                right++;
            }else{
                wrong++;
            }
            count++;
            if(count>9){
                System.out.println("right"+" "+right+" "+"wrong"+" "+wrong);
                isrun=false;
            }
        }


    }
    public void common(int count){
        System.out.println(q.get(count));
        System.out.println(n1.get(count));
        System.out.println(n2.get(count));
        System.out.println(n3.get(count));
        System.out.println(n4.get(count));
    }

    public static void main(String[] args) {
        Choose c1=new Choose();
        c1.main();
    }
}
