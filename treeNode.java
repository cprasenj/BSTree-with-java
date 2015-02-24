public class TreeNode{
	public TreeNode leftChild = null;
	public TreeNode rightChild = null;
	public int data = 0;

	public TreeNode() {
	}

	public TreeNode(int val) {
		this.data = val;
	}
	
	public void show(){
		System.out.println("leftChild :"+leftChild+"| rightChild :"+rightChild+"| data :"+data);
	};

}