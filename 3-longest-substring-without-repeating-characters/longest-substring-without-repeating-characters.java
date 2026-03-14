class Solution {
    public int lengthOfLongestSubstring(String s) {

        int i=0;
        int j=0;
        Map<String,Integer> m=new HashMap<>();
        int l=0;

        while(j<s.length()){
            if(!m.containsKey(""+s.charAt(j))){
                m.put(""+s.charAt(j),j);
                j=j+1;
            }
            else{
                while(i<j && m.containsKey(""+s.charAt(j))){
                    m.remove(""+s.charAt(i));
                    i=i+1;

                }
                m.put(""+s.charAt(j),j);
                j=j+1;
            }
            l=Math.max(l,m.size());

        }
        return l;


        
    }
}