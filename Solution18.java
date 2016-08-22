public class Solution {

  Stack <Character> s = new Stack <Character> ();
  Queue <Character> q = new LinkedList <Character> ();

  void pushCharacter(char ch){

    s.push(ch);
  }

  void enqueueCharacter(char ch){

    q.add(ch);
  }

  char popCharacter(){

    return s.pop();
  }

  char dequeueCharacter(){

    return q.remove();
  }
