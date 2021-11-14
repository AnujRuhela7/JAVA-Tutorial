public class Rev
{
    int[][] arr = new int[2][2];
    int n;
    public static void main(String[] args)
    {
        Rev obj = new Rev();
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                obj.arr[i][j] = Integer.parseInt(args[obj.n]);
                obj.n++;
            }
        }
        if (args.length < 0) {
            System.out.println("Please enter 4 integer numbers !!");
        }
        else
        {
            System.out.println("The given array is :");
            for (int i = 0; i < 2; i++)
            {
                System.out.println();
                for (int j = 0; j < 2; j++) {
                    System.out.print(obj.arr[i][j] + " ");
                }
            }
            System.out.println();
            System.out.println("Reverse of the array is :");
            for (int i = obj.arr.length - 1; i >= 0; i--)
            {
                System.out.println();
                for (int j = obj.arr.length - 1; j >= 0; j--) {
                    System.out.print(obj.arr[i][j] + " ");
                }
            }
        }
    }
}