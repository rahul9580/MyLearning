package companies.VMWare;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution1 {
	public static class LinkedListNode {
		int				val;
		LinkedListNode	next;

		LinkedListNode(int node_value) {
			val = node_value;
			next = null;
		}
	}

	public static LinkedListNode _insert_node_into_singlylinkedlist(LinkedListNode head, LinkedListNode tail, int val) {
		if (head == null) {
			head = new LinkedListNode(val);
			tail = head;
		} else {
			tail.next = new LinkedListNode(val);
			tail = tail.next;
		}
		return tail;
	}

	public static LinkedListNode deleteNodes(LinkedListNode head, int k) {
		LinkedListNode node = head;
		LinkedListNode preNode = null;
		while (node != null) {
			LinkedListNode thisNode = node;
			if (node.val > k) {
				LinkedListNode nextOfGreaterNode = node.next;
				if (nextOfGreaterNode != null) {
					node.val = nextOfGreaterNode.val;
					node.next = node.next.next;
					thisNode = preNode;
				} else {
					if (preNode == null) {
						head = null;
					} else {
						preNode.next = null;
						node = null;
					}
				}
			} else {
				node = node.next;
			}
			preNode = thisNode;
		}
		return head;
	}
	
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			int n = Integer.valueOf(br.readLine());
			int arr[] = new int[n];
			for(int i = 0; i< n; i++) {
				arr[i] = Integer.valueOf(br.readLine());
			}
			LinkedListNode head = _insert_node_into_singlylinkedlist(null, null, arr[0]);
			LinkedListNode tail = head;
			for(int i = 1; i< n; i++) {
				tail =  _insert_node_into_singlylinkedlist(head, tail, arr[i]);
			}
			head = deleteNodes(head, 3);
			LinkedListNode nd = head;
			while(nd != null) {
				System.out.println(nd.val);
				nd = nd.next;
			}
		} catch (NumberFormatException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
