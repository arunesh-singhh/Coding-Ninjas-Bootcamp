public class TrieNodeFunction {
    private TrieNode root;

    public TrieNodeFunction(){
        root = new TrieNode('\n');
    }

    // add Word 
    public void add(String word){
        addHelper(root, word);
    }
    private void addHelper(TrieNode root, String word){
        if (word.length() == 0) {
            root.isTerminating = true;
            return;
        }
        int childIndex = word.charAt(0) - 'A';
        TrieNode child = root.children[childIndex];
        if (child == null) {
            child = new TrieNode(word.charAt(0));
            root.children[childIndex] = child;
            root.childCount++;
        }
        addHelper(child, word.substring(1));

    }

    // serch word
    public boolean serch(String word){
        return serchHelper(root, word);
    }
    private boolean serchHelper(TrieNode root, String word){
        if (word.length() == 0) {
            return root.isTerminating;
        }
        int childIndex = word.charAt(0) - 'A';
        TrieNode child = root.children[childIndex];
        if (child == null) {
            return false;
        }
        return serchHelper(child, word.substring(1));

    }

    // remove word
    public void remove(String word){
        removeHelper(root, word);
    }
    private void removeHelper(TrieNode root, String word){
        if (word.length() == 0) {
            root.isTerminating = false;
            return;
        }
        int childIndex = word.charAt(0) - 'A';
        TrieNode child = root.children[childIndex];
        if (child == null) {
            return;
        }
        serchHelper(child, word.substring(1));
        if (!child.isTerminating && child.childCount == 0) {
            root.children[childIndex] = null;
            root.childCount--;
        }
    }

}
