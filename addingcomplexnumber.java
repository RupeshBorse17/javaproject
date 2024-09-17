package practiclasfolder;
import java.util.Scanner;

public class addingcomplexnumber {

    int a;
    int b;
    int c;
    int d;

   public addingcomplexnumber(int a,int b,int c,int d){

        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }



    public  void display(){

        System.out.println((a+b) + "+" + (c+d) + "i");
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the real 1 :");
        int a = sc.nextInt();
        System.out.println("enter the img 1 :");
        int b = sc.nextInt();
        System.out.println("enter the real 2 :");
        int c = sc.nextInt();
        System.out.println("enter the img 2 :");
        int d = sc.nextInt();

       addingcomplexnumber obj = new addingcomplexnumber(a,b,c,d);

       obj.display();




    }
}
