import org.junit.Test;
import static org.junit.Assert.*;

public class TreeNodeTest {
	
	@Test
	public void initially_treeNode_has_value_0_and_all_points_to_null_if_no_argument_passed() {
		TreeNode node = new TreeNode();
		assertEquals(node.leftChild,null);
		assertEquals(node.rightChild,null);
		assertEquals(node.data,0);
	}

	@Test
	public void treeNode_can_be_initialized_with_given_value() {
		TreeNode node = new TreeNode(4);
		assertEquals(node.data,4);
	}
}