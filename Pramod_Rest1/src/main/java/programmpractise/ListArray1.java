package programmpractise;

import java.util.ArrayList;

public class ListArray1 {

	public static void main(String[] args) {
		// Compare strings in two different arraylist (JAVA)
		
		ArrayList<String> Alist= new ArrayList<String>();
		  ArrayList<String> Blist= new ArrayList<String>(); 

		  Alist.add("gsm");
		  Alist.add("tablet");
		  Alist.add("pc");
		  Alist.add("mouse");

		  Blist.add("gsm");
		  Blist.add("something");
		  Blist.add("pc");
		  Blist.add("something");
		  
		  for (int i = 0; i < Alist.size(); i++) {
			    if (Blist.contains(Alist.get(i))) {
			        System.out.println("Equals..: " + Alist.get(i));
			    }
			}

	}

}


/*
 for (String a : Alist)
    {
        for (String b : Blist)
        {
            if (a.equals(b))
            {
                System.out.println("Equals " + a);
                break;
            }
        }  */
