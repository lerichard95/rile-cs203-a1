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
		return this.cardinality() == 0;
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
	// Since add is a pure implementation, it needs to return all of t
	// with elt added to it.
	public FiniteSet add(int elt) {
		// Check if elt is already a member of the FiniteSet
		if (this.member(elt)) {
			return this;
		}
		
		// Once at the lowest level, decide which direction to place new key
		if (this.cardinality() == 1) {
			FiniteSet out;
			out = this;
			if (elt < this.key) {
				// Set left BST to a new FiniteSet holding key
				out.left = new FiniteSet(new Leaf(), elt, new Leaf());
			} else {
				// Set right BST to a new FiniteSet holding the key
				out.right = new FiniteSet(new Leaf(), elt, new Leaf());
			}
			
			
		}

		// Hold onto a copy of the current input
		FiniteSet temp = this;

		// Not at the end yet- continue recursion
		// Decide if elt should be placed in left or right BST
		if (elt < this.key) {
			this.left.add(elt);
		} else if (elt > this.key) {
			this.right.add(elt);
		}

	}

}