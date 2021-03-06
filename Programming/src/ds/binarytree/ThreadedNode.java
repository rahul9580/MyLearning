/**
 * 
 */
package ds.binarytree;

/**
 * @author rahul
 *
 */
public class ThreadedNode {
	private int				data;
	private ThreadedNode	left;
	private ThreadedNode	right;
	private boolean			threaded;

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public ThreadedNode getLeft() {
		return left;
	}

	public void setLeft(ThreadedNode left) {
		this.left = left;
	}

	public ThreadedNode getRight() {
		return right;
	}

	public void setRight(ThreadedNode right) {
		this.right = right;
	}

	public boolean isThreaded() {
		return threaded;
	}

	public void setThreaded(boolean threaded) {
		this.threaded = threaded;
	}
}