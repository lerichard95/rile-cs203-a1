package a1;

import java.util.Random;

public class TreeGen {
	BST tree;
	Random rand = new Random();

	public TreeGen() {
	}

	//  Thanks to Nicholas Burka for acknowedging the importance of setting
	//  tree to accomodate for lack of mutation
	public BST randTree(int num, int range) {
		tree = new Leaf();

		for (int i = 0; i <= num; i++) {
			int randKey = 1 + rand.nextInt(range);
			tree = tree.add(randKey);
		}
		return tree;
	}

	public BST exhaustTree(int start, int end) {
		tree = new Leaf();

		for (int i = start; i <= end; i++) {
			tree = tree.add(i);
		}
		return tree;
	}

}
