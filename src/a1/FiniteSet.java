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

//---FUNCTION CONTRACT-----------------------------------------------------
	// empty() -> FiniteSet
	// empty() should return a FiniteSet with "empty" for left, right
	public BST empty() {
		//Note on constructor: It seems OK to use Leaf() for left/right because 
		//Leaf implements BST
			return new Leaf();
		}
	
	//cardinality(set) -> int
	//set : FiniteSet
	public int cardinality() {
		//Count 1 for self,
		//add the cardinality of the left and right BST's
		return 1 + this.left.cardinality() + this.right.cardinality();
	 }
	
	// emptyhuh(set) -> boolean
	// set : BST
	public boolean emptyhuh() {
		if ( this.left == new Leaf() ) {
			return true;
		} if ( this.right == new Leaf() ) {
			return true;
		} else
		return false; 
	}
	
}