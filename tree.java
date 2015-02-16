public class tree{
	public treeNode root = null;
	public int countOfNode = 0;

	public tree() {
	}
	public tree(treeNode node) {
		this.root = node;
	}
	private void rootInsert(treeNode node,int val) {
		if(root == null) {
			node = new treeNode(val); 
			this.root = node;
		}
	}
	private void ifRightChildNull(treeNode node,int val) {
		if(root.data < val && root.rightChild == null){
			node = new treeNode(val);
			root.rightChild = node;
		}
	}
	private void ifleftChildNull(treeNode node,int val) {
		if(root.data > val && root.leftChild == null){
			node = new treeNode(val);
			root.leftChild = node;
		}
	}
	private void ifleftChildNotNull(treeNode node,int val) {
		if(root.data > val && root.leftChild != null){
			tree subTree = new tree(this.root.leftChild);
			subTree.insert(val);
		}
	}
	private void ifrightChildNotNull(treeNode node,int val) {
		if(root.data < val && root.rightChild != null){
			tree subTree = new tree(this.root.rightChild);
			subTree.insert(val);
		}
	}
	private boolean isLeafNode(treeNode noad) {
		return (noad.rightChild == null && noad.leftChild == null) ? true : false;
	}
	public void insert(int val) {
		treeNode node = null;
		rootInsert(node,val);
		if(root!=null){
			ifRightChildNull(node,val);
			ifleftChildNull(node,val);
			ifleftChildNotNull(node,val);
			ifrightChildNotNull(node,val);
		}
	}
	public treeNode delete(int val) {
		treeNode node = null;
		if(root == null)return node;
		if(isLeafNode(root) && root.data == val){
			node = root;
			root = null;
		}
		if(root!=null && root.data < val) {
			if(root.rightChild !=null){
				if(root.rightChild.data == val && isLeafNode(root.rightChild)) {
					node = root.rightChild;
					root.rightChild = null;
				}
			else{
					tree subTree = new tree(root.rightChild);
					node =  subTree.delete(val);
				}
			} 
		} 
		return node;
	}
}	




