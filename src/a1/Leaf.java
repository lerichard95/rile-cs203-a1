package a1;

//Sorta like leaf— an "empty type??" that is only at the bottom of the BST
public class Leaf implements BST {

	Leaf() {}

//---FUNCTION CONTRACT-----------------------------------------------------
	// empty() -> FiniteSet
	// should throw an error because EmptySet shouldn't 
	// be able to return an empty instance of itself?
	public FiniteSet empty() {
		throw new RuntimeException("Cannot return empty of empty");
	}
	
//---FUNCTION CONTRACT-----------------------------------------------------
	//cardinality() -> int
	//no inputs— if a Leaf foo,
	// foo.cardinality() -> int
	public int cardinality() {
		//Empty finite set 
		return 0;
	}
	
	
	public boolean emptyhuh() {
		return true;
	}
	
}