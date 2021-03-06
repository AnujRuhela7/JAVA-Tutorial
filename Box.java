// 9 September 2021
/* Q3. Create a class Box that uses a parameterized constructor to initialize the dimensions of a box.The dimensions of the Box are width, height, depth. The class should have a method that can return the volume of the box. Create an object of the Box class and test the functionalities. */
public class Box
{
    int width;
    int height;
    int depth;
    float vol;
    Box(int w, int d, int h)
    {
        width = w;
        depth = d;
        height = h;
    }
    public float volume()
    {
        vol = width*depth*height;
        return vol;
    }
}
class BoxMain
{
    public static void main(String[] args)
    {
        Box b1 = new Box(4,5,6);
        System.out.println("Volume = " + b1.volume());
    }
}