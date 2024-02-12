class Solution {
    public String removeOuterParentheses(String s) {
        int count = 0;
        String answer = "";
        String lastAnswer = "";
        Stack<Character> stack = new Stack<>();
        
        for(char c : s.toCharArray()){
            if(c == '('){
                stack.push(c);
                count++;
                if(count > 0) {
                    answer += "(";
                }
                
            } else if(c == ')' && !stack.isEmpty() && stack.peek() == '(') {
                count--;
                stack.pop();
                if(count > 0) {
                    answer += ")";
                } else {
                    lastAnswer += answer.substring(1);
                    answer = "";
                }
            }
        }
        
        return lastAnswer;
    }
}
