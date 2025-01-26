import java.util.Scanner;
class factorial {
    public static void main(String[] args){
        int no;
        System.out.print("enter the factorial no:");
        Scanner scan=new Scanner(System.in);
        no=scan.nextInt();
        int fact=1;
        for(int i=1; i<=no; i++){
            fact=fact*i;
        }
        System.out.print(fact);
    }
}