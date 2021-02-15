import java.util.*;
 
public class ReverseArrayList
{
    public static void main(String[] args) 
    {
        //Creating an ArrayList object         
        ArrayList<String> arrlist = new ArrayList<String>(); 
 
        //Adding elements to ArrayList object 
        arrlist.add("A");         
        arrlist.add("B");        
        arrlist.add("C");
        arrlist.add("D");
        arrlist.add("E");         
    
                 
        //Displaying ArrayList Before Reverse         
        System.out.println("Before Reverse ArrayList:");         
        System.out.println(arrlist);
         
        /*Reversing the list using 
          Collections.reverse() method*/         
        Collections.reverse(arrlist);
         
        //Displaying list after reverse         
        System.out.println("After Reverse ArrayList:");         
        System.out.println(arrlist);
    }
} 