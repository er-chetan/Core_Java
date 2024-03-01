package StringJavaTpoint;

public class Total_PunctuationChar {
    int count=0;
    int s;
    public void createstring(){
        String punctuation="/this ?is ! punctuation: string.";
        System.out.println("total lenth"+" "+punctuation.length());
        char[] carray=punctuation.toCharArray();
        for(int i=0;i<carray.length;i++){
            if(carray[i]=='/' ||carray[i]=='.'||carray[i]=='!'||carray[i]==':'|| carray[i]=='?'){
                count++;
            }else {
                continue;
            }
            System.out.print(carray[i]);//for without punctuation character;
            s=carray.length-count;

        }
        System.out.println("\nhow many punctuation character"+" "+ count);
        System.out.println("length of the punctuation string"+" "+s);//lenth of the string without panctuation character
    }

    public static void main(String[] args) {
        Total_PunctuationChar t2=new Total_PunctuationChar();
        t2.createstring();
    }
}
