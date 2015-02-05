package a1;

public class A1 {
	public static void main(String[] args) {
		// do stuff here

		//Tests
		Leaf leafasdf = new Leaf() ;
		System.out.println("leafasdf.cardinality() -> "
				+ leafasdf.cardinality()
				+ " It should be: " + "0");
		
		//A BST for testing--
		//Is it better to have BST t1 or FiniteSet t1??
		BST leaf = new Leaf();
		BST t1 = new FiniteSet(leaf, 1 ,leaf);
		BST t3 = new FiniteSet(leaf, 3 ,leaf);
		BST t5 = new FiniteSet(leaf, 5 ,leaf);
		BST t7 = new FiniteSet(leaf, 7 ,leaf);
		BST t2 = new FiniteSet(t1, 2, t3);
		BST t6 = new FiniteSet(t5, 6, t7);
		BST t4 = new FiniteSet(t2, 4, t6);
		
		System.out.println( "t4.cardinality: " + t4.cardinality() );
		
		System.out.println( "t4.emptyhuh:" + t4.emptyhuh() );
		System.out.println( "leaf.emptyhuh:" + leaf.emptyhuh() );
		
		/*
	 	System.out.println("This is a test...");
		for (int x = 0; x < 10; x++) {
			for (int y = 0; y < 10; y++) {
				System.out.println("x: " + x + " and y: " + y);
			}
		}
		*/
		
		
	}
}