import java.util.Scanner;
class sumofdigit{
    public static void main(String[] args){
        
        Scanner sc=new Scanner(System.in);
        System.out.print("ENTER THE NUM");
        int num=sc.nextInt();
        int sum=0;
        while(num!=0){
            sum=sum+(num%10);
            num=num/10;
        }
        System.out.println(sum);
    }
}