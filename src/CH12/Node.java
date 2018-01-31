package CH12;
/**
 * 二叉树节点
 * @author MouseZhang
 *
 */
public class Node {
	public long data;
	public String sData;
	public Node leftChild;
	public Node rightChild;
	
	/**
	 * 构造方法
	 * @param data
	 */
	public Node(long data, String sData) {
		this.data = data;
		this.sData = sData;
	}
}
