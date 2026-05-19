class Solution {
    public int evalRPN(String[] tokens) {

        int num1,num2;
        Stack<Integer> stack=new Stack<>();
        for(int i=0;i<tokens.length;i++){
            String c=tokens[i];
            if(c.equals("*")){
                num1=stack.pop();
                num2=stack.pop();
                stack.push(num2*num1);
            }
            else if(c.equals("+")){
                num1=stack.pop();
                num2=stack.pop();
                stack.push(num2+num1);
            }           
            else if(c.equals("-")){
                num1=stack.pop();
                num2=stack.pop();
                stack.push(num2-num1);
            }
            else if(c.equals("/")){
                num1=stack.pop();
                num2=stack.pop();
                stack.push(num2/num1);
            }
            else{
                stack.push(Integer.parseInt(c));
            }
        }
        return stack.pop();
    }
}

