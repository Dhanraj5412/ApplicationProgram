 import java.io.*;
 
 class Readfile 
 {
    public static void main(String Arg[]) throws Exception
    {
        FileInputStream fobj = new FileInputStream("infosystems.txt");
        int i= 0;
        
        while((i = fobj.read()) !=-1)
        {
            System.out.print((char)i);

        }
        fobj.close();

    }
    
    
}
