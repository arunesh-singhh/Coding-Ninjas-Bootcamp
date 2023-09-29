import java.util.ArrayList;

class MapNode<k, v>{
    k key;
    v value;
    MapNode<k, v> next;
    public MapNode(k key, v value){
        this.key = key;
        this.value = value;
    }
}

class Map<k,v>{
    ArrayList<MapNode<k,v>> buckets;
    int count = 0;
    int numbuckets;
    public Map(){
        buckets = new ArrayList<>();
        numbuckets = 5;
        for (int i = 0; i < numbuckets; i++) {
            buckets.add(null);
        }
    }
    // this function return the index using HashCode function;
    private int getBucketIndex(k key){
        int hc = key.hashCode();
        int index = hc % numbuckets;
        return index;
    }


    // function that return size of hashmap
    public int size(){
        return count;
    }


    // return value inside the key
    public v getValue(k key){
        int bucketIndex = getBucketIndex(key);
        MapNode<k, v> head = buckets.get(bucketIndex);
        // check key is present? return its value
        while (head!=null) {
            if (head.key.equals(key)) {
                return head.value;
            }
            head = head.next;
        }
        return null;   // key is not present
    }


    // function that remove key
    public v removeKey(k key){
        int bucketIndex = getBucketIndex(key);
        MapNode<k, v> head = buckets.get(bucketIndex);
        MapNode<k, v> preNode = null;
        while (head!=null) {
            if (head.key.equals(key)) {
                if (preNode == null) {
                    buckets.set(bucketIndex, head.next);
                }
                else{
                    preNode.next = head.next;
                }
                count--;
                return head.value;
            }
            preNode = head;
            head = head.next;
        }
        return null;
    }


    // function for insert value in in hashmap 
    public void insert(k key, v value){
        int bucketIndex = getBucketIndex(key);
        MapNode<k, v> head = buckets.get(bucketIndex);
        // element is already there? update its value
        while (head!=null) {
            if (head.key.equals(key)) {
                head.value = value;
                return;
            }
            head = head.next;
        }
        //element is not there. insert at 0th position of linkedlist
        head = buckets.get(bucketIndex);
        MapNode<k, v> newnNode = new MapNode<>(key, value);
        newnNode.next = head;
        buckets.set(bucketIndex, newnNode);
        count++;
        double loadFacter = loadFacter();
        if (loadFacter > 0.7) {
            reHash();
        }
    }


    // return loadFacter
    double loadFacter(){
        return (1.0*count / numbuckets);
    }


    // increase the size of hashmap
    private void reHash(){
        ArrayList<MapNode<k,v>> temp = buckets;
        buckets = new ArrayList<>();
        for (int i = 0; i < 2*numbuckets; i++) {
            buckets.add(null);
        }
        count = 0;
        numbuckets = 2*numbuckets;
        for (int i = 0; i < temp.size(); i++) {
            MapNode<k,v> head = temp.get(i);
            while (head != null) {
                k key = head.key;
                v value = head.value;
                insert(key, value);
                head = head.next;
            }
        }
    }
}


public class HashmapIimentation{
    // main function
    public static void main(String[] args) {
        Map<String,Integer> map = new Map<>(); 
        for (int i = 0; i < 20; i++) {
            map.insert("abc"+i, i+1);
            System.out.println(map.loadFacter());
        }
        map.removeKey("abc3");
        map.removeKey("abc5");
        for (int i = 0; i < 20; i++) {
            System.out.println("abc"+i+": "+map.getValue("abc"+i));
        }
    }
}