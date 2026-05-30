import java.util.Scanner;

class Values
{
protected int a,b;
    public void setValues(int x,int y)
    {
    a=x;
    b=y;
    }
    /* A good programmer never uses what is not necessary.
    public void displayValues()
    {
        System.out.println("The values are: "+a+" "+b);
    }
    */
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
        if(b==0)
        {
            System.out.println("Cannot divide by zero!");
            return 0;
        }
        return (double)a/b;
    }
}

public class Main
{
    public static void main(String args[])
    {
    Operations op = new Operations();
    Scanner sc = new Scanner(System.in);    
    boolean running = true;

    while(running)
    {
    System.out.println("Enter First Number: ");
    int x = sc.nextInt();
    System.out.println("Enter Second Number: ");
    int y = sc.nextInt();
    
        op.setValues(x,y);
        //op.displayValues();

      
    System.out.println("1.Addition");
    System.out.println("2.Subtraction");
    System.out.println("3.Multiplication");
    System.out.println("4.Division");
    System.out.println("5.Exit!");

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
        case 5 : System.out.println("Exitting Calculator!!");
                    sc.close();
                    running = false;
                    break;
        default : System.out.println("Invalid choice! Choose correct option.");
    }
    }

    }
}


/*
Version 0.3

Learnt and Implemented:
1. Scanner input, inheritance, classes and objects, methods
used: variables and arithmetic operations
2. Menu Driven program using switch-case, user choice handling
3. Centralized Input Handling
4. repeated execution, user interaction flow through loop
5. Loopp control variable (running) for user desired running of program


Other Learnings:
1. separated data storage, operations and execution
2. fall through behavior of switch case without break
3. Scanner class object instead of creating in putvalues directly 
pass values to putvalues() through main class - better design 
4. through putValues() separated input collection from object state assignment
5. proffessional convention : putValues() getValues() : setValues() displayValues()
6. Division by 0 gives infinity which is not correct mathematically for a calculator
7. A real calculator doesnot print the values again after taking input.


OOPS understanding improvement:
1. Every extended object is a type of its super class.
    But Operations is not a Value. (type of value)
    eg: Dog is an Animal. So we can write class Dog extends Animal.


*/