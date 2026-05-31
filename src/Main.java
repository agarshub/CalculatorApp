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

    int x=0,y=0 ; // initialized outside trycatch block
    
    boolean isValid = false; // input Validation loop control variable
    while(!isValid) // continuously asking for input until user enters a valid input
    {
        System.out.println("Enter First Number: ");
        try
        {
        x = sc.nextInt();
        isValid = true;
        }
        catch(Exception e)
        {
        System.out.println("Please enter a valid number: "+e);
        sc.nextLine(); //clears bad input from scanner buffer.
        }
    }

    isValid = false; // resetting loop control variable to false
    while(!isValid)
    {
        System.out.println("Enter Second Number: ");
        try
        {
        y = sc.nextInt();
        isValid = true;
        }
        catch(Exception e)
        {
        System.out.println("Please enter a valid number: "+e);
        sc.nextLine(); // sc.next() also works
        }
    }

    val.setValues(x,y);

    boolean running = true;
    while(running)
    {      
        System.out.println("1.Addition");
        System.out.println("2.Subtraction");
        System.out.println("3.Multiplication");
        System.out.println("4.Division");
        System.out.println("5.Exit!");

        System.out.print("Choose an operation: ");
        int choice = 0;
        isValid = false;
        while (!isValid)
        {
            try
            {
            choice = sc.nextInt();
            isValid = true;
            }
            catch(Exception e)
            {
            System.out.println("Invalid choice! Choose a number: "+e);
            sc.nextLine();
            }
        }

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
Version 0.4

Learnt and Implemented:
1. Scanner input, inheritance, classes and objects, methods
used: variables and arithmetic operations
2. Menu Driven program using switch-case, user choice handling
3. Centralized Input Handling
4. repeated execution, user interaction flow through loop
5. Loop control variable (running) for user desired running of program
6. Created separate object for values class and used the stored values
7. Operations receive numbers as parameters instead of inheriting them.
8. try-catch, Exception Handling
9. Input Validation Loop (very common and useful technique in real world)

Other Learnings:
1. separated data storage, operations and execution
2. fall through behavior of switch case without break
3. Scanner class object instead of creating in putvalues directly 
pass values to putvalues() through main class - better design 
4. through putValues() separated input collection from object state assignment
5. proffessional convention : putValues() getValues() : setValues() displayValues()
6. Division by 0 gives infinity which is not correct mathematically for a calculator
7. A real calculator does not print the values again after taking input.
8. Once valid numbers are entered, the user can perform multiple operations
   and exit at any time through the menu.
9. single time input. multiple time operations
10. write complete names like multiply, divide instead of mul, div.
11. Initialized the variables outside try catch
    and updated values inside the try catch block.
12. The user has to compulsorily choose a right number before he can proceed to the further program
    This is handled through try catch while entering input.
13. Learnt input validation using loops and exception handling.
14. Another use of while loop while entering values from user is,
    the intialized values will not be used in any case until user types it.
    Without while loop, it might have caught the exception and taken x=0 as input by default


OOPS understanding improvement:
1. Every sub class is a type of its super class.
    But Operations is not a Value. (type of value)
    eg: Dog is an Animal. So we can write class Dog extends Animal.
2. Never directly use another class internal state. use them through methods.
3. Variables created inside a try block only exist inside that specific block,
    because of Variable Scope. { .. }
4. If the catch block recieves a bad input then the bad input stays stuck
    in the scanner's memory.
    This results in scanner object trying to read the same bad input again and again.
    To avoid this we clear the bad input by using sc.nextLine() or sc.next() in catch block.
5. Difference between next() and nextLine()
    sc.next() removes one token
    sc.nextLine() removes the entire line.

*/