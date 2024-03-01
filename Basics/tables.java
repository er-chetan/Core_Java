public class tables {
    public static void main(String[] args){
        for(int i=2;i<=10;i++){
            for(int j=1;j<=10;j++){
                int s=i*j;
                System.out.println(i+"*"+j+"="+s);

            } System.out.println("\t");
            if(i==4){
                break;
            }

        }
    }
}
