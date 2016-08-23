public static int getHeight(Node root){

  Node left = null;
  Node right = null;

  if(root == null){
    return -1;
  }
  else{

    return 1 + Math.max(getHeight(root.left), getHeight(root.right));
  }
}
