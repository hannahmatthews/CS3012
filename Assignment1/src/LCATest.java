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

}
