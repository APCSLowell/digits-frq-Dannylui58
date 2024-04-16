import java.util.ArrayList;

public class Digits
{

	private ArrayList<Integer> digitList;

	public Digits(int num)
	{ /* to be implemented in part (a) */ 
	    List = new ArrayList <Integer>();
		if(num==0)
			List.add(0);
		int i = num;
		while(i>0){
			List.add(0,i%10);
			n=n/10;
		}
	}

	public boolean isStrictlyIncreasing()
	{ /* to be implemented in part (b) */
		for(int i =0;i<List.size()-1;i++)
			if(List.get(i+1)<=List.get(i))
				return false;
		return true;

	}
	
	public String toString()
	{
		return digitList.toString();
	}
}
