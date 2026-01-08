//Node class
class ItemNode{
    int itemId;
    String itemName;
    int quantity;
    double price;
    ItemNode next;   // reference to next node
    // Constructor
    ItemNode(int itemId,String itemName,int quantity,double price){
        this.itemId=itemId;
        this.itemName=itemName;
        this.quantity=quantity;
        this.price=price;
        this.next=null;
    }
}

//Linked List Class
class InventoryList{
    private ItemNode head;   // head of linked list
    // Constructor
    InventoryList(){
        head=null;
    }
//Add at beginning
    public void addAtBeginning(int id,String name,int qty,double price){
        ItemNode newNode=new ItemNode(id,name,qty,price);
        newNode.next=head;
        head=newNode;
    }

   //Add at end
    public void addAtEnd(int id,String name,int qty,double price){
        ItemNode newNode=new ItemNode(id,name,qty,price);
        if(head==null){
            head=newNode;
            return;
        }
        ItemNode temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newNode;
    }
     // Add at specific position
    public void addAtPosition(int pos,int id,String name,int qty,double price){
        if(pos<=1||head==null){
            addAtBeginning(id,name,qty,price);
            return;
        }

        ItemNode newNode=new ItemNode(id,name,qty,price);
        ItemNode temp=head;
        int count=1;
        while(temp.next!=null&&count<pos-1){
            temp=temp.next;
            count++;
        }

        newNode.next=temp.next;
        temp.next=newNode;
    }

//     Remove by ItemId
    public void removeByItemId(int id){
        if(head==null){
            System.out.println("Inventory is empty.");
            return;
        }

        if(head.itemId==id){
            head=head.next;
            System.out.println("Item removed successfully.");
            return;
        }

        ItemNode temp=head;
        while(temp.next!=null&&temp.next.itemId!=id){
            temp=temp.next;
        }

        if(temp.next==null){
            System.out.println("Item not found.");
        }else{
            temp.next=temp.next.next;
            System.out.println("Item removed successfully.");
        }
    }
//      Update Quantity
    public void updateQuantity(int id,int newQty){
        ItemNode temp=head;
        while(temp!=null){
            if(temp.itemId==id){
                temp.quantity=newQty;
                System.out.println("Quantity updated.");
                return;
            }
            temp=temp.next;
        }
        System.out.println("Item not found.");
    }

       // searchByItemId
    public void searchByItemId(int id){
        ItemNode temp=head;
        while(temp!=null){
            if(temp.itemId==id){
                displayItem(temp);
                return;
            }
            temp=temp.next;
        }
        System.out.println("Item not found.");
    }
        // searchByItemName
    public void searchByItemName(String name){
        ItemNode temp=head;
        boolean found=false;

        while(temp!=null){
            if(temp.itemName.equalsIgnoreCase(name)){
                displayItem(temp);
                found=true;
            }
            temp=temp.next;
        }

        if(!found){
            System.out.println("Item not found.");
        }
    }
     //    calculateTotalValue
    public void calculateTotalValue(){
        ItemNode temp=head;
        double total=0;

        while(temp!=null){
            total+=temp.price*temp.quantity;
            temp=temp.next;
        }

        System.out.println("Total Inventory Value: "+total);
    }
     // sortByName

    public void sortByName(boolean ascending){
        head=mergeSortByName(head,ascending);
    }
    //   sortByPrice

    public void sortByPrice(boolean ascending){
        head=mergeSortByPrice(head,ascending);
    }

    //   mergeSortByName
    private ItemNode mergeSortByName(ItemNode node,boolean asc){
        if(node==null||node.next==null)
            return node;

        ItemNode mid=getMiddle(node);
        ItemNode nextMid=mid.next;
        mid.next=null;
        ItemNode left=mergeSortByName(node,asc);
        ItemNode right=mergeSortByName(nextMid,asc);
        return mergeByName(left,right,asc);
    }

    private ItemNode mergeByName(ItemNode a,ItemNode b,boolean asc){
        if(a==null) return b;
        if(b==null) return a;
        if((asc&&a.itemName.compareToIgnoreCase(b.itemName)<=0)
            ||(!asc&&a.itemName.compareToIgnoreCase(b.itemName)>0)){
            a.next=mergeByName(a.next,b,asc);
            return a;
        }else{
            b.next=mergeByName(a,b.next,asc);
            return b;
        }
    }

    //    mergeSortByPrice
    private ItemNode mergeSortByPrice(ItemNode node,boolean asc){
        if(node==null||node.next==null)
            return node;

        ItemNode mid=getMiddle(node);
        ItemNode nextMid=mid.next;
        mid.next=null;
        ItemNode left=mergeSortByPrice(node,asc);
        ItemNode right=mergeSortByPrice(nextMid,asc);
        return mergeByPrice(left,right,asc);
    }

    private ItemNode mergeByPrice(ItemNode a,ItemNode b,boolean asc){
        if(a==null) return b;
        if(b==null) return a;

        if((asc&&a.price<=b.price)||(!asc&&a.price>b.price)){
            a.next=mergeByPrice(a.next,b,asc);
            return a;
        }else{
            b.next=mergeByPrice(a,b.next,asc);
            return b;
        }
    }
//       getMiddle

    private ItemNode getMiddle(ItemNode node){
        ItemNode slow=node,fast=node.next;
        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
// Display Inventory

    public void displayInventory(){
        if(head==null){
            System.out.println("Inventory is empty.");
            return;
        }

        ItemNode temp=head;
        while(temp!=null){
            displayItem(temp);
            temp=temp.next;
        }
    }
    // Display single item
    private void displayItem(ItemNode item){
        System.out.println(
            "ID: "+item.itemId+
            ", Name: "+item.itemName+
            ", Quantity: "+item.quantity+
            ", Price: "+item.price
        );
    }
}
public class InventoryManagementSystem{
    public static void main(String[] args){

        InventoryList inventory=new InventoryList();
        inventory.addAtEnd(101,"Laptop",5,50000);
        inventory.addAtEnd(102,"Mouse",20,500);
        inventory.addAtBeginning(103,"Keyboard",10,1500);
        System.out.println("Inventory List:");
        inventory.displayInventory();

        System.out.println("\nUpdate Quantity:");
        inventory.updateQuantity(102,30);

        System.out.println("\nSearch by Item Name:");
        inventory.searchByItemName("Laptop");
        System.out.println("\nTotal Inventory Value:");
        inventory.calculateTotalValue();

        System.out.println("\nSorted by Price (Ascending):");
        inventory.sortByPrice(true);
        inventory.displayInventory();
    }
}
