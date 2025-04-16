package Test3;

import java.util.ArrayList;
import java.util.List;

public class TreeNode {
    public static class Node {
        int data;
        List<Node> children;

        public Node(int data) {
            this.data = data;
            this.children = new ArrayList<>();
        }

        public void AddNode(Node child){
            children.add(child);
        }

        public static void printing(Node node, String space){
            System.out.println(space +node.data);
            for(Node child :node.children){
                printing(child, space+ " ");
            }
        }


    }
}


