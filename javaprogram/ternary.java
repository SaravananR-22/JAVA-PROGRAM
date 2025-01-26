import java.util.Scanner;
class ternary{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE VALUE OF A:");
        System.out.println("ENTER THE VALUE OF B:");
        int a=sc.nextInt();
        int b=sc.nextInt();
        String c=a>b?"A IS GREATER THAN B":"B IS GREATER THAH A";
        System.out.print(c);

    }
}  