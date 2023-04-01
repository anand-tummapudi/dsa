package com.algorithms.lru;

import java.util.LinkedHashMap;

public class LRUCache2<K,V> {
	
private int size;
private LinkedHashMap<K,V> cache;

public LRUCache2(int size) {
	this.size = size;
	this.cache = new LinkedHashMap<>(size);
}

public void put(K key,V value) {
	
	if(this.cache.containsKey(key)) {
		this.cache.remove(key);
	}
	
	if(this.cache.size()>=this.size) {
		K firstEle = this.cache.keySet().iterator().next();
		this.cache.remove(firstEle);
	}
	cache.put(key, value);
}

public V get(K key) {
	if(!this.cache.containsKey(key)) return null;
	V value = this.cache.get(key);
	this.cache.remove(key);
	this.cache.put(key, value);
	
	return value;
}

public String toString() {
	return this.cache.keySet().toString();
}

public static void main(String []args) {
	LRUCache2<Integer, String> cache = new LRUCache2<>(5);
	
	cache.put(1, "One");
	cache.put(2, "Two");
	cache.put(3, "Three");
	cache.put(4, "Four");
	cache.put(5, "Five");
	
	System.out.println(cache); // [1,2,3,4,5,]
	
	cache.put(6, "Six"); //[2,3,4,5,6]
	System.out.println(cache);
	
	cache.get(3); //[2,4,5,6,3]
	System.out.println(cache);
	
	cache.get(2); // [4,5,6,3,2]
	System.out.println(cache);
	
	cache.put(6, "six"); //[4,5,3,2,6]
	System.out.println(cache);
	
}

}
