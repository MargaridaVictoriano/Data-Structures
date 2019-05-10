class ED195{
  public static boolean balanced(String s){
    MyStack<Character> stack = new LinkedListStack<Character>();
    for(int i = 0; i < s.length(); i++){
      if(s.charAt(i) == '(' || s.charAt(i) == '['){
        stack.push(s.charAt(i));
      }
      else{
        if(stack.isEmpty()){
          return false;
        }
        else{
          if((stack.top() == '(' && s.charAt(i) == ')') || (stack.top() == '[' && s.charAt(i) == ']')){
            stack.pop();
          }
        }
      }
    }
    return stack.isEmpty();
  }
}
