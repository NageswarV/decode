void decode(String s, Node root) {
        char[] input=s.toCharArray();
        String result=new String();
        result="";
         Node temp=root;
        for(char ch: input)
        {
            if(ch=='0')
            {   
                    root=root.left;
            }
            else{
                    root=root.right;
                }
            if((root.right==null)&&(root.left==null)){
                System.out.print(root.data);
                 root=temp;}
        }
        System.out.print(result);
    }