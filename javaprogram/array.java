import java.util.Scanner;
class array{
    public static void main(String[] args){
        int[] no=new int[5];
        System.out.print("enter the values of no:");
        Scanner sc=new Scanner(System.in);
        no[0]=sc.nextInt();
        no[1]=sc.nextInt();
        no[2]=sc.nextInt();
        no[3]=sc.nextInt();
        no[4]=sc.nextInt();
        int sum=no[0]+no[1]+no[2]+no[3]+no[4];
        System.out.print("THE SUM OF THE ARRAY VALUES ARE:"+sum);
    }
}