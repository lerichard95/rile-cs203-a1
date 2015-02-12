package a1;

//A FiniteSet IS a node
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
	
	//toString for testing
	public String toString(){
		return "this.left: " + this.left.toString() + ", key:" + this.key + 
				", this.right" + this.right.toString(); 
	}

	// FiniteSet should implement all the functions in BST

	// set.cardinality() -> int
	// set : FiniteSet
	public int cardinality() {
		// Count 1 for self,
		// add the cardinality of the left and right BST's
		return 1 + this.left.cardinality() + this.right.cardinality();
	}

	// set.isEmptyHuh() -> boolean
	// set : BST
	public boolean isEmptyHuh() {
		// FiniteSet can never be empty. Leaf is used to represent empty nodes.
		return false;
		// return this.cardinality() == 0;
	}

	// member(t blt) -> boolean
	// t : FiniteSet
	// blt : integer
	// Difficult to match spec because the input should
	// be able to be any subclasses of BST— including Leaf.
	public boolean member(int blt) {
		if (this.key == blt) {
			return true;
		}
		// left and right need to be instance variables
		// of type BST in order for finite set to hold
		// a Leaf at the bottom...
		// What if this.left/right is a Leaf???
		// Implement member for Leaf also?
		else if (this.left.member(blt)) {
			return true;
		}
		// If the current key ever matches,
		// control will flow only to return true
		return this.right.member(blt);
	}

	// t.add(elt) -> FiniteSet
	// t : FiniteSet
	// elt : integer
	//
	// Not really sure how to do this... should I keep a copy of the entire 
	// root FiniteSet that holds all the other ones, and then keep copies
	// of the parent FiniteSets in order to 

	public FiniteSet add(int elt) {
		// Check if elt is already in the tree/set
		if (this.member(elt)) {
			return this;
		}

		// Traverse tree to find the right place to insert the new FiniteSet
		if (elt > this.key) {
			return this.right.add(elt);
		}
		if (elt < this.key) {
			return this.left.add(elt);
		}
		
		//Just experimenting... 
		//  Reached lowest level of FiniteSet tree, decide which direction to
		//  place new FiniteSet— set it to 
		if (elt > this.key) {
			this.right = new FiniteSet(new Leaf(), elt, new Leaf());
		}
		if (elt < this.key) {
			this.left = new FiniteSet(new Leaf(), elt, new Leaf());
		}
		
		return new FiniteSet(new Leaf(), elt, new Leaf());
	}

	public boolean equal(FiniteSet u) {
		// IDEA:
		// Check cardinality, if they are not same size, they should not be
		// the same set.
		// Loop through all elements of both trees, compare if keys are
		// equal to each other

		if (this.cardinality() == u.cardinality()) {
			
			//Begin looping through all elements
			
			//REMOVE THIS:
			return false;
			//
			
			
		} else {
			return false;
		}

	}

}