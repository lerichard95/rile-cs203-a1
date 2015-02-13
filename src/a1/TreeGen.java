package a1;

import java.util.Random;

public class TreeGen {
	BST tree;
	Random rand = new Random();

	public TreeGen() {
	}

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
