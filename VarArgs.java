/*
import java.lang.*;         --> Implicit Import It will import only the classes which are used by the user.
import java.util.Scanner;   --> Explicit Import
We can't write java.*      This statement is illegal and won't work in any program.
Execution Sequence of Import Statement : Explicit, PWD, Implicit

STATIC IMPORT
Execution Sequence of Static Import Statement : PWD, Explicit, Implicit
import static java.lang.Integer.MAX_VALUE;

FINAL KEYWORD
final is a modifier
In C Programming Language
const int a;

In JAVA, const is replaced with final.....
If we want to impose some restrictions, we use final modifier...
with variable
with method
with class

We need to initialize the final variable before the completion of constructor
We can initialize the final variables either in Instance Block or either in a constructor.....
*/

/*

We can't jointly use abstract and final modifier. It is a illegal combination in Java Programming Language.
We can't use private and abstract Modifier combindly.
* */
import java.sql.Date;
import java.util.*;
import java.sql.*;

public class VarArgs
{
    Date obj;
    int arr[][] = new int[3][3];
    public void show(int[]...a) {

    }
    public static void main(String[] args)
    {

    }
}
