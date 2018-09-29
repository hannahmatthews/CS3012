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
}
