import java.lang.IndexOutOfBoundsException;
import java.util.ArrayList;

public class MyStringStack {

	private ArrayList<String> v = new ArrayList<String> ();

	public void push(String newElement){
		if (newElement != null) 
			v.add(newElement);	
	}	

	public boolean isEmpty(){
		return v.isEmpty();		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
