class Base
 {
    public int A;
    

    public Base()
    {
        System.out.println("Inside base default constructor");
      this.A= 11;
      
    }
    public Base(int i)
    {
        System.out.println("Inside  base parameterised constructor");
      this.A= i;
      
    }
    public void fun()
    {
        System.out.println("Inside base fun");
    }

 }

 class Derived extends Base 
 {
    public int X;
    

    public Derived()
    {
        super(11);   //3
        System.out.println("Inside derived constructor");
        this.X = 51;

    }
    public void gun()
    {
        System.out.println("Inside derived gun");
        System.out.println("value of A :"+super.A);//1
        super.fun(); //2
    }
 }
 
 class SuperDemo 
 {

    public static void main(String Arg[])
    {
        Derived dobj = new Derived();
        
        dobj.gun();


        
        
        

    }
    
}

