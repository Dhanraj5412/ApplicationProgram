

class Stringdemo 
 {
    public static void main (String Arg[])
    {
       char Arr[]= {'h','e','l','l','o'};
       String str1 = new String(Arr);

       String str2 = "hello";
       String str3 = new String ("hello");

       System.out.println(str1);
       System.out.println(str2);
       System.out.println(str3);

       System.out.println(str1.length());
       System.out.println(str2.length());
       System.out.println(str3.length());
    }
    
}
