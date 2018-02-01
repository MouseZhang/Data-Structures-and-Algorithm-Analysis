package CH13;

public class TestTree {
	public static void main(String[] args) {
		Tree tree = new Tree();
		tree.insert(10, "James");
		tree.insert(20, "Yao");
		tree.insert(15, "Tom");
		tree.insert(3, "Mac");
		tree.insert(4, "Jack");
		tree.insert(90, "Lee");
		
		// 删除叶子节点
		tree.delete(4);
		tree.inOrder(tree.root);
		
		// 删除有一个子节点的节点
		tree.delete(3);
		tree.inOrder(tree.root);
		
		// 删除有两个子节点的节点
		tree.delete(10);
		tree.inOrder(tree.root);
	}

}
