package iavanish.analysis;

import java.util.HashSet;
import java.util.Set;

public class Lock {

	Set <Object> locks;
	//	a set that can hold references to any type of lock
	
	public Lock() {
		locks = new HashSet <Object> ();
	}
	
}
