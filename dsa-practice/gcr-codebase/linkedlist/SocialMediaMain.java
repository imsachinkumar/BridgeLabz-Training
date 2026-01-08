// Friend node
class FriendNode{
    int id;
    FriendNode next;

    FriendNode(int id){
        this.id=id;
        next=null;
    }
}

// User node
class UserNode{
    int userId,age;
    String name;
    FriendNode friends;
    UserNode next;

    UserNode(int userId,String name,int age){
        this.userId=userId;
        this.name=name;
        this.age=age;
        friends=null;
        next=null;
    }
}

// Social media system
class SocialMedia{
    UserNode head;

    // Add user
    void addUser(int id,String name,int age){
        UserNode newUser=new UserNode(id,name,age);
        newUser.next=head;
        head=newUser;
    }

    // Add friend
    void addFriend(int uid,int fid){
        UserNode user=findUser(uid);
        if(user==null) return;

        FriendNode f=new FriendNode(fid);
        f.next=user.friends;
        user.friends=f;
    }

    // Display friends
    void displayFriends(int uid){
        UserNode user=findUser(uid);
        if(user==null) return;

        FriendNode temp=user.friends;
        while(temp!=null){
            System.out.println("Friend ID: "+temp.id);
            temp=temp.next;
        }
    }

    // Find user
    UserNode findUser(int id){
        UserNode temp=head;
        while(temp!=null){
            if(temp.userId==id) return temp;
            temp=temp.next;
        }
        return null;
    }
}
public class SocialMediaMain{
    public static void main(String[] args){
        SocialMedia sm=new SocialMedia();

        sm.addUser(1,"Amit",20);
        sm.addUser(2,"Rahul",21);
        sm.addFriend(1,2);
        sm.displayFriends(1);
    }
}
