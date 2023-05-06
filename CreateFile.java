 import java.io.*;
 
 class CreateFile
  {

    public static void main(String Arg[]) throws Exception
    {
       File fobj = new File("infosystems.txt");

       if(fobj.createNewFile())
       {
         System.out.println("file succesfully created");

       }
       else
       {
        System.out.println("unable to  created the file");
       }
    }
    
}
