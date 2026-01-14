public class CustomHashMap {
    private static class Node{
        int key,value;
        Node next;
        Node(int key,int value){
            this.key=key;
            this.value=value;
        }
    }
     // private and final variable
    private final int SIZE=10;
    private Node[] table=new Node[SIZE];

    private int hash(int key){
        return key%SIZE;
    }
      //Put Method
    public void put(int key,int value){

        int index=hash(key);
        Node head=table[index];

        while(head!=null){
            if(head.key==key){
                head.value=value;
                return;
            }
            head=head.next;
        }

        Node node=new Node(key,value);
        node.next=table[index];
        table[index]=node;
    }
 // Get Method
    public int get(int key){

        int index=hash(key);
        Node head=table[index];

        while(head!=null){
            if(head.key==key){
                return head.value;
            }
            head=head.next;
        }
        return -1;
    }
// Remove Method
    public void remove(int key){

        int index=hash(key);
        Node head=table[index];
        Node prev=null;

        while(head!=null){
            if(head.key==key){
                if(prev==null){
                    table[index]=head.next;
                }else{
                    prev.next=head.next;
                }
                return;
            }
            prev=head;
            head=head.next;
        }
    }

    public static void main(String[] args){

        CustomHashMap map=new CustomHashMap();
        map.put(1,10);
        map.put(11,20);

        System.out.println(map.get(1));
        map.remove(1);
        System.out.println(map.get(1));
    }
}
