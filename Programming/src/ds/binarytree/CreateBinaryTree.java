/**
 * 
 */
package ds.binarytree;

/**
 * @author rahul
 *
 */
public class CreateBinaryTree {
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {

		BinaryTreeOperations binaryTreeOperations = new BinaryTreeOperations();
		BSTOperations bstOperations = new BSTOperations();
		Node root = new Node(1);
		Node rootLeft = new Node(2);
		Node rootright = new Node(3);
		root.setLeft(rootLeft);
		root.setRight(rootright);
		rootLeft.setLeft(new Node(4));
		rootLeft.setRight(new Node(5));
		rootright.setLeft(new Node(6));
		rootright.setRight(new Node(7));
		
		/*int path[] = new int[3];
		binaryTreeOperations.printAllRootToLeafPath(root, path, 0);
		//System.out.println(bstOperations.findSumOfNEleAfterKthSmallest(root, 1, 2, 0, 0));
		
		//System.out.println(binaryTreeOperations.calculateHight(root));
		binaryTreeOperations.childrenSumTree(root);
		binaryTreeOperations.printAllRootToLeafPath(root, path, 0);
		System.out.println(binaryTreeOperations.diameterOpt(root));*/
		//binaryTreeOperations.inOrderWithoutRecursion(root);
		//binaryTreeOperations.convertToThreadedBinaryTree(root);
		System.out.println("Rahul");
	}

}
