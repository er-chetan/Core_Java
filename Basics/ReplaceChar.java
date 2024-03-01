public class ReplaceChar {
    String name;
    char b;

    public void display(){
        char[] s = name.toCharArray();
    for(int i=0;i<s.length;i++) {
        if(s[i]=='a'){
            s[i]='b';
        }
        System.out.print(s[i]);
    }
        System.out.println();
    }
    public void replace(){
        char[] s = name.toCharArray();
        for(int i=0;i<name.length();i++){
            if(s[i]==' '){
                continue;
            }else {
                System.out.print(s[i]);
            }
        }
    }

    public static void main(String[] args) {

        ReplaceChar c1=new ReplaceChar();
        c1.name="this is chetan";
        c1.display();
        c1.replace();
    }

}
