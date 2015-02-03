//Is it necessary to declare packages with every Java program??...
package a1;

//Eclipse will complain about not putting classes, interfaces, etc 
//in different files but oh well ¯\_(ツ)_/¯ ¯\_(ツ)_/¯ 

//This is the main class???
public class A1 {
	public static void main(String[] args) {
		// do stuff here

		System.out.println("This is a test...");
		for (int x = 0; x < 10; x++) {
			for (int y = 0; y < 10; y++) {
				System.out.println("x: " + x + " and y: " + y);
			}
		}
	}
}

// FiniteSet will implement BST
// What should a BST be able to do?... hmmm
public interface BST {
	// Needs the empty function
	public BST empty();

}

//Sorta like leaf— an "empty type??" that is only at the bottom of the BST
public class EmptySet implements BST {

	EmptySet() {}

	// empty() : void -> FiniteSet
	// should throw an error because EmptySet shouldn't be able to
	// return an empty instance of itself?
	public FiniteSet empty() {
		// Or should EmptySet return a FiniteSet with "empty" left/key/right???
		// weird
		throw new RuntimeException("Cannot return empty of empty");
	}
}

public class FiniteSet implements BST {
	// Instance variables for a BST
	BST left;
	int key;
	BST right;

	// Constructor gives directions for new instances
	FiniteSet(BST left, int key, BST right) {
		// assign inputs of a new instance
		// to the instance variables specified above
		this.left = left;
		this.key = key;
		this.right = right;
	}
	
	// Eclipse says I need a constructor for
	// when FiniteSet.empty() gets called... so here it is
	FiniteSet(EmptySet left, EmptySet key, EmptySet right) {
		// assign inputs of a new instance
		// to the instance variables specified above
		this.left = left;
		this.key = key;
		this.right = right;
	}

	// FiniteSet should implement all the functions in BST

	// empty() : void -> FiniteSet
	// empty() should return a FiniteSet with "empty" for left, right
	// What should go in key?? hmmm...
	public BST empty() {
			return new FiniteSet(
					new EmptySet(),
					/* Key: what should go here anyway*/ new EmptySet(),
					new EmptySet()
					);
		}}

//Need to look at how a BST is made and its components.. getting confused 
//as to what implements what, etc.
