package com.example.tree;

public class BinaryTreeDemo {
    public static void main(String[] args) {
        //创建一个二叉树
        BinaryTree binaryTree = new BinaryTree();
        HeroNode root = new HeroNode(1,"宋江");
        HeroNode node2 = new HeroNode(2,"吴用");
        HeroNode node3 = new HeroNode(3,"卢俊义");
        HeroNode node4 = new HeroNode(4,"林冲");
        HeroNode node5 = new HeroNode(5,"关胜");


        //说明，我们先手动创建二叉树，后面我们学习用递归的方式创建二叉树
        root.setLeft(node2);
        root.setRight(node3);
        node3.setRight(node4);
        node3.setLeft(node5);
        binaryTree.setRoot(root);
        //测试
        System.out.println("前序遍历");
        binaryTree.preOrder();

        System.out.println("中序遍历");
        binaryTree.infixOrder();

        System.out.println("后序遍历");
        binaryTree.postOrder();
    }
}


//定义一个BinaryTree 二叉树
class BinaryTree{
    private HeroNode root;

    public void setRoot(HeroNode root) {//设置根节点
        this.root = root;
    }

    //遍历方法是BinaryTree 去调用的
    //前序遍历
    public void preOrder(){
        if (this.root != null){
            this.root.preOrder();
        }else {
            System.out.println("当前二叉树为空，无法遍历");
        }
    }

    //中序遍历
    public void infixOrder(){
        if (this.root != null){
            this.root.inFixOrder();
        }else {
            System.out.println("当前二叉树为空，无法遍历");
        }
    }

    //后续遍历
    public void postOrder(){
        if (this.root != null){
            this.root.postOrder();
        }else {
            System.out.println("当前二叉树为空，无法遍历");
        }
    }
}

//先创建HeroNode 节点
class HeroNode {
    private int no;
    private String name;
    private HeroNode left;
    private HeroNode right;

    HeroNode(int no, String name) {
        this.no = no;
        this.name = name;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public HeroNode getLeft() {
        return left;
    }

    public void setLeft(HeroNode left) {
        this.left = left;
    }

    public HeroNode getRight() {
        return right;
    }

    public void setRight(HeroNode right) {
        this.right = right;
    }

    @Override
    public String toString() {
        return "HeroNode{" +
                "no=" + no +
                ", name='" + name + '\'' +
                '}';
    }

    //前序遍历方法
    public void preOrder() {
        System.out.println(this);
        //递归向左子树前序遍历
        if (this.left != null) {
            this.left.preOrder();
        }
        if (this.right != null) {
            this.right.preOrder();
        }
    }

    //中序遍历
    public void inFixOrder() {
        //递归向左子树中序遍历
        if (this.left != null) {
            this.left.inFixOrder();
        }
        System.out.println(this);
        if (this.right != null) {
            this.right.inFixOrder();
        }
    }

    //后续遍历
    public void postOrder() {
        //递归向左子树中序遍历
        if (this.left != null) {
            this.left.postOrder();
        }
        if (this.right != null) {
            this.right.postOrder();
        }
        System.out.println(this);
    }

    //前序遍历查找

    /**
     * @param no 查找no
     * @return 如果找到就返回HeroNode，否则返回null
     */
    /*public HeroNode preOrderSearch1(int no){
        if (this != null) {
            if (this.no == no) {
                return this;
            } else if (this.left != null) {
                this.left.preOrderSearch(no);
            }else if (this.right != null){
                this.right.preOrderSearch(no);
            }
        }
        return null;
    }*/
    public HeroNode preOrderSearch(int no) {
        if (this.no == no) {
            return this;
        }
        HeroNode resNode = null;
        if (this.left != null) {
            resNode = this.left.preOrderSearch(no);
        }
        if (this.right != null) {
            resNode = this.right.preOrderSearch(no);
        }

        return resNode;
    }
}
