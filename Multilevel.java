class Base
 {
    public int A;
    public int B;

    public Base()
    {
        System.out.println("Inside base constructor");
      this.A= 11;
      this.B =  21;
    }
    public void fun()
    {
        System.out.println("Inside base fun");
    }

 }

 class Derived extends Base //class Derived :public Base
 {
    public int X;
    public int Y;

    public Derived()
    {
        System.out.println("Inside derived constructor");
        this.X = 51;
        this.Y = 101;
    }
    public void gun()
    {
        System.out.println("Inside base gun");
    }
 }
 class DerivedX extends Derived
 {
    public int Z;
    public DerivedX()
    {
        System.out.println("Inside DerivedX constructor");
       this.Z = 111;
    }
 }
 
 class Multilevel
 {

    public static void main(String Arg[])
    {
        DerivedX dobj = new DerivedX();
        dobj.fun();
        dobj.gun();

        System.out.println(dobj.A);
        System.out.println(dobj.B);
        System.out.println(dobj.X);
        System.out.println(dobj.Y);

    }
    
}
