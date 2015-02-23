public class CreateArray implements Traversal {
	public int result[] = new int[7];
	
	@Override
	public void travarseWork(int val) {
		result[val] = val;
	}
}