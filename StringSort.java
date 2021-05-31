import java.util.*;

class print
{
    public static void n(Object val)
    {
        System.out.println(val);
    }
    public static void l(Object val)
    {
        System.out.print(val);
    }
}


public class sorting_names {
    public static void main(String [] args)
    {
    			int n,i,j;
    			String temp;
    			Scanner input=new Scanner (System.in);
    			print.n("How many names do you want to sort : ");
    			n=input.nextInt();
    			String names[]=new String[n];
        print.n("You would enter "+n+" names : ");
        for(i=0;i<n;i++)
        {
            print.l("Name  : "+(i+1)+" ");
            names[i]=input.next();
        }
        /* sorting Starts here*/
        for(i=0;i<n;i++)
        {
            
            names[i]=names[i].toUpperCase();
        }
        for(i=1;i<n;i++)
        {
            temp=names[i];
            j=i-1;
            while(j>=0 && temp.compareTo(names[j])<0)
            {
                names[j+1]=names[j];
                j-=1;
            }
            names[j+1]=temp;
        }
        
        //converting all the syring to capital
        
        
       
        
        
        //---+after sorting---------
        print.n("After Sorting");
        for(String x:names)
        {
            print.n("Name : "+x);
        }
        input.close();
        
    	}
}
