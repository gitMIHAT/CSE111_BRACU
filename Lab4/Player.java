public class Player{
    public String name;
    public int hp;
    public int index =0;
    String [] def = new String[5];

    public Player(String name){
        this(name,100);
    }
    public Player(String name,int hp){
        this.name = name;
        this.hp = hp;
        System.out.println(this.name+ " joined the game");
        System.out.println("HP: "+this.hp);//i am using this.name as usual i do , i can also use the local ones;
    }


    public void viewInfo(){
        String str="";
        System.out.println("Player name: "+name);
        System.out.println("Current HP: "+hp);
        if(index==0) {
            return;
        }else {
            System.out.println("Defeated:");
            for(int i=0;i<index;i++){
                str+=(def[i] +", ");
            }
        }
        System.out.println(str);
    }
    public void defeatVillain(String vname,int vhp){
        if(hp>= vhp){
            System.out.println("defeated "+vname);
            hp += vhp;
            def[index++]= vname;
        }else{
            System.out.println("failed to defeat "+vname);
        }
    }
    public void defeatVillain(char ch,String vname, int vhp){
        int n = ch -'0';
        hp *=n;
        System.out.println("HP with "+ch+"x boost: "+hp);
        defeatVillain(vname, vhp);
    }
    public void defeatVillain(Player obj){
        defeatVillain(obj.name, obj.hp);
    }
}