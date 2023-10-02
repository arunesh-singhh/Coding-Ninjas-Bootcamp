package Assignment;
import java.util.ArrayList;

public class AutoComplete {
	private TrieNode root;
	public int count;
	public AutoComplete() {
		root = new TrieNode('\0');
	}

	// add word in tries
	private void add(TrieNode root, String word){
		if(word.length() == 0){
			root.isTerminating = true;
			return;
		}		
		int childIndex = word.charAt(0) - 'a';
		TrieNode child = root.children[childIndex];
		if(child == null){
			child = new TrieNode(word.charAt(0));
			root.children[childIndex] = child;
			root.childCount++;
		}
		add(child, word.substring(1));
	}
	public void add(String word){
		add(root, word);
	}
	
	// Auto Complete function
	public void autoComplete(ArrayList<String> input, String word) {
		
        for(int i=0;i<input.size();i++)
        {
            add(input.get(i));
        }
       
        int flag = 0;
        TrieNode temp = root;
        int index = 0;
        for(int i=0;i<word.length();i++){
        	index = word.charAt(i) - 'a';
        	if(temp.children[index]!=null){
        		temp = temp.children[index];
        	}
        	else{
        		flag = 1;
        		break;
        	}
        }
        if(flag == 1)
        	return;
        index = word.charAt(0)-'a';
        print(temp,word.substring(0,word.length()-1));
    }

	// print function for printing auto complete suggestion
	public static void print(TrieNode root,String output){
		if(root == null)
			return;
		output+=root.data;
		if(root.isTerminating)
			System.out.println(output);
		for(int i=0;i<26;i++){
			print(root.children[i],output);
		}
	}
}
