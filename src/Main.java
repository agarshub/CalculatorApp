import java.util.Scanner;
import java.util.InputMismatchException;

class Operations
{
    static int add(int a,int b)
    {
        return a+b;
    }

    static int subtract(int a,int b)
    {
        return a-b;
    }

    static int multiply(int a,int b)
    {
        return a*b;
    }

    static double divide(int a,int b)
    {
        if(b==0)
        {
            throw new ArithmeticException("Can't divide by zero!");
        }
        return (double)a/b;
    }
}

public class Main
{
    static int getValidInt(Scanner sc, String prompt)
    {
        int inputInt = 0;
        boolean isValid = false;
        while(!isValid)
        {
            System.out.print(prompt);
            try
            {
            inputInt = sc.nextInt();
            isValid=true;
            }
            catch(InputMismatchException e)
            {
                System.out.println("Please enter a valid number: "+e);
                sc.nextLine();
            }
        }
        return inputInt;
    }
    public static void main(String args[])
    {
    Scanner sc = new Scanner(System.in);    

    int x = getValidInt(sc,"Enter First Number: " );
    int y = getValidInt(sc,"Enter Second Number: ");

    boolean running = true;
    while(running)
    {      
        System.out.println("1.Addition");
        System.out.println("2.Subtraction");
        System.out.println("3.Multiplication");
        System.out.println("4.Division");
        System.out.println("5.Exit!");

        int choice = getValidInt(sc,"Choose an operation: ");
        switch(choice)
        {
        case 1 : System.out.println("Addition: "+Operations.add(x,y));
            break;
        case 2 : System.out.println("Subtraction: "+Operations.subtract(x,y));
            break;
        case 3: System.out.println("Multiplication :"+Operations.multiply(x,y));
            break;
        case 4 :try
                {
                    System.out.println("Division: "+Operations.divide(x,y));
                }
                catch(ArithmeticException e)
                {
                    System.out.println(e.getMessage());
                }
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
Version 0.5

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
10. Method Extraction, DRY principle (Donot Repeat Yourself), Reusable Code.
11. Now noticing that there is no instance variables and no stored state
    in class Operations, I handled this using static methods.
    No need to create Operations class Object.
    They act like utility/helper methods.


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
6. A static method belongs to the class itself, not to an object of that class.
    So we can use it without creating an object with in the class.
    To use a static method from another class, call it using ClassName.methodName().
7. I have used InputMismatchException e instead of Exception e while handling the error.
    Note that here I needed to import another package. java.util.InputMismatchException.
    But when I used Exception e I need not import a package that is because,
    Exception.java is file in the lang package while InputMismatchExcpetion.java is a file of util package.
    And we know that every .java file contains lang package by default.
    Thats why when I used InputMismatchException, I had to import its package first.
8. Forecfully throwing exceptions to handle division by zero. and using try catch
    to handle the exception.
*/