import java.util.Scanner;
class Input{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.print("enter an integer:");
        int number=input.nextInt();
        System.out.print("you entered " +number);
        input.close();
    }
}