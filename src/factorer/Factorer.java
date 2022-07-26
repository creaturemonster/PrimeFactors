package factorer;

import java.util.ArrayList;
import java.util.List;

public class Factorer {

	public List<Integer> factor(int numberToBeFactored) {
		
		List<Integer> factors = new ArrayList<Integer>();
		
		int divisor = 2;
		
		while (numberToBeFactored > 1)  {
		  while (numberToBeFactored % divisor == 0) {		
				factors.add(divisor);
				numberToBeFactored /=divisor;
			}
		
			divisor++;
	}

		
		return factors;
	}

}
