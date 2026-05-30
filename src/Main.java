import java.util.Scanner;

class Values
{
protected int a,b;
    public void setValues(int x,int y)
    {
    a=x;
    b=y;
    }
    public void displayValues()
    {
        System.out.println("The values are: "+a+" "+b);
    }
}
class Operations extends Values
{
    int add()
    {
        return a+b;
    }

    int sub()
    {
        return a-b;
    }

    int mul()
    {
        return a*b;
    }

    double div()
    {
        return (double)a/b;
    }
}

public class Main
{
    public static void main(String args[])
    {
    Operations op = new Operations();
    Scanner sc = new Scanner(System.in);    
    
    System.out.println("Enter First Number: ");
    int x = sc.nextInt();
    System.out.println("Enter Second Number: ");
    int y = sc.nextInt();
    
        op.setValues(x,y);
        op.displayValues();

    System.out.println("1.Addition");
    System.out.println("2.Subtraction");
    System.out.println("3.Multiplication");
    System.out.println("4.Division");

    System.out.print("Choose an operation: ");
    int choice = sc.nextInt();

    switch(choice)
    {
        case 1 : System.out.println("Addition: "+op.add());
            break;
        case 2 : System.out.println("Subtraction: "+op.sub());
            break;
        case 3: System.out.println("Multiplication :"+op.mul());
            break;
        case 4 : System.out.println("Division: "+op.div());
            break;
        default : System.out.println("Invalid choice! Choose correct option.");
    }
    
    }
}


/*
Version 0.2

Learnt and Implemented:
1. Scanner input, inheritance, classes and objects, methods
used: variables and arithmetic operations
2. Menu Driven program using switch-case, user choice handling
3. Centralized Input Handling

Other Learnings:
1. separated data storage, operations and execution
2. fall through behavior of switch case without break
3. Scanner class object instead of creating in putvalues directly 
pass values to putvalues() through main class - better design 
4. through putValues() separated input collection from object state assignment
5. proffessional convention : putValues() getValues() : setValues() displayValues()

*/