package a1;

public class A1 {
	public static void main(String[] args) {
		
		
		
		
		//Tests
		
		
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
		
		
		System.out.println("-------- BEGIN FUNCTION TESTING --------");
		Leaf leafasdf = new Leaf() ;
		System.out.println("leafasdf.cardinality() -> "
				+ leafasdf.cardinality()
				+ " It should be: " + "0");
		
		System.out.println("t4.cardinality() -> "
				+ t4.cardinality()
				+ " It should be: " + 7);
		
		System.out.println("-------- BEGIN FUNCTION TESTING --------");
		System.out.println("t1.isEmptyHuh() -> "
				+ t1.isEmptyHuh()
				+ " It should be: " + "false");

		System.out.println("t4.isEmptyHuh() -> "
				+ t1.isEmptyHuh()
				+ " It should be: " + "false");
		
		System.out.println("leaf.isEmptyHuh() -> "
				+ t1.isEmptyHuh()
				+ " It should be: " + "true");
		
		System.out.println("-------- BEGIN FUNCTION TESTING --------");
		
		//--- Testing for true, left side
		//lowest level
		System.out.println("t1.member(1) -> "
				+ t1.member(1)
				+ " It should be: " + "true");
		//one level up
		System.out.println("t2.member(1) -> "
				+ t2.member(1)
				+ " It should be: " + "true");
		System.out.println("t2.member(8) -> "
				+ t2.member(8)
				+ " It should be: " + "false");
		//two levels up
		System.out.println("t4.member(1) -> "
				+ t4.member(1)
				+ " It should be: " + "true");
		System.out.println("t4.member(8) -> "
				+ t4.member(8)
				+ " It should be: " + "false");
		System.out.println("t4.member(2) -> "
				+ t4.member(2)
				+ " It should be: " + "true");
		System.out.println("t4.member(8) -> "
				+ t4.member(8)
				+ " It should be: " + "false");
		
		//--- Testing for true, right side
		//Lowest level
		System.out.println("t2.member(3) -> "
				+ t4.member(3)
				+ " It should be: " + "true");
		System.out.println("t2.member(8) -> "
				+ t4.member(8)
				+ " It should be: " + "false");
		//two levels up
		System.out.println("t6.member(5) -> "
				+ t4.member(6)
				+ " It should be: " + "true");
		System.out.println("t6.member(8) -> "
				+ t4.member(8)
				+ " It should be: " + "false");
		System.out.println("t6.member(7) -> "
				+ t4.member(7)
				+ " It should be: " + "true");
		System.out.println("t6.member(8) -> "
				+ t4.member(8)
				+ " It should be: " + "false");

		//highest to lowest
		System.out.println("t4.member(7) -> "
				+ t4.member(7)
				+ " It should be: " + "true");

		
		System.out.println("t4.member(3) -> "
				+ t4.member(3)
				+ " It should be: " + "true");
		System.out.println("t4.member(8) -> "
				+ t4.member(8)
				+ " It should be: " + "false");

		
	}
}