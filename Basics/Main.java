import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the element whose frequency you want to find:-");
        int p = sc.nextInt();

        int C[] = {1,1,2,3,3,4,5,5,5};
        int H[] = {0,0,0,0,0,0,0,0,0};
        int n = 9;
        int i;
        int flag=0;

        for( i=0;i<=n-1;i++)
        {
            H[C[i]]++;
        }

        for( i=0;i<=n-1;i++)
        {

            if(H[i]>=1 && i==p)
            {
                System.out.println(i+" is "+" appearing for "+H[i]+" times");
                flag++;
                break;
            }}
        if(flag==0 )
            System.out.println("element not found");

    }
}

