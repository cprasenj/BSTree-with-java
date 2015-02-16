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

}