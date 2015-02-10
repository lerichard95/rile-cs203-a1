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
	
	/*
	* t.remove(elt) -> FiniteSet
	* t: FiniteSet
	* elt: int
	* DESCRIPTION
	* Returns set containing everything in t except elt
	*
	*/
	
	/*
	* t.union(u) -> FiniteSet
	* t: FiniteSet
	* u: FiniteSet
	* DESCRIPTION
	* Returns a set containing everything in t and u
	* 
	*/
	
	/*
	* t.inter(u) -> FiniteSet
	* t: FiniteSet
	* u: FiniteSet
	* DESCRIPTION
	* Returns a set containing everything that is both in t and u
	* 
	*/
	
	/*
	* t.diff(u) -> FiniteSet
	* t: FiniteSet
	* u: FiniteSet
	* DESCRIPTION
	* Returns a set containing everythign in u EXCEPT items in t
	* 
	*/
		
	/*
	* t.equal(u) -> boolean
	* t: FiniteSet
	* u: FiniteSet
	* DESCRIPTION
	* Returns true if t and u contains the same elements
	* 
	*/
	public FiniteSet equal(FiniteSet u);


	/*
	* t.subset(u) -> boolean
	* t: FiniteSet
	* u: FiniteSet
	* DESCRIPTION
	* Returns true if t is a subset of u
	* 
	*/
	
}