import java.io.*;
 
class Writefile
 {

   public static void main(String Arg[]) throws Exception
   {
    FileOutputStream fobj = new FileOutputStream("infosystems.txt");
    String str = "india is my country";

    byte Arr[] = str.getBytes();
    fobj.write(Arr);
    fobj.close();
     
}
   
}
