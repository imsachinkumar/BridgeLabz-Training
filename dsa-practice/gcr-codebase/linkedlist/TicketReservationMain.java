// Ticket node
class TicketNode{
    int id;
    String customer,movie;
    TicketNode next;

    TicketNode(int id,String c,String m){
        this.id=id;
        customer=c;
        movie=m;
        next=null;
    }
}
// Ticket system
class TicketSystem{
    TicketNode head;

    // Add ticket
    void addTicket(int id,String c,String m){
        TicketNode newNode=new TicketNode(id,c,m);
        if(head==null){
            head=newNode;
            newNode.next=head;
            return;
        }

        TicketNode temp=head;
        while(temp.next!=head){
            temp=temp.next;
        }
        temp.next=newNode;
        newNode.next=head;
    }

    // Display tickets
    void display(){
        if(head==null) return;

        TicketNode temp=head;
        do{
            System.out.println(temp.id+" "+temp.customer+" "+temp.movie);
            temp=temp.next;
        }while(temp!=head);
    }
}
public class TicketReservationMain{
    public static void main(String[] args){
        TicketSystem ts=new TicketSystem();

        ts.addTicket(1,"Ravi","Avengers");
        ts.addTicket(2,"Amit","Avatar");
        ts.display();
    }
}
