// Process node
class ProcessNode{
    int pid,remaining;
    ProcessNode next;

    ProcessNode(int pid,int burst){
        this.pid=pid;
        this.remaining=burst;
        next=null;
    }
}
// Scheduler class
class RoundRobin{
    ProcessNode head;

    // Add process
    void addProcess(int pid,int burst){
        ProcessNode newNode=new ProcessNode(pid,burst);

        if(head==null){
            head=newNode;
            newNode.next=head;
            return;
        }

        ProcessNode temp=head;
        while(temp.next!=head){
            temp=temp.next;
        }
        temp.next=newNode;
        newNode.next=head;
    }

    // Execute round robin
    void execute(int quantum){
        if(head==null) return;

        ProcessNode curr=head;
        while(true){
            if(curr.remaining>0){
                int exec=Math.min(curr.remaining,quantum);
                curr.remaining-=exec;
                System.out.println("Process "+curr.pid+" ran for "+exec);
            }

            if(allDone()) break;
            curr=curr.next;
        }
    }
    // Check completion
    boolean allDone(){
        ProcessNode temp=head;
        do{
            if(temp.remaining>0) return false;
            temp=temp.next;
        }while(temp!=head);
        return true;
    }
}
public class RoundRobinMain{
    public static void main(String[] args){
        RoundRobin rr=new RoundRobin();
        rr.addProcess(1,10);
        rr.addProcess(2,6);
        rr.execute(4);
    }
}
