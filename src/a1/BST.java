package a1;

//FiniteSet will implement BST, and all its functions
public interface BST {
	public int cardinality();
	public boolean isEmptyHuh();
	public boolean member(int blt);


	//(add t elt) → finite-set
	// t : finite-set
	// elt : integer
	public FiniteSet add(FiniteSet t, int elt);
	
}

