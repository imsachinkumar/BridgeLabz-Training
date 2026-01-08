// Node class
class TaskNode{
    int taskId;
    String taskName;
    int priority;
    String dueDate;
    TaskNode next;

    TaskNode(int taskId,String taskName,int priority,String dueDate){
        this.taskId=taskId;
        this.taskName=taskName;
        this.priority=priority;
        this.dueDate=dueDate;
        this.next=null;
    }
}
// TaskScheduler class using Circular Linked List
class TaskScheduler{
    private TaskNode head;
    private TaskNode current;
    TaskScheduler(){
        head=null;
        current=null;
    }
    // Add at beginning
    public void addAtBeginning(int id,String name,int priority,String dueDate){
        TaskNode newNode=new TaskNode(id,name,priority,dueDate);
        if(head==null){
            head=newNode;
            newNode.next=head;
            current=head;
        }else{
            TaskNode temp=head;
            while(temp.next!=head){
                temp=temp.next;
            }
            newNode.next=head;
            temp.next=newNode;
            head=newNode;
        }
    }
    // Add at end
    public void addAtEnd(int id,String name,int priority,String dueDate){
        TaskNode newNode=new TaskNode(id,name,priority,dueDate);
        if(head==null){
            head=newNode;
            newNode.next=head;
            current=head;
        }else{
            TaskNode temp=head;
            while(temp.next!=head){
                temp=temp.next;
            }
            temp.next=newNode;
            newNode.next=head;
        }
    }
    // Add at specific position
    public void addAtPosition(int position,int id,String name,int priority,String dueDate){
        if(position<=1||head==null){
            addAtBeginning(id,name,priority,dueDate);
            return;
        }

        TaskNode newNode=new TaskNode(id,name,priority,dueDate);
        TaskNode temp=head;
        int count=1;

        while(temp.next!=head&&count<position-1){
            temp=temp.next;
            count++;
        }

        newNode.next=temp.next;
        temp.next=newNode;
    }

    // Remove by Task ID
    public void removeByTaskId(int taskId){
        if(head==null){
            System.out.println("Task list is empty.");
            return;
        }

        TaskNode curr=head;
        TaskNode prev=null;

        do{
            if(curr.taskId==taskId){

                if(curr==head&&curr.next==head){
                    head=null;
                    current=null;
                }else if(curr==head){
                    TaskNode temp=head;
                    while(temp.next!=head){
                        temp=temp.next;
                    }
                    head=head.next;
                    temp.next=head;
                }else{
                    prev.next=curr.next;
                }

                System.out.println("Task removed successfully.");
                return;
            }
            prev=curr;
            curr=curr.next;
        }while(curr!=head);

        System.out.println("Task not found.");
    }
    // View current task and move to next
    public void viewCurrentTask(){
        if(current==null){
            System.out.println("No tasks available.");
            return;
        }

        displayTask(current);
        current=current.next;
    }
    // Display all tasks
    public void displayAllTasks(){
        if(head==null){
            System.out.println("Task list is empty.");
            return;
        }

        TaskNode temp=head;
        do{
            displayTask(temp);
            temp=temp.next;
        }while(temp!=head);
    }

    // Search by priority
    public void searchByPriority(int priority){
        if(head==null){
            System.out.println("Task list is empty.");
            return;
        }

        TaskNode temp=head;
        boolean found=false;

        do{
            if(temp.priority==priority){
                displayTask(temp);
                found=true;
            }
            temp=temp.next;
        }while(temp!=head);

        if(!found){
            System.out.println("No tasks found with this priority.");
        }
    }

    // Display single task
    private void displayTask(TaskNode task){
        System.out.println(
            "Task ID: "+task.taskId+
            ", Name: "+task.taskName+
            ", Priority: "+task.priority+
            ", Due Date: "+task.dueDate
        );
    }
}
public class TaskSchedulerSystem{
    public static void main(String[] args){
        TaskScheduler scheduler=new TaskScheduler();
        scheduler.addAtEnd(1,"Design Module",1,"10-02-2026");
        scheduler.addAtEnd(2,"Code Implementation",2,"15-02-2026");
        scheduler.addAtBeginning(3,"Requirement Analysis",1,"05-02-2026");

        System.out.println("All Tasks:");
        scheduler.displayAllTasks();
        System.out.println("\nCurrent Task:");
        scheduler.viewCurrentTask();
        scheduler.viewCurrentTask();

        System.out.println("\nSearch by Priority:");
        scheduler.searchByPriority(1);
        System.out.println("\nRemove Task:");
        scheduler.removeByTaskId(2);
        System.out.println("\nFinal Task List:");
        scheduler.displayAllTasks();
    }
}
