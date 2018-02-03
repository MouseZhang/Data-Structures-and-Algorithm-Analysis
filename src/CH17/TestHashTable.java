package CH17;

public class TestHashTable {
	public static void main(String[] args) {
		HashTable ht = new HashTable();
		ht.insert(new Info("a", "杰克"));
		ht.insert(new Info("ct", "约翰"));
		ht.insert(new Info("b", "麦克"));
		ht.insert(new Info("dt", "汤姆"));
		
		System.out.println(ht.find("a").getName());
		System.out.println(ht.find("ct").getName());
		System.out.println(ht.find("b").getName());
		System.out.println(ht.find("dt").getName());
		
		System.out.println(ht.hashCode("a"));
		System.out.println(ht.hashCode("ct"));
		
		System.out.println(ht.delete("a").getName());
		System.out.println(ht.find("a").getName());			//删除后再查找会返回空指针异常
	}

}
