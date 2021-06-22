class Solution{

	public static int getHeight(Node root){
      return height(root);
    }
    
    private static int height(Node root){
        if(root == null){
            return -1;
        }
        return Math.max(height(root.left), height(root.right)) + 1;
    }
}
