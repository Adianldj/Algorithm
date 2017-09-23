package practice6;

import java.util.HashMap;
import java.util.Map;

public class LRUcache<K, V> {
	// limit is the max capacity of the cache
	static class Node<K, V> {
		Node<K, V> prev;
		Node<K, V> next;
		K key;
		V value;

		Node(K key, V value) {
			this.key = key;
			this.value = value;
		}

		void update(K key, V value) {
			this.key = key;
			this.value = value;
		}
	}

	private final int limit;
	private Node<K, V> head;
	private Node<K, V> tail;
	private Map<K, Node<K, V>> map;

	public LRUcache(int limit) {
		this.limit = limit;
		this.map = new HashMap<K , Node<K ,V>>();
	}

	public void set(K key, V value) {
		Node<K, V> node = null;
		if (map.containsKey(key)) {
			node = map.get(key);
			node.value = value;
			remove(node);
		} else if (map.size() < limit) {
			node = new Node<K, V>(key, value);
		} else {
			node = tail;
			remove(node);
			node.update(key, value);
		}
		append(node);
	}

	public V get(K key) {
		Node<K, V> node = map.get(key);
		if (node == null) {
			return null;
		}
		remove(node);
		append(node);
		return node.value;
	}

	public Node<K, V> remove(Node<K, V> node) {
		map.remove(node);
		if (node.next != null) {
			node.prev = node.next.prev;
		}
		if (node.prev != null) {
			node.prev.next = node.next;
		}
		if (node == head) {
			head = head.next;
		}
		if (node == tail) {
			tail = tail.prev;
		}
		node.next = null;
		node.prev = null;
		return node;
	}

	public Node<K, V> append(Node<K, V> node) {
		map.put(node.key, node);
		if (head == null) {
			head = tail = node;
		} else {
			node.next = head;
			head.prev = node;
			head = node;
		}
		return node;
	}
}
