package CH12;

public class TestTree {
	public static void main(String[] args) {
		Tree tree = new Tree();
		tree.insert(10, "James");
		tree.insert(20, "Yao");
		tree.insert(15, "Tom");
		tree.insert(3, "Mac");
		tree.insert(4, "Jack");
		tree.insert(90, "Lee");
		
		System.out.println(tree.root.data);
		System.out.println(tree.root.rightChild.data);
		System.out.println(tree.root.rightChild.leftChild.data);
		System.out.println(tree.root.leftChild.data);
		
		Node node = tree.find(3);
		System.out.println(node.data + ", " + node.sData);
		System.out.println();
		
		System.out.println("前序遍历的结果为：");
		tree.frontOrder(tree.root);
		System.out.println();
		
		System.out.println("中序遍历的结果为：");
		tree.inOrder(tree.root);
		System.out.println();
		
		System.out.println("后序遍历的结果为：");
		tree.afterOrder(tree.root);
		System.out.println();

	}

}
