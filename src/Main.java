import java.util.Scanner;

class Values
{
protected int a,b;
    public void putValues()
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter First Number: ");
        a = sc.nextInt();
        System.out.println("Enter Second Number: ");
        b = sc.nextInt();
        
       //sc.close(); preferable not use this way.. will learn later in resource management
    }
    public void getValues()
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
        
        op.putValues();
        op.getValues();
        System.out.println(op.add());
        System.out.println(op.sub());
        System.out.println(op.mul());
        System.out.println(op.div());
    }
}


/*
Version 0.1

Learnt and Implemented: Scanner input, inheritance, classes and objects, methods
used: variables and arithmetic operations

Other Learnings:
1. separated data storage, operations and execution

*/