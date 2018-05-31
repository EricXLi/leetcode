package lc.LC211.AddAndSearchWordDataStructureDesign;

import java.util.HashMap;
import java.util.Map;

public class WordDictionary {

	Node root;

    /** Initialize your data structure here. */
    public WordDictionary() {
    	this.root = new Node();        
    }    
    /** Adds a word into the data structure. */
    public void addWord(String word) {
    	Node ptr = root;
        for(char c : word.toCharArray()) {
        	Node nodeC = ptr.child.get(c);
        	if(nodeC == null) {
        		nodeC = new Node(c);
        		ptr.child.put(c, nodeC);
        	}
        	ptr = nodeC;
        }
        ptr.setWordEnd(true);
    }
    
    /** Returns if the word is in the data structure. A word could contain the dot character '.' to represent any one letter. */
    public boolean search(String word) {    	
    	if(null == word || word.isEmpty()) {
    		return false;
    	}
    	if(word.charAt(0) == '.') {
    		for(Character c : this.root.getChild().keySet()) {
    			if(this.root.getChild().get(c).search(word) == true) {    			
    				return true;
    			}
    		}
    	} else {
    		Node n = this.root.getChild().get(word.charAt(0));
    		if(null != n) {
    			return n.search(word);
    		}
    	}    	
    	return false;
    }
    
    private class Node {
    	private char value;
    	private Map<Character, Node> child;
    	private boolean wordEnd;
    	public Node() {
    		super();
    		this.value = '$';
    		this.child = new HashMap<Character,Node>();
    		this.wordEnd = false;
    	}
    	public Node(char c) {
    		super();
    		this.value = c;
    		this.child = new HashMap<Character,Node>();
    		this.wordEnd = false;
    	}    	
    	public boolean search(String word) {
    		System.out.println(word + "	" + this.toString());    		
    		boolean match = word.charAt(0) == this.value || word.charAt(0) == '.';    		
    		if(word.isEmpty() || !match) {
    			return false;
    		} else if(word.length() == 1) {
    			return match && this.wordEnd;
    		}    		
    		word = word.substring(1);
    		for(char c : word.toCharArray()) {
    			if(c == '.') {
    				//how do we collect all the results?
    				for(Character s : this.child.keySet()) {
    					Node nodeS = this.child.get(s);
    					if(nodeS.search(word) == true) {
        					return true;
    					}
    				}
    			} else {
    				Node nodeC = this.child.get(c);
    				if(null != nodeC) {
    					return nodeC.search(word);
    				}
    			}
    		}    		
    		return false;
    	}
    	
    	public String toString() {
    		String child = "";
    		for(Character s : this.child.keySet()) {
    			child = child + this.child.get(s).value;
			}
    		return "Value: "+ this.value + ", WordEnd: "+ this.wordEnd + ", childs:" + child;
    	}
		public char getValue() {
			return value;
		}
		public void setValue(char value) {
			this.value = value;
		}
		public Map<Character, Node> getChild() {
			return child;
		}
		public void setChild(Map<Character, Node> child) {
			this.child = child;
		}
		public boolean isWordEnd() {
			return wordEnd;
		}
		public void setWordEnd(boolean wordEnd) {
			this.wordEnd = wordEnd;
		}    	
    }


}
