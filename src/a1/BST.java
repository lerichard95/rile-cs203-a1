package a1;

//FiniteSet will implement BST, and all its functions
public interface BST {
	public int cardinality();
	public boolean isEmptyHuh();
	public boolean member(int blt);


	//t.add(elt) -> FiniteSet
	// t : FiniteSet
	// elt : integer
	public FiniteSet add(int elt);
	
}

