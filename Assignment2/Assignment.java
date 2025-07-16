public class Assignment {
    public int tasks ;
    public String difficulty;
    public boolean submission ;
    void printDetails(){
        System.out.println("Number of task: "+ tasks);
        System.out.println("Difficulty Level :"+difficulty);
        System.out.println("Submission required :"+ submission);
    } 
    String makeOptional(){
        String sentence;
        if(submission){
            sentence="Assignment will not require submission";
            submission=false;
        }
        else{
            sentence="Submission is already not required";
            //submission=true;
        }
        return sentence;
    }
}
