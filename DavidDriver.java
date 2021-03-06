public class DavidDriver{

	public static void main(String[] args){
		SuperArray beef = new SuperArray();
		/**phase 1 testing start*/
		System.out.println("Phase 1 testing, start!");

		//testing SuperArray initializing
		System.out.println("\n!!Testing SuperArray initializing!!");
		System.out.println("Testing toString(): should return []");
		System.out.println(beef);
		System.out.println("\nTesting toStringDebug(): should return [null, ... null]");
		System.out.println(beef.toStringDebug());

		//testing size()
		System.out.println("\n\n!!Testing size()!!");
		System.out.println("Testing size(): should return 0");
		System.out.println(beef.size());

		//testing add()
		System.out.println("\n\n!!Testing add()!!");
		System.out.println("Testing add() while empty: should return true");
		System.out.println(beef.add("red"));
		System.out.println("\nChecking add() and toString(): should return [red]");
		System.out.println(beef);
		beef.add("cow");
		System.out.println("\nChecking add() and toString(): should return [red, cow]");
		System.out.println(beef);
		for (int x = 0; x < 8; x++){
			beef.add("filler");
		}
		System.out.println("\n\nTesting add() while full: should return true(after phase 2)");
		System.out.println(beef.add("full"));

		//testing clear()
		System.out.println("\n\n!!Testing clear()!!");
		System.out.println("Testing clear(): should return []");
		beef.clear();
		System.out.println(beef);
		System.out.println("\nTesting clear() and size(): should return 0");
		System.out.println(beef.size());
		System.out.println("\nTesting add(\"red\") after clear(): should return true");
		System.out.println(beef.add("red"));
		System.out.println("\nSeeing SuperArray: should be [red]");
		System.out.println(beef);
		beef.clear();

		//testing get()
		System.out.println("\n\n!!Testing get()!!");
		System.out.println("Testing get() while empty: should return null");
		System.out.println(beef.get(0));
		beef.add("red");
		beef.add("cow");
		beef.add("meat");
		System.out.println("\nTesting get() with indices 0-2 filled: should return values *check code*");
		System.out.println(beef.get(0));
		System.out.println(beef.get(1));
		System.out.println(beef.get(2));
		System.out.println("\nTesting get() for out of bounds: should return null");
		System.out.println(beef.get(-1));
		System.out.println(beef.get(10));

		//testing set()
		System.out.println("\n\n!!Testing set()!!");
		System.out.println("Using SuperArray from !!testing get()!!");
		System.out.println(beef);
		System.out.println("\nTesting set(0, \"blue\"): should return red");
		System.out.println(beef.set(0, "blue"));
		System.out.println("SuperArray should now be [blue, cow, meat]");
		System.out.println(beef);
		System.out.println("\nTesting set(1, \"fish\"): should return cow");
		System.out.println(beef.set(1, "fish"));
		System.out.println("SuperArray should now be [blue, fish, meat]");
		System.out.println(beef);
		System.out.println("\nTesting set(2, \"vegetal\"): should return meat");
		System.out.println(beef.set(2, "vegetal"));
		System.out.println("SuperArray should now be [blue, fish, vegetal]");
		System.out.println(beef);
		System.out.println("\nUsing empty SuperArray ");
		beef.clear();
		System.out.println("\nTesting set(2, \"vegetal\"): should return null");
		System.out.println(beef.set(2, "vegetal"));
		System.out.println("SuperArray should now be []");
		System.out.println(beef);
		/** phase 1 testing end*/
	/*phase 2 testing start*/
	beef.clear();
	System.out.println("Testing resize function: should print 0-99");
	for (int i=0;i<100;i++){
		beef.add(""+i);}
	System.out.println(beef);
	System.out.println("Testing contains:");
	System.out.println("Should print true: "+beef.contains("8"));
System.out.println("Should print false: "+beef.contains("801"));
beef.clear();
beef.add("cow");
beef.add("hey");
beef.add("hello");
beef.add("hello1");
beef.add("cow");
System.out.println("New beef list: " + beef);
System.out.println("Testing indexOf and lastIndexOf:");
System.out.println("Should print 0: "+ beef.indexOf("cow"));
System.out.println("Should print 4: "+ beef.lastIndexOf("cow"));
System.out.println("Should print 2: "+ beef.lastIndexOf("hello"));
System.out.println("Should print -1: "+ beef.lastIndexOf("yoyo"));
System.out.println("Should print -1: "+ beef.indexOf("yoyoyoy"));
beef.add(3,"mouth");
System.out.println("Testing add(3,'mouth'): "+beef);
System.out.println("beef.add(90,'mouth') yields: ");
beef.add(90,"mouth");
beef.remove(3);
System.out.println("beef.remove(3) yields: ");
System.out.println(beef.remove(3));
System.out.println(beef);
System.out.println("beef.remove(19) yields: ");
System.out.println(beef.remove(19));
System.out.println("beef.remove('cow') yields: ");
System.out.println(beef.remove("cow"));
System.out.println("beef is now: "+beef);
System.out.println("beef.remove('cowly') yields: ");
System.out.println(beef.remove("cowly"));
System.out.println("beef is now: "+beef);
	}
}
