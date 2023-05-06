class Base
 {
    public void fun()
    {
        System.out.println("base fun");
    }
    final public void gun()
    {
        System.out.println("base gun");
    }
   
 }
 class Derived extends Base
 {
    public void fun()
    {
        System.out.println("derived fun");
    }
    /*  public void gun()
    {
        System.out.println("derived gun");
    }*/

 }
 
 class final2
  {

    public static void main(String Arg[])
    {
        Base bobj = new Derived();
        bobj.fun();
        bobj.gun();

    }
    
}

