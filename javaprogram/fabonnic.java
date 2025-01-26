import java.util.Scanner;
class fabonnic{
    public static void main(String[] args){
        int firstno=0;
        int secondno=1;
        int nextno;
        int listofSeries;
        System.out.print("enter the list of series");
        Scanner sc=new Scanner(System.in);
        listofSeries=sc.next.Int();
         for(int i=0; i<listofSeries; i++)
         {

            System.out.print(firstno);
            nextno=firstno+secondno;
            firstno=secondno;
            secondno=nextno;
         }
    }
}