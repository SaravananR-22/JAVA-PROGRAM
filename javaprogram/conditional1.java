import java.util.Scanner;
class conditional{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("ENTER THE M1:");
        int m1=sc.nextInt();
        System.out.println("ENTER THE M2:");
        int m2=sc.nextInt();
        System.out.println("ENTER THE M3:");
        int m3=sc.nextInt();
        System.out.println("ENTER THE M4:");
        int m4=sc.nextInt();
        System.out.println("ENTER THE M5:");
        int m5=sc.nextInt();

        int avg_mark=m1+m2+m3+m4+m5/5;

        if(avg_mark<=35){
            System.out.println("YOU NEED TO IMPROVE:");
        }
        else{
            System.out.println("YOU PASSED IN UR EXAMINATION");
        }

    }
}