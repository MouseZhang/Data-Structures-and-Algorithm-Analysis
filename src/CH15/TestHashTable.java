package CH15;

public class TestHashTable {
	public static void main(String[] args) {
		HashTable ht = new HashTable();
		ht.insert(new Info("tom", "汤姆"));
		ht.insert(new Info("jack", "杰克"));
		ht.insert(new Info("john", "约翰"));
		ht.insert(new Info("mike", "麦克"));
		
		System.out.println(ht.find("jack").getName());
		System.out.println(ht.find("john").getName());
	}

}
