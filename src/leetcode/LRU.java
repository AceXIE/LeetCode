/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2019 All Rights Reserved.
 */
package leetcode;

import java.util.HashMap;
import java.util.Iterator;

/**
 * 双向链表 + HashMap 的 LRU 算法实现
 * @author xiekai.xk
 * @version $Id: LRU.java, v 0.1 2019-09-08 4:24 PM xiekai.xk Exp $$
 */
public class LRU<K, V> implements Iterable<K> {

    private Node             head;

    private Node             tail;

    private HashMap<K, Node> map;

    private int              maxSize;

    public LRU(int maxSize) {
        this.maxSize = maxSize;
        this.map = new HashMap<>(maxSize * 4 / 3);
        head = new Node(null, null);
        tail = new Node(null, null);
        head.next = tail;
        tail.pre = head;
    }

    public V get(K key) {
        if (!map.containsKey(key)) {
            return null;
        }
        final Node node = map.get(key);
        //访问了一次，拿到最前面


        return null;

    }

    @Override
    public Iterator<K> iterator() {
        return null;
    }

    private class Node {
        K            k;

        V            v;

        private Node pre;

        private Node next;

        public Node(K k, V v) {
            this.k = k;
            this.v = v;
        }
    }
}