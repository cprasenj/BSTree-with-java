import org.junit.Test;
import static org.junit.Assert.*;

public class TreeNodeTest {
	
	@Test
	public void initially_treeNode_has_value_0_and_all_points_to_null_if_no_argument_passed() {
		treeNode node = new treeNode();
		assertEquals(node.leftChild,null);
		assertEquals(node.rightChild,null);
		assertEquals(node.data,0);
	}

	@Test
	public void treeNode_can_be_initialized_with_given_value() {
		treeNode node = new treeNode(4);
		assertEquals(node.data,4);
	}
}