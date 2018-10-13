import static org.junit.Assert.*;

import org.junit.Test;

public class OldLCATest {

	@Test
	public void testNodeConstructor(){
		Node temp = new Node(1);
		assertNotNull("Testing Node Constructor: ", temp);
	}
	
	@Test
	public void testEmptyTree() {
		
		OldLCA tree = new OldLCA();
		assertNull("Find OldLCA when tree is empty: ", tree.findOldLCA(1, 2));
		assertEquals("Find OldLCA when tree is empty: ", null, tree.findOldLCA(1, 2) );
	}

	@Test
	public void testTwoNodes(){
		
		//test tree structure:
		//			1
		//		5

		OldLCA tree = new OldLCA();
		tree.root = new Node(1);
		tree.root.left = new Node(5);

		assertEquals("Find OldLCA of tree with only root and one child: ", 1, tree.findOldLCA(1, 5).data);	
	}
	
	@Test
	public void testForNonExistentNodes(){
	
		//test tree structure:
		//		1	
		//	4		6
		//8   10   12   14
		OldLCA tree = new OldLCA();
		tree.root = new Node(1);
		tree.root.left = new Node(4);
		tree.root.right = new Node(6);
		tree.root.left.left = new Node(8);
		tree.root.left.right = new Node(10);
		tree.root.right.left = new Node(12);
		tree.root.right.right = new Node(14);
		
		assertEquals("Find ancestors of non-existent nodes: ", null, tree.findOldLCA(3, 9));
		assertEquals("Find ancestors of non-existent nodes: ", null, tree.findOldLCA(21, 22));
	}

	@Test
	public void testCommonAncestor(){
		
		//test tree structure:
		//		1	
		//	4		6
		//8   10   12   14
		OldLCA tree = new OldLCA();
		tree.root = new Node(1);
		tree.root.left = new Node(4);
		tree.root.right = new Node(6);
		tree.root.left.left = new Node(8);
		tree.root.right.left = new Node(12);
		tree.root.right.right = new Node(14);

		assertEquals("OldLCA of 8 and 10: ", 4, tree.findOldLCA(8, 10).data);
		assertEquals("OldLCA of 12 and 14: ", 6, tree.findOldLCA(12, 14).data);
		assertEquals("OldLCA of 8 and 12: ", 1, tree.findOldLCA(8, 12).data);
		assertEquals("OldLCA of 8 and 14: ", 1, tree.findOldLCA(8, 14).data);

	}
	
	
	
	
	
	
}
