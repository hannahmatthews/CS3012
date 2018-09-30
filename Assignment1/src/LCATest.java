import static org.junit.Assert.*;

import org.junit.Test;

public class LCATest {

	@Test
	public void testNodeConstructor(){
		Node temp = new Node(1);
		assertNotNull("Testing Node Constructor: ", temp);
	}
	
	@Test
	public void testEmptyTree() {
		
		LCA tree = new LCA();
		assertNull("Find LCA when tree is empty: ", tree.findLCA(1, 2));
		assertEquals("Find LCA when tree is empty: ", null, tree.findLCA(1, 2) );
	}

	@Test
	public void testTwoNodes(){
		
		//test tree structure:
		//			1
		//		5

		LCA tree = new LCA();
		tree.root = new Node(1);
		tree.root.left = new Node(5);

		assertEquals("Find LCA of tree with only root and one child: ", 1, tree.findLCA(1, 5).data);	
	}
	
	@Test
	public void testForNonExistentNodes(){
	
		//test tree structure:
		//		1	
		//	4		6
		//6   10   12   14
		LCA tree = new LCA();
		tree.root = new Node(1);
		tree.root.left = new Node(4);
		tree.root.right = new Node(6);
		tree.root.left.left = new Node(8);
		tree.root.left.right = new Node(10);
		tree.root.right.left = new Node(12);
		tree.root.right.right = new Node(14);
		
		assertEquals("Find ancestors of non-existent nodes: ", null, tree.findLCA(3, 9));
		assertEquals("Find ancestors of non-existent nodes: ", null, tree.findLCA(45, 93));
	}

}
