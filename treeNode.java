public class treeNode{
	public treeNode leftChild = null;
	public treeNode rightChild = null;
	public int data = 0;

	public treeNode() {
	}

	public treeNode(int val) {
		this.data = val;
	}
	
	public void show(){
		System.out.println("leftChild :"+leftChild+"| rightChild :"+rightChild+"| data :"+data);
	};

}