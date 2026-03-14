class Solution {
    public boolean isValid(String s) {

        Deque<Character> d=new ArrayDeque<>();

        for(int i=0;i<s.length();i++){
            if(d.isEmpty()){
                d.push(s.charAt(i));
            }
            else{
                if(s.charAt(i)==')' && d.peek()=='('){
                    d.pop();
                }
                else if(s.charAt(i)=='}' && d.peek()=='{'){
                    d.pop();
                }
                else if(s.charAt(i)==']' && d.peek()=='['){
                    d.pop();
                }
                else{
                    d.push(s.charAt(i));
                }
            }
        }
        System.out.print(d);
        if(d.isEmpty()){
            return true;
        }

        return false;


    }
}