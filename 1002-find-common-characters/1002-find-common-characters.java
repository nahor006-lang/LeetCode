class Solution {
    public List<String> commonChars(String[] words) {
        ArrayList<String>list=new ArrayList<>();
        int minFreq[] = new int[26];
        for(int i =0;i<words[0].length();i++){
            minFreq[words[0].charAt(i)-'a']++;
        }
        for(int k =1;k<words.length;k++){
            int freq[] = new int[26];
        String s = words[k];
        for(int j =0;j<s.length();j++){
            freq[s.charAt(j)-'a']++;
            

        }   
        for (int i = 0; i < 26; i++) {
    minFreq[i] = Math.min(minFreq[i], freq[i]);
}


        
            
      }
      for(int i =0;i<minFreq.length;i++){
        while(minFreq[i] !=0){
          
            list.add(Character.toString((char) (i+'a')));
            minFreq[i]--;
        }
      }
      return list;
    }
}