public class tree{
	public treeNode root = null;
	public int countOfNode = 0;

	public tree() {
	}
	public tree(treeNode node) {
		this.root = node;
	}

	public int insert(int val) {
		treeNode node = null;
		if(root == null){
			node = new treeNode(val); 
			this.root = node;
			return 1; 
		}
		if(root!=null){
			if(root.data < val && root.rightChild == null){
				node = new treeNode(val);
				root.rightChild = node;
				return 1; 
			}
			if(root.data > val && root.leftChild == null){
				node = new treeNode(val);
				root.leftChild = node;
				return 1; 
			}
			if(root.data > val && root.leftChild != null){
				tree subTree = new tree(this.root.leftChild);
				subTree.insert(val);
				return 1;
			}
			if(root.data < val && root.rightChild != null) {
				tree subTree = new tree(this.root.rightChild);
				subTree.insert(val);
				return 1;
			}
		}
		return 1;
	}
}	




