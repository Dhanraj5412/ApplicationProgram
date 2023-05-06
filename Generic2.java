class Generic2
{
    public static <T> Display(T Arr[])
    {
        for(T no : Arr) //foreach
       {
        System.out.println(no);
       }
    }

public static void main(String Arg[])
   {
      Integer A[]= {10,20,30,40};
      Float B[]= {50.89f,60.44f,70.56f};
      Double C[]= {50.89,60.44,70.56};

      Display(A);
      Display(B);
      Display(C);
   }
}