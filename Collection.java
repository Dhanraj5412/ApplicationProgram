import java.util.*;


class Collection 
{
    public static void main (String Arg[])
    {
        
        Hashtable<String, Integer> hobj = new Hashtable<String, Integer>();

        hobj.put("c programming",990);
        hobj.put("c++ programming",1200);
        hobj.put("java programming",780);
        hobj.put("python programming",1650);

        System.out.println("book price of java"+hobj.get("java programming"));
        hobj.remove("c++ programming");
        Enumeration eobj = hobj.keys();
        while(eobj.hasMoreElements())
        {
            System.out.println(eobj.nextElement()); 
        }


    }
    
}

