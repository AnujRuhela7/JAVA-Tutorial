/*
Q3. Initialize an integer array with ascii values and print the corresponding character values in a single row.
 */
package array;
public class AsciiVal
{
    int[] ascii;
    AsciiVal()
    {
        ascii = new int[] {77,83,68};
    }
    void print_Array()
    {
        for (int i = 0; i < ascii.length; i++)
        {
            System.out.println((char) ascii[i]);
        }
    }
}
class AsciiValMain
{
    public static void main(String[] args) {
        AsciiVal obj = new AsciiVal();
        obj.print_Array();
    }
}