package mypack;

import javax.ejb.Stateless;

@Stateless(
		mappedName="adderSubtractor")
public class AdderSubtractorBean 
implements AdderSubtractor {

	public int add(int x, int y) {
		
		return x+y;
	}

	public int subtract(int x, int y) {
		return x-y;
	}

}
