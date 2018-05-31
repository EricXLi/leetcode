package lc.LC824.GoatLatin;

class Solution {
    private static final String VOWELS = "AEIOUaeiou";
    
    public String toGoatLatin(String S) {
        String[] arr = S.split(" ");
        StringBuilder builder = new StringBuilder();

        for(int i = 0 ; i < arr.length ; i++){
            String processed = process(arr[i], i);
            builder.append(processed);
            if(i < arr.length - 1){
                builder.append(" ");
            }
            
        }
        return builder.toString();
    }
    
    private String process(String str, int i){
        StringBuilder processed = new StringBuilder();
        int len = str.length();
        if(!VOWELS.contains(str.substring(0,1)) && len > 1){
            processed.append(str.substring(1,len));
            processed.append(str.substring(0,1));
        } else {
            processed.append(str);
        }
        processed.append("maa");
        for(int j = 0 ; j < i ; j++){
            processed.append("a");
        }
        return processed.toString();
    }
}
