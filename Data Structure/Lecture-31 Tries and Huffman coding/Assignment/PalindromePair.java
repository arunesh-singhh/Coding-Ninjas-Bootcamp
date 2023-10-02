package Assignment;
import java.util.ArrayList;


public class PalindromePair {
    private TrieNode root;
	public int count;
	public PalindromePair() {
		root = new TrieNode('\0');
	}

	private void add(TrieNode root, String word){
		if(word.length() == 0){
			root.isTerminating = true;
			return;
		}		
		int childIndex = word.charAt(0) - 'a';
		TrieNode child = root.children[childIndex];
		if(child == null) {
			child = new TrieNode(word.charAt(0));
			root.children[childIndex] = child;
			root.childCount++;
		}
		add(child, word.substring(1));
	}
	public void add(String word){
		add(root, word);
	}


	private boolean search(TrieNode root, String word) {
		if(word.length() == 0) {
			return true;
		}
		int childIndex=word.charAt(0) - 'a';
		TrieNode child=root.children[childIndex];
		if(child == null) {
			return false;
		}
		return search(child,word.substring(1));
	}
	public boolean search(String word) {
		return search(root,word);
	}
	

	/*..................... Palindrome Pair................... */

	public String reverse(String word) {
		String xString="";
		for(int i=word.length()-1;i>=0;i--) {
			xString+=word.charAt(i);
		}
		return xString;
	}

	public boolean isPalindromePair(ArrayList<String> words) {
		for(int i=0;i<words.size();i++) {
			String string = reverse(words.get(i));
			
			PalindromePair suffixTrie = new PalindromePair();
			for(int j=0;j<string.length();j++) {
				suffixTrie.add(string.substring(j));
			}
			for(String word : words) {
				if(suffixTrie.search(word)) {
					return true;
				}
			}
		}
		return false;	
	}	
}
