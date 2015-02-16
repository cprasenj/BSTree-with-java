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
}