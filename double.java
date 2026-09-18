import java.util.Scanner;
class Input{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.print("enter float:");
        float myFloat=input.nextFloat();
        System.out.print("float entered=" + myFloat);
        
        System.out.print("enter double:");
        double myDouble=input.nextDouble();
        System.out.print("double entered=" + myDouble);
        
        System.out.print("enter text:");
        String mystring=input.next();
        System.out.print("text entered=" + mystring);
    }
}