public class Tree{
	public TreeNode root = null;
	public int countOfNode = 0;

	public Tree() {
	}
	public Tree(TreeNode node) {
		this.root = node;
	}
	// private boolean tORf(Tree a) {
		// return Tree != null ? true : false;
	// }
	private void rootInsert(TreeNode node,int val) {
		if(root == null) {
			node = new TreeNode(val); 
			this.root = node;
		}
	}
	private void ifRightChildNull(TreeNode node,int val) {
		if(root.data < val && root.rightChild == null){
			node = new TreeNode(val);
			root.rightChild = node;
		}
	}
	private void ifleftChildNull(TreeNode node,int val) {
		if(root.data > val && root.leftChild == null){
			node = new TreeNode(val);
			root.leftChild = node;
		}
	}
	private void ifleftChildNotNull(TreeNode node,int val) {
		if(root.data > val && root.leftChild != null){
			Tree subTree = new Tree(this.root.leftChild);
			subTree.insert(val);
		}
	}
	private void ifrightChildNotNull(TreeNode node,int val) {
		if(root.data < val && root.rightChild != null){
			Tree subTree = new Tree(this.root.rightChild);
			subTree.insert(val);
		}
	}
	private boolean isLeafNode(TreeNode noad) {
		return (noad.rightChild == null && noad.leftChild == null) ? true : false;
	}
	public void insert(int val) {
		TreeNode node = null;
		rootInsert(node,val);
		if(root!=null){
			ifRightChildNull(node,val);
			ifleftChildNull(node,val);
			ifleftChildNotNull(node,val);
			ifrightChildNotNull(node,val);
		}
	}
	private TreeNode rootDel(TreeNode node,int val) {
		if(isLeafNode(root) && root.data == val){
			node = root;
			root = null;
		}
		return node;
	}

	private TreeNode rightChildDel(TreeNode node,int val) {
		if(root.rightChild !=null){
			if(root.rightChild.data == val && isLeafNode(root.rightChild)) {
				node = root.rightChild;
				root.rightChild = null;
			}
		else{
				Tree subTree = new Tree(root.rightChild);
				node =  subTree.delete(val);
			}
		}
		return node;
	}
	private TreeNode leftChildDel(TreeNode node,int val) {
		if(root.leftChild!=null) {
			if(root.leftChild.data == val && isLeafNode(root.leftChild)) {
				node = root.leftChild;
				root.leftChild = null;
			}
			else{
				Tree subTree = new Tree(root.leftChild);
				node = subTree.delete(val);
			}
		}
		return node;
	}

	public TreeNode delete(int val) {
		TreeNode node = null;
		if(root == null)return node;
		node = rootDel(node,val);
		if(root!=null && root.data < val) 
			node = rightChildDel(node,val);
		if(root!=null && root.data > val) 
			node = leftChildDel(node,val);
		return node;
	}

	public void travarse(Traversal a) {
		if(root!=null) {
			if(root.leftChild != null) {
				Tree subTree = new Tree(root.leftChild);
				subTree.travarse(a);
			}
			a.travarseWork(root.data);
			if(root.rightChild != null) {
				Tree subTree = new Tree(root.rightChild);
				subTree.travarse(a);
			}
		}
	}
}	




