import org.junit.Test;
import static org.junit.Assert.*;

public class treeTest {
	@Test
	public void tree_can_be_initialized_with_root_by_default_null() {
		tree tree = new tree();
		assertEquals(tree.root,null);
	}

	@Test
	public void tree_can_be_initialized_with_root_by_initial_value() {
		treeNode node = new treeNode(5);
		tree tree = new tree(node);
		assertEquals(node.data,5);
		assertEquals(tree.root.data,5);
	}

	@Test
	public void insert_001(){
		console.log("insert inserts value in the empty tree");
		tree tree = new tree();
		tree.insert(5);
		assertEquals(tree.root.data,5);
	}

	@Test
	public void insert_002(){
		console.log("insert inserts value in the existing tree");
		tree tree = new tree();
		tree.insert(5);
		tree.insert(10);
		assertEquals(tree.root.rightChild.data,10);
	}

	@Test
	public void insert_003(){
		console.log("insert inserts value in the existing tree of depth 2");
		tree tree = new tree();
		tree.insert(5);
		tree.insert(10);
		tree.insert(12);
		assertEquals(tree.root.rightChild.rightChild.data,12);
	}

	@Test
	public void insert_004(){
		console.log("insert inserts value in the existing tree");
		tree tree = new tree();
		tree.insert(5);
		tree.insert(3);
		assertEquals(tree.root.leftChild.data,3);
	}

	@Test
	public void insert_005(){
		console.log("insert inserts value in the existing tree of depth 2");
		tree tree = new tree();
		tree.insert(5);
		tree.insert(3);
		tree.insert(1);
		assertEquals(tree.root.leftChild.leftChild.data,1);
	}

	@Test
	public void delete_001(){
		console.log("delete deletes the leaf noad");
		tree tree = new tree();
		tree.insert(5);
		treeNode delnode = tree.delete(5);
		assertEquals(tree.root,null);
		assertEquals(delnode.data,5);
	}

	@Test
	public void delete_002(){
		console.log("delete gives null for blank tree");
		tree tree = new tree();
		treeNode delnode = tree.delete(5);
		assertEquals(tree.root,null);
		assertEquals(delnode,null);
	}

	@Test
	public void delete_003(){
		console.log("delete gives null for blank tree");
		tree tree = new tree();
		tree.insert(5);
		tree.insert(50);
		treeNode delnode = tree.delete(15);
		assertEquals(tree.root.data,5);
		assertEquals(delnode,null);
	}

	@Test
	public void delete_004(){
		console.log("delete deletes for tree with rightChild");
		tree tree = new tree();
		tree.insert(5);
		tree.insert(50);
		treeNode delnode = tree.delete(50);
		assertEquals(tree.root.data,5);
		assertEquals(delnode.data,50);
		assertEquals(tree.root.rightChild,null);
	}

	@Test
	public void delete_005(){
		console.log("delete deletes for tree with rightChild of depth 3");
		tree tree = new tree();
		tree.insert(5);
		tree.insert(50);
		tree.insert(100);
		treeNode delnode = tree.delete(100);
		assertEquals(tree.root.data,5);
		assertEquals(tree.root.rightChild.data,50);
		assertEquals(delnode.data,100);
		assertEquals(tree.root.rightChild.rightChild,null);
	}

	@Test
	public void delete_006(){
		console.log("delete deletes for tree with lefttChild of depth 2");
		tree tree = new tree();
		tree.insert(5);
		tree.insert(2);
		treeNode delnode = tree.delete(2);
		assertEquals(tree.root.data,5);
		assertEquals(tree.root.leftChild,null);
		assertEquals(delnode.data,2);
	}

	@Test
	public void delete_007(){
		console.log("delete deletes for tree with lefttChild of depth 3");
		tree tree = new tree();
		tree.insert(5);
		tree.insert(2);
		tree.insert(1);
		treeNode delnode = tree.delete(1);
		assertEquals(tree.root.data,5);
		assertEquals(tree.root.leftChild.data,2);
		assertEquals(tree.root.leftChild.leftChild,null);
		assertEquals(delnode.data,1);
	}

}