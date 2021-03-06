/**
 * 
 */
package companies;

import ds.binarytree.Node;

/**
 * @author rahul
 *
 */
public class Pramati {

	public boolean areTreeIdentical(Node root1, Node root2) {
		if (null == root1 && null == root2)
			return true;
		if (null != root1 && null != root2 && root1.getData() == root2.getData()) {
			return areTreeIdentical(root1.getLeft(), root2.getLeft()) && areTreeIdentical(root1.getRight(), root2.getRight());
		}
		return false;
	}

	public boolean idT2SubtreeOfT1(Node node1, Node node2) {
		if (node1 == null && node2 == null)
			return true;
		if (node1 == null || node2 == null)
			return false;
		if (node1.getData() == node2.getData()) {
			return idT2SubtreeOfT1(node1.getLeft(), node2.getLeft()) && idT2SubtreeOfT1(node1.getRight(), node2.getRight());
		} else {
			return idT2SubtreeOfT1(node1.getLeft(), node2) || idT2SubtreeOfT1(node1.getRight(), node2);
		}
	}

	public void winGame(int n, int arr[], Node node, Node node1) {

		if (n < 0)
			return;
		if (n == 0) {
			node.setData(node.getData() + 1);
			return;
		}
		for (int i = node1.getData(); i < arr.length; i++) {
			winGame(n - arr[i], arr, node, node);
		}
		Node no = new Node(node1.getData() + 1);
		node1 = no;
	}

	public static void main(String[] args) {
		int arr[] = { 2, 3, 5 };
		Node node = new Node(0);
		Node node1 = new Node(0);
		Pramati obj = new Pramati();
		obj.winGame(5, arr, node, node1);
		System.out.println(node.getData());
	}

	public void removeDuplicates(char arr[], int n) {
		char hash[] = new char[256];
		for (char i = 0; i < n; i++) {
			if (hash[arr[i]] == 0) {
				hash[arr[i]] = i;
			}
		}

		for (int i = 0; i < n; i++) {
			arr[i] = 0;
		}
		for (char i = 0; i < 256; i++) {
			if (hash[i] != 0) {
				arr[hash[i]] = i;
			}
		}
		int j = 0;
		for (int i = 0; i < n; i++) {
			if (arr[i] != 0) {
				arr[j] = arr[i];
				j++;
			}
		}
	}
}
