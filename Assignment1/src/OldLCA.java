
// I have had to rename everything as 'OldLCA' and 'findOldLCA' as I am making a new LCA file, and I want the functions in that 
// file to be named 'LCA' and 'findLCA'. 
// I would have ideally liked to have made a new java project, but I wanted all of my commits to be in the same repository.


class Node  {
	
    int data; 
    Node left, right; 
   
    Node(int item)  
    { 
        data = item; 
        left = right = null; 
    } 
} 

public class OldLCA {
	
	Node root;
	
	Node findOldLCA(int n1, int n2) {
		return findOldLCA(root, n1, n2);
	}
	
	Node findOldLCA(Node Node, int n1, int n2) {

		if (Node == null) {
			return null;
		}

		if (Node.data == n1 || Node.data == n2) {
			return Node;
		}

		Node left = findOldLCA(Node.left, n1, n2);
		Node right = findOldLCA(Node.right, n1, n2);

		if (left != null && right != null) {
			return Node;
		}

		if (left != null) {
			return left;
		} else {
			return right;
		}

	}
	
}
