import Marvellous.Arithematic;
import Marvellous.Mathematics;

public class PackageDemo 
{
    public static void main(String Arg[])
{
    Arithematic aobj = new Arithematic();
    Mathematics mobj = new Mathematics();

    int iRet = 0;

    iRet = aobj.Addition(10,11);
    System.out.println("Addition is :"+iRet);

    iRet = aobj.Substraction(10,11);
    System.out.println("substraction is :"+iRet);

    iRet = mobj.Square(10);
    System.out.println("square is :"+iRet);

    iRet = mobj.Cube(10);
    System.out.println("cube is :"+iRet);
}
}
