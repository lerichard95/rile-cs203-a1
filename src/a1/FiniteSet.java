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

	// toString for testing
	public String toString() {
		return "FiniteSet(" + this.left.toString() + ", " + this.key + ", " 
				+ this.right.toString() + ")";
	}

	// FiniteSet should implement all the functions in BST

	
	public BST empty(){
		return new Leaf();
	}
	
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
		//Thanks to Atticus K for a better way to imagine adding "nodes"
		
		// key == elt
		// Just return the current FiniteSet "node"
		if (this.key == elt) {
			return this;
		}
		
		// elt < key
		// Returning a new FiniteSet allows a tree to be "rebuilt" upon 
		// successive recursive calls
		//
		// The new FiniteSet should hold the current key, preseve the FiniteSet
		// that will not be modified, and call add() on the respective FiniteSet
		// that elt should belong to...
		// 
		// 
		// When add() reaches a Leaf, the add() implementation for Leaf will
		// create a FiniteSet that holds elt, with Leaf for left and right.
		// Since this is the last return, recursion will stop, and the 
		// new instances of FiniteSet built on successive add() calls will 
		// return a new root FiniteSet, making add() a pure implementation.
		// 
		
		if (elt < this.key) {
			return new FiniteSet(left.add(elt), key, right);
		}
		
		// elt > this.key
		else {
			return new FiniteSet(left, key, right.add(elt));
		}
	}

	//TODO: figure out remove
	public FiniteSet remove(int blt) {
		if (this.key == blt) {
			
		}
	}
	
	public boolean equal(FiniteSet u) {
		// IDEA:
		// Check cardinality, if they are not same size, they should not be
		// the same set.
		// Loop through all elements of both trees, compare if keys are
		// equal to each other

		if (this.cardinality() == u.cardinality()) {

			// Begin looping through all elements

			// REMOVE THIS:
			return false;
			//

		} else {
			return false;
		}

	}

}