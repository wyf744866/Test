package sort;

public class BucketSort2 {
	class Node {
		int key;
		Node next;
	};

	private void incSort(int[] keys, int bucketsize) {

		int size = keys.length;
		Node[] bucket_table = new Node[bucketsize];
		for (int i = 0; i < bucketsize; i++) {
			bucket_table[i] = new Node();
			bucket_table[i].key = 0;
			bucket_table[i].next = null;
		}
		for (int i = 0; i < size; i++) {
			Node node = new Node();
			node.key = keys[i];
			node.next = null;
			int index = keys[i]/10;
			Node p = bucket_table[index];
			if (p.key == 0) {
				bucket_table[index].next = node;

			}else {
				while (p.next != null && p.next.key <= node.key) {
					p = p.next;
				}
					node.next = p.next;
					p.next = node;

			}
			(bucket_table[index].key)++;
		}
		for (int i = 0; i < bucketsize; i++) {
			for (Node k = bucket_table[i].next;k!=null; k = k.next)
				System.out.println(k.key + " ");
		}
	}

	public static void main(String[] args) {
		int[] array = { 1, 2, 4, 5, 3, 7, 99, 11,1,1 };
		new BucketSort2().incSort(array, 10);
	}
}
