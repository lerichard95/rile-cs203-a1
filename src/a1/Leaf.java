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
	
	public String toString(){
		return "Leaf()";
	}
	
	//cardinality() -> int
	//no inputs— if a Leaf foo,
	// foo.cardinality() -> int
	public int cardinality() {
		//Empty finite set 
		return 0;
	}
	
	public boolean isEmptyHuh() {
		//Leaves are always empty
		return true;
	}
	
	public boolean member(int blt) {
		return false;
	}
	
	public FiniteSet add(int elt) {
		//Return a new FiniteSet with empty left/rights
		//with the added key elt
		return new FiniteSet(new Leaf(), elt ,new Leaf());
	}
	
	/*
	* t.equal(u) -> boolean
	* t: FiniteSet
	* u: FiniteSet
	* DESCRIPTION
	* Returns true if t and u contains the same elements
	* 
	*/
	public boolean equal(FiniteSet u) {
		//since all Leafs are empty, if u is empty also, then they are equal 
		return (u.isEmptyHuh());
	}
	
}