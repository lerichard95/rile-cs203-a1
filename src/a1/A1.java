package a1;

public class A1 {
	public static void main(String[] args) {

		// Tests
		boolean testsEnabled = true;

		if (testsEnabled) {

			// A BST for testing
			BST leaf = new Leaf();
			BST t1 = new FiniteSet(leaf, 1, leaf);
			BST t3 = new FiniteSet(leaf, 3, leaf);
			BST t5 = new FiniteSet(leaf, 5, leaf);
			BST t7 = new FiniteSet(leaf, 7, leaf);
			BST t2 = new FiniteSet(t1, 2, t3);
			BST t6 = new FiniteSet(t5, 6, t7);
			BST t4 = new FiniteSet(t2, 4, t6);

			// Test: empty()
			System.out.println(leaf.empty());

			System.out.println("-------- Test: cardinality() --------");
			Leaf leafasdf = new Leaf();
			System.out.println("leafasdf.cardinality() -> "
					+ leafasdf.cardinality() + " It should be: " + "0");

			System.out.println("t4.cardinality() -> " + t4.cardinality()
					+ " It should be: " + 7);

			System.out.println("-------- Test: isEmptyHuh() --------");
			System.out.println("t1.isEmptyHuh() -> " + t1.isEmptyHuh()
					+ " It should be: " + "false");

			System.out.println("t4.isEmptyHuh() -> " + t1.isEmptyHuh()
					+ " It should be: " + "false");

			System.out.println("leaf.isEmptyHuh() -> " + t1.isEmptyHuh()
					+ " It should be: " + "true");

			System.out.println("-------- Test: member() --------");

			// --- Testing for true, left side
			// lowest level
			System.out.println("t1.member(1) -> " + t1.member(1)
					+ " It should be: " + "true");
			// one level up
			System.out.println("t2.member(1) -> " + t2.member(1)
					+ " It should be: " + "true");
			System.out.println("t2.member(8) -> " + t2.member(8)
					+ " It should be: " + "false");
			// two levels up
			System.out.println("t4.member(1) -> " + t4.member(1)
					+ " It should be: " + "true");
			System.out.println("t4.member(8) -> " + t4.member(8)
					+ " It should be: " + "false");
			System.out.println("t4.member(2) -> " + t4.member(2)
					+ " It should be: " + "true");
			System.out.println("t4.member(8) -> " + t4.member(8)
					+ " It should be: " + "false");

			// --- Testing for true, right side
			// Lowest level
			System.out.println("t2.member(3) -> " + t4.member(3)
					+ " It should be: " + "true");
			System.out.println("t2.member(8) -> " + t4.member(8)
					+ " It should be: " + "false");
			// two levels up
			System.out.println("t6.member(5) -> " + t4.member(6)
					+ " It should be: " + "true");
			System.out.println("t6.member(8) -> " + t4.member(8)
					+ " It should be: " + "false");
			System.out.println("t6.member(7) -> " + t4.member(7)
					+ " It should be: " + "true");
			System.out.println("t6.member(8) -> " + t4.member(8)
					+ " It should be: " + "false");

			// highest to lowest
			System.out.println("t4.member(7) -> " + t4.member(7)
					+ " It should be: " + "true");

			System.out.println("t4.member(3) -> " + t4.member(3)
					+ " It should be: " + "true");
			System.out.println("t4.member(8) -> " + t4.member(8)
					+ " It should be: " + "false");

			// Testing add()
			System.out.println("-----------  Testing add()  -----------");

			// Adding existing elements to FiniteSet
			// All of these should be identical
			System.out
					.println("-------  Testing add() existing elements -------");
			System.out.println(t4.add(4));
			System.out.println(t4.add(1));
			System.out.println(t4.add(2));
			System.out.println(t4.add(3));
			System.out.println(t4.add(5));
			System.out.println(t4.add(6));
			System.out.println(t4.add(7));

			System.out
					.println("-----  End testing add() existing elements -----");

			// Test: Implementation is pure
			// Second prints should not return a FiniteSet with the element
			// added in line above...

			// Adding 0 and 8
			System.out.println(t4.add(0).add(8));
			System.out.println(t4);

			System.out.println(t4.add(9));
			System.out.println(t4.add(0).add(8));

			System.out.println("----- Adding larger numbers Y, "
					+ "then adding numbers in between largest number in "
					+ "initial set X -----");

			System.out.println(t4.add(10).add(8));
			System.out.println(t4.add(15).add(9).add(8));

			// MORE TESTING: remove
			System.out.println("----- TEST: remove (1) -----");

			// remove test 1: make an exhaustive tree and remove
			// everything from it
			TreeGen treeGen = new TreeGen();
			BST exhaustTree = treeGen.exhaustTree(11);

			System.out.println("Initial exhaustTree:");
			System.out.println(exhaustTree);

			System.out.println("Begin removing");
			for (int i = 1; i <= 10; i++) {
				exhaustTree = exhaustTree.remove(i);
				System.out.println(exhaustTree);

			}

			// remove test 2: remove items from an empty set
			System.out.println("----- TEST: remove (2) -----");
			BST testLeaf = new Leaf();
			System.out.println("Initial Leaf:");
			System.out.println(testLeaf);
			System.out.println("Start testLeaf.remove() calls:");
			for (int i = 1; i <= 10; i++) {
				testLeaf = testLeaf.remove(i);
				System.out.println(testLeaf);
			}

			System.out.println("----- TEST: union (1) -----");
			// Union of empty set and non-empty set
			// Should return the non-empty set
			BST testLeaf2 = new Leaf();
			BST exhaustTree2 = treeGen.exhaustTree(11);

			System.out.println(testLeaf2.union(exhaustTree2));
		}
		
		

		// end of main
	}

}