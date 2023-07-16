package org.ankitcode99.applications.HashMapImplementation;

public class APHashMap<K,V> {

    public static final int INITIAL_CAPACITY = 1<<4;
    public static final int MAXIMUM_CAPAITY = 1<<30;

    Entry[] hashTable;

    public APHashMap(){
        hashTable = new Entry[INITIAL_CAPACITY];
    }

    public APHashMap(int initialCapacity){
        int capacity = computeHashTableCapacity(initialCapacity);
        hashTable = new Entry[capacity];
    }

    /**
     * This method computes next power of 2
     * @param initialCapacity
     * @return
     */
    private int computeHashTableCapacity(int initialCapacity) {
        int n = initialCapacity - 1;
        n |= n>>>1;
        n |= n>>>2;
        n |= n>>>4;
        n |= n>>>8;
        n |= n>>>16;

        return (n<0) ? 1 : (n>=MAXIMUM_CAPAITY) ? MAXIMUM_CAPAITY : n+1;
    }

    class Entry<K,V>{
        public K key;
        public V value;

        public Entry next;

        Entry(K key, V value){
            this.key = key;
            this.value = value;
        }
    }

    public void put(K key, V value){
        int hashCode = key.hashCode() % hashTable.length;
        Entry node = hashTable[hashCode];
        if(node==null){
            Entry newNode = new Entry(key,value);
            hashTable[hashCode] = newNode;
        }else{
            Entry previousNode = node;
            while(node!=null){
                /**
                 * some key is already present
                 * */
                if(node.key==key){
                    node.value = value;
                    return;
                }
                previousNode = node;
                node = previousNode.next;
            }
            Entry newNode = new Entry(key, value);
            previousNode.next = newNode;
        }
    }

}
