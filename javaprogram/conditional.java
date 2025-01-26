import java.util.Scanner;
class conditional{
    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER THE SCORE:");
        int score=sc.nextInt();
        if(score<50){
            System.out.print("YOU NEED TO IMPROVE:");
        }
        else if(score==50 || score<=70){
            System.out.println("GOOD JOB");
        }
        else if(score>=70){
            System.out.println("EXCELLENT PERFORMANCE:");
        }

    }
}