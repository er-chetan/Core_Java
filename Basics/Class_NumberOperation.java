public class Class_NumberOperation {
    int num;

    public String even(){
        if(num%2==0){
            return"it is even number";
        }else{
            return "it an odd number";
        }
    }
    public String paildrome() {
        int temp, r, sum = 0;
        temp = num;
        while (temp > 0) {
            r = temp % 10;
            sum = (sum * 10) + r;
            temp = temp / 10;
        }
        if (num == sum) {
            return "it is a palindrome number";
        } else {
            return "not palindrome number";
        }
    }
        public String pronic(){
        String f="vidur";
            for(int i=0;i<=num;i++){
                if(i*(i+1)==num){

                     f= "pronic number";
                     break;
                }
            }
            if(f.equals("vidur")) {
                return "its not pronic number";
            }else{
                return f;
            }
            }

        public static void main(String[] args){
            Class_NumberOperation s=new Class_NumberOperation();
            s.num=454;
            String result1=s.even();
            System.out.println(result1);
            String result2=s.paildrome();
            System.out.println(result2);
            String  result3=s.pronic();
            System.out.println(result3);

        }
}
