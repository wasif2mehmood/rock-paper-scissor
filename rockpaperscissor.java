import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class rockpaperscissor {
    public static void fun(ArrayList rps){
        Random ran=new Random();
        int your_score=0,comp_score=0;
        Scanner input = new Scanner(System.in);
        while(true){
            int comp = ran.nextInt(3);
            ArrayList<String> userdec = new ArrayList<String>();
            System.out.println("please enter your decision and 0 to end game");
            String dec = input.next();
            System.out.println(rps.get(comp));
            userdec.add(dec);
            if(dec.equals("0")){
                System.out.println("your score = "+your_score);
                System.out.println("my score = "+comp_score);
                if(your_score>comp_score){
                    System.out.println("you won");
                }
                if(your_score<comp_score){
                    System.out.println("i won");
                }
                if(your_score==comp_score){
                    System.out.println("its a draw");
                }
                break;
                }
            if (rps.containsAll(userdec)==false&&dec.equals("0")==false){
                System.out.println("please enter valid input");
                continue;}
            else{
                if (dec.equalsIgnoreCase("paper")&&((String) rps.get(comp)).equalsIgnoreCase("rock")){
                    System.out.println("your point");
                    your_score+=1;
                }
                else if(dec.equalsIgnoreCase("rock")&&((String) rps.get(comp)).equalsIgnoreCase("paper")){
                    System.out.println("my point");
                    comp_score++;
                }
                else if(dec.equalsIgnoreCase("rock")&&((String) rps.get(comp)).equalsIgnoreCase("scissor")){
                    System.out.println("your point");
                    your_score++;
                }
                else if(dec.equalsIgnoreCase("scissor")&&((String) rps.get(comp)).equalsIgnoreCase("paper")){
                    System.out.println("your point");
                    your_score++;
                }
                else if(dec.equalsIgnoreCase("paper")&&((String) rps.get(comp)).equalsIgnoreCase("scissor")){
                    System.out.println("my point");
                    comp_score++;
                }
                else if(dec.equalsIgnoreCase("scissor")&&((String) rps.get(comp)).equalsIgnoreCase("rock")){
                    System.out.println("my point");
                    comp_score++;
                }
                else{
                    System.out.println("draw");
                    continue;
                }
            }


            

        }
    }
    public static ArrayList input() {
        ArrayList<String> rps = new ArrayList<String>();
        rps.add("rock");
        rps.add("paper");
        rps.add("scissor");
        return rps;
        
    }
    public static void main(String[] args) {
             fun(input());
    }
}
