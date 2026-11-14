// Inside a folder named 'mypack'
package mypack;

public class MyPackageClass 
{
    public void displayMessage()
    {
        System.out.println("Hello from MyPackageClass in mypack package!");
    }

    // New utility method
    public static int addNumbers(int a, int b) 
    {
        return a + b;
    }
}


// Main program outside the mypack folder

import mypack;
public class Main
{
    public static void main(String[] args)
    {
        // Creating an instance of MyPackageClass from the mypack package
        MyPackageClass Ob = new MyPackageClass();

        // Calling the displayMessage method from MyPackageClass
        Ob.displayMessage();

        // Using the utility method addNumbers from MyPackageClass
        int result = MyPackageClass.addNumbers(5, 3);
        System.out.println("Result of adding numbers: " + result);
    }
}