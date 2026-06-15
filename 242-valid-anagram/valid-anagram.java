class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character,Integer> sMap=new HashMap<>();
        Map<Character,Integer> tMap=new HashMap<>();

        if(s.length()!=t.length()){
            
            return false;
        }

        for(int i=0;i<s.length();i++){
            if(sMap.containsKey(s.charAt(i))){
                sMap.put(s.charAt(i), sMap.get(s.charAt(i)) + 1);
            }else{
                sMap.put(s.charAt(i),1);
            }
        }

        for(int i=0;i<t.length();i++){
            if(tMap.containsKey(t.charAt(i))){
                tMap.put(t.charAt(i), tMap.get(t.charAt(i)) + 1);
            }else{
                tMap.put(t.charAt(i),1);
            }
        }

        for (Character c : sMap.keySet()) {
            if(!tMap.containsKey(c)){
                
                return false;
            }else{
                if(!sMap.get(c).equals(tMap.get(c))){
                    System.out.println("hii");
                    return false;
                }
            }
        }


        return true;

    }
}