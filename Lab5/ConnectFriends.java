public class ConnectFriends {
    public String name;
    public int maxFrd=2;
    public int TotalFriendRequest;
    public int index;
    public ConnectFriends [] sendfrdReq;
    public Boolean found;
    public ConnectFriends(String name){
        this.name = name;
        System.out.println("Welcome to ConnectFriends, "+this.name);
        sendfrdReq = new ConnectFriends[maxFrd];
    }
    public ConnectFriends(String name ,int maxFrd){
        this(name);
        this.maxFrd = maxFrd;
        sendfrdReq = new ConnectFriends[maxFrd];
    }

    public void sendFriendRequest(ConnectFriends obj){
        if(this.maxFrd >TotalFriendRequest){
            TotalFriendRequest++;
            sendfrdReq[index]=obj;
            index++;
            System.out.println(name +" send a friend request to "+obj.name+".");
        }else{
            System.out.println(name+" has reached the friend request limit!");

        }

    }
    public void sendFriendRequest(ConnectFriends obj ,ConnectFriends obj2){
        sendFriendRequest(obj);
        sendFriendRequest(obj2);
    }

    public void showDetails(){
        System.out.println("User Name: "+ this.name);
        System.out.println("Maximum number of friend sent Friend Request: "+maxFrd);
        System.out.println("Total Friend Request: "+ TotalFriendRequest);
        System.out.print("Sent Friend Request: ");
        if(sendfrdReq[0]!=null){
            for(int i=0;i<index;i++){
                System.out.print(sendfrdReq[i].name +" ");
            }
            System.out.println();
        }else{
            System.out.println();
        }
    }
    public void removeRequest(String name) {
        found = false;  
        for (int i = 0; i < index; i++) {
            if (sendfrdReq[i].name.equals(name)) {  
                sendfrdReq[i] = null;
                found = true;
                for (int j = i; j < index - 1; j++) {
                    sendfrdReq[j] = sendfrdReq[j + 1];
                }
                sendfrdReq[index - 1] = null;
                index--;
                TotalFriendRequest--;
                break;
            }
        }
        if (!found) {
            System.out.println(name + " is not in " + this.name + "'s send Request list.");
        } else {
            System.out.println("Request to add " + name + " is removed for " + this.name);
        }
    }

}
