package CH16;

public class TestHashTable {
	public static void main(String[] args) {
		HashTable ht = new HashTable();
		ht.insert(new Info("tom", "汤姆"));
		ht.insert(new Info("a", "杰克"));
		ht.insert(new Info("ct", "约翰"));
		ht.insert(new Info("b", "麦克"));
		
		System.out.println(ht.find("a").getName());
		System.out.println(ht.find("ct").getName());
		System.out.println(ht.find("b").getName());
		
		ht.delete("b");
		System.out.println(ht.find("b").getName());
	}
}
