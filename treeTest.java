import org.junit.Test;
import static org.junit.Assert.*;

public class TreeTest {
	@Test
	public void Tree_can_be_initialized_with_root_by_default_null() {
		Tree Tree = new Tree();
		assertEquals(Tree.root,null);
	}

	@Test
	public void Tree_can_be_initialized_with_root_by_initial_value() {
		TreeNode node = new TreeNode(5);
		Tree Tree = new Tree(node);
		assertEquals(node.data,5);
		assertEquals(Tree.root.data,5);
	}

	@Test
	public void insert_001(){
		console.log("insert inserts value in the empty Tree");
		Tree Tree = new Tree();
		Tree.insert(5);
		assertEquals(Tree.root.data,5);
	}

	@Test
	public void insert_002(){
		console.log("insert inserts value in the existing Tree");
		Tree Tree = new Tree();
		Tree.insert(5);
		Tree.insert(10);
		assertEquals(Tree.root.rightChild.data,10);
	}

	@Test
	public void insert_003(){
		console.log("insert inserts value in the existing Tree of depth 2");
		Tree Tree = new Tree();
		Tree.insert(5);
		Tree.insert(10);
		Tree.insert(12);
		assertEquals(Tree.root.rightChild.rightChild.data,12);
	}

	@Test
	public void insert_004(){
		console.log("insert inserts value in the existing Tree");
		Tree Tree = new Tree();
		Tree.insert(5);
		Tree.insert(3);
		assertEquals(Tree.root.leftChild.data,3);
	}

	@Test
	public void insert_005(){
		console.log("insert inserts value in the existing Tree of depth 2");
		Tree Tree = new Tree();
		Tree.insert(5);
		Tree.insert(3);
		Tree.insert(1);
		assertEquals(Tree.root.leftChild.leftChild.data,1);
	}

	@Test
	public void delete_001(){
		console.log("delete deletes the leaf noad");
		Tree Tree = new Tree();
		Tree.insert(5);
		TreeNode delnode = Tree.delete(5);
		assertEquals(Tree.root,null);
		assertEquals(delnode.data,5);
	}

	@Test
	public void delete_002(){
		console.log("delete gives null for blank Tree");
		Tree Tree = new Tree();
		TreeNode delnode = Tree.delete(5);
		assertEquals(Tree.root,null);
		assertEquals(delnode,null);
	}

	@Test
	public void delete_003(){
		console.log("delete gives null for blank Tree");
		Tree Tree = new Tree();
		Tree.insert(5);
		Tree.insert(50);
		TreeNode delnode = Tree.delete(15);
		assertEquals(Tree.root.data,5);
		assertEquals(delnode,null);
	}

	@Test
	public void delete_004(){
		console.log("delete deletes for Tree with rightChild");
		Tree Tree = new Tree();
		Tree.insert(5);
		Tree.insert(50);
		TreeNode delnode = Tree.delete(50);
		assertEquals(Tree.root.data,5);
		assertEquals(delnode.data,50);
		assertEquals(Tree.root.rightChild,null);
	}

	@Test
	public void delete_005(){
		console.log("delete deletes for Tree with rightChild of depth 3");
		Tree Tree = new Tree();
		Tree.insert(5);
		Tree.insert(50);
		Tree.insert(100);
		TreeNode delnode = Tree.delete(100);
		assertEquals(Tree.root.data,5);
		assertEquals(Tree.root.rightChild.data,50);
		assertEquals(delnode.data,100);
		assertEquals(Tree.root.rightChild.rightChild,null);
	}

	@Test
	public void delete_006(){
		console.log("delete deletes for Tree with lefttChild of depth 2");
		Tree Tree = new Tree();
		Tree.insert(5);
		Tree.insert(2);
		TreeNode delnode = Tree.delete(2);
		assertEquals(Tree.root.data,5);
		assertEquals(Tree.root.leftChild,null);
		assertEquals(delnode.data,2);
	}

	@Test
	public void delete_007(){
		console.log("delete deletes for Tree with lefttChild of depth 3");
		Tree Tree = new Tree();
		Tree.insert(5);
		Tree.insert(2);
		Tree.insert(1);
		TreeNode delnode = Tree.delete(1);
		assertEquals(Tree.root.data,5);
		assertEquals(Tree.root.leftChild.data,2);
		assertEquals(Tree.root.leftChild.leftChild,null);
		assertEquals(delnode.data,1);
	}

	@Test
	public void travarse_007(){
		console.log("travarses through the Tree and produces result");
		Tree Tree = new Tree();
		Tree.insert(3);
		Tree.insert(1);
		Tree.insert(0);
		Tree.insert(2);
		Tree.insert(5);
		Tree.insert(4);
		Tree.insert(6);
		CreateArray c = new CreateArray();
		Tree.travarse(c);
		assertEquals(c.result[0],0);
		assertEquals(c.result[1],1);
		assertEquals(c.result[2],2);
		assertEquals(c.result[3],3);
		assertEquals(c.result[4],4);
		assertEquals(c.result[5],5);
		assertEquals(c.result[6],6);
	}
}