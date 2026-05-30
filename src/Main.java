import java.util.Scanner;

class Values
{
private int a,b;
    public void setValues(int x,int y)
    {
    a=x;
    b=y;
    }
    public int getA()
    {
        return a;
    }
    public int getB()
    {
        return b;
    }
}
class Operations
{
    int add(int a,int b)
    {
        return a+b;
    }

    int subtract(int a,int b)
    {
        return a-b;
    }

    int multiply(int a,int b)
    {
        return a*b;
    }

    double divide(int a,int b)
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
    Values val = new Values();
    Operations op = new Operations();
    Scanner sc = new Scanner(System.in);    
    boolean running = true;

    System.out.println("Enter First Number: ");
    int x = sc.nextInt();
    System.out.println("Enter Second Number: ");
    int y = sc.nextInt();
    
    val.setValues(x,y);

    while(running)
    {      
        System.out.println("1.Addition");
        System.out.println("2.Subtraction");
        System.out.println("3.Multiplication");
        System.out.println("4.Division");
        System.out.println("5.Exit!");

        System.out.print("Choose an operation: ");
        int choice = sc.nextInt();

        switch(choice)
        {
        case 1 : System.out.println("Addition: "+op.add(val.getA(),val.getB()));
            break;
        case 2 : System.out.println("Subtraction: "+op.subtract(val.getA(),val.getB()));
            break;
        case 3: System.out.println("Multiplication :"+op.multiply(val.getA(),val.getB()));
            break;
        case 4 : System.out.println("Division: "+op.divide(val.getA(),val.getB()));
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
5. Loop control variable (running) for user desired running of program
6. Created separate object for values class and used the stored values
7. Operations receive numbers as parameters instead of inheriting them.


Other Learnings:
1. separated data storage, operations and execution
2. fall through behavior of switch case without break
3. Scanner class object instead of creating in putvalues directly 
pass values to putvalues() through main class - better design 
4. through putValues() separated input collection from object state assignment
5. proffessional convention : putValues() getValues() : setValues() displayValues()
6. Division by 0 gives infinity which is not correct mathematically for a calculator
7. A real calculator does not print the values again after taking input.
8. now i can exit when ever i want. without entering values.
9. single time input. multiple time operations
10. write complete names like multiply, divide instead of mul, div.


OOPS understanding improvement:
1. Every sub class is a type of its super class.
    But Operations is not a Value. (type of value)
    eg: Dog is an Animal. So we can write class Dog extends Animal.
2. Never directly use another class internal state. use them through methods.


*/