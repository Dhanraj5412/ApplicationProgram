 class Arithematic
 {
    public int No1;
    public int No2;

    public Arithematic()  //Default constructor
    {System.out.println("inside default constructor");
        this.No1 = 0;
        this.No2 = 0;

    }
    public Arithematic(int i ,int j) // parametrised constructor
    {
        System.out.println("inside parametrised constructor");
         this.No1= i;
         this.No2 = j;
    }
       
    public int Addition()
    {
        int Ans = 0;
        Ans = this.No1 + this.No2;
        return Ans;

    }


    public int Substraction()
    {
        int Ans = 0;
        Ans = this.No1 - this.No2;
        return Ans;

    }
 }
 
 class Oop
  {

    public static void main (String Arg[])
    {
        System.out.println("inside main function");

        Arithematic obj1 = new Arithematic();
        Arithematic obj2 = new Arithematic(11,10);
        
        int iRet = 0;

        iRet = obj1.Addition();  //0
        System.out.println("Addition is"+iRet);

        iRet = obj1.Substraction(); //0
        System.out.println("substraction is"+iRet);

        iRet = obj2.Addition();  //21
        System.out.println("Addition is"+iRet);

        iRet = obj2.Substraction(); //1
        System.out.println("substraction is"+iRet);

    }
    
}
