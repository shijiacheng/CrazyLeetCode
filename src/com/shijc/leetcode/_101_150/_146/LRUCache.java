package com.shijc.leetcode._101_150._146;

import java.util.HashMap;
import java.util.Map;

/**
 * 146. LRU缓存机制
 * lru cache
 * 运用你所掌握的数据结构，设计和实现一个  LRU (最近最少使用) 缓存机制。它应该支持以下操作： 获取数据 get 和 写入数据 put 。
 *
 * 获取数据 get(key) - 如果密钥 (key) 存在于缓存中，则获取密钥的值（总是正数），否则返回 -1。
 * 写入数据 put(key, value) - 如果密钥不存在，则写入其数据值。当缓存容量达到上限时，它应该在写入新数据之前删除最近最少使用的数据值，从而为新的数据值留出空间。
 *
 * 进阶:
 *
 * 你是否可以在 O(1) 时间复杂度内完成这两种操作
 *
 */
public class LRUCache {

    private int capacity;
    private LinkNode first;
    private LinkNode last;
    private Map<Integer,LinkNode> cache;

    public LRUCache(int capacity) {
        cache = new HashMap<>(capacity);
        this.capacity = capacity;
    }

    public int get(int key) {
        LinkNode result = cache.get(key);
        if (result == null){
            return  -1;
        }
        // 拿出该节点，放到链表的第一位
        removeToFirst(result);
        return result.val;

    }

    public void put(int key, int value) {

        LinkNode node = cache.get(key);
        if (node == null){
            if (cache.size() >= capacity){
                removeLastNode();
            }
            node = new LinkNode();
            node.key = key;
        }
        node.val = value;
        removeToFirst(node);
        cache.put(key,node);


    }

    private void removeToFirst(LinkNode node){
        if (first == node){
            return;
        }
        if (node.pre!=null){
            node.pre.next = node.next;
        }
        if (node.next!=null){
            node.next.pre = node.pre;
        }

        if (node == last){
            last = last.pre;
        }

        if (last == null){
            first = last = node;
            return;
        }

        node.next = first;
        first.pre = node;
        node.pre = null;
        first  = node;


    }

    private void removeLastNode(){
        LinkNode temp = last;
        last = last.pre;
        if (last!=null){
            last.next = null;
        }else {
            first = last = null;
        }
        cache.remove(temp.key);
    }
}

class LinkNode{

    LinkNode pre;
    LinkNode next;
    int key;
    int val;
}
