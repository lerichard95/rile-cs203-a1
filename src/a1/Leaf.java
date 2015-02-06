package a1;

//Sorta like leaf— an "empty type??" that is only at the bottom of the BST
public class Leaf implements BST {

	Leaf() {}

	//---FUNCTION CONTRACT-----------------------------------------------------
	// empty() -> FiniteSet
	// empty() should return a FiniteSet with "empty" for left, right
	public Leaf empty() {
	//Note on constructor: It seems OK to use Leaf() for left/right because 
	//Leaf implements BST
			return new Leaf();
	}
	
//---FUNCTION CONTRACT-----------------------------------------------------
	//cardinality() -> int
	//no inputs— if a Leaf foo,
	// foo.cardinality() -> int
	public int cardinality() {
		//Empty finite set 
		return 0;
	}
	
	public boolean isEmptyHuh() {
		return true;
	}
	
	public boolean member(int blt) {
		return false;
	}
}