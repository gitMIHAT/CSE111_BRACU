public class Trainer {
    public int id;
    public String name;
    static public int totalTrainer;
    public double avarageHp;

    public Trainer(String name){
        id = ++totalTrainer;
        System.out.println("Trainer ID: "+id+" Name: "+name +" - created");
    }
    public void catchPokemon(Pokemon obj){

    }
    public void viewPokeDex(){
        
    }
    public static void battle(Trainer obj , Trainer obj2){
        System.out.println("Battle Info");
        System.out.println(obj.name+"'s HP average: "+obj.avarageHp);
        System.out.println(obj2.name+ "'s HP average: "+obj2.avarageHp);
    }
}
