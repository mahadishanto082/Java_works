package ScienceFair;

import java.util.Random;
import java.util.Scanner;

class Judge{
    int mark;
    public Judge(){
        Random random = new Random();
        mark = random.nextInt(10)+ random.nextInt(10)+random.nextInt(10);
    }
    public int getMark() {
        return mark;
    }


}
class Team{
    String teamName;
    String projectDescription;
    int  mark;

    Team(String teamName,String projectDescription){
        this.teamName = teamName;
        this.projectDescription = projectDescription;
    }

    void setMark(){
        Judge j = new Judge();
        this.mark = j.getMark();
    }

    public int getMark() {
        return mark;
    }

    void viewTeamAndPrjjectDiscription(){
        System.out.println(teamName +"Team name : ");
        System.out.println(projectDescription +"Project Description : ");
    }
    void showPoint(){
        System.out.println(teamName +"Team name : ");
        System.out.println(mark +"Total Point : ");
    }
}

class Main {
    public static void main(String[] args) {
        try (Scanner cin = new Scanner(System.in)) {
            // Your code here...
        } catch (Exception e) {
            e.printStackTrace();
        }
        int n,maxPoint=0,index=0;
        System.out.println("Enter How many team : ");
        n = cin.nextInt();
        Team[] team = new Team[n];
        for(int j=0;j<n;j++){
            String name;
            String descroiptin;
            System.out.println("Team number "+(j+1));
            System.out.println("Enter team name : ");
            name = cin.next();
            cin.nextLine();
            System.out.println("Team despription : ");
            descroiptin = cin.nextLine();
            team[j] = new Team(name,descroiptin);
        }
        System.out.println("list of teams and their project description. ");
        for(int i=0;i<n;i++){
            team[i].viewTeamAndPrjjectDiscription();
        }
        for(int i=0;i<n;i++){
            team[i].setMark();

        }
        System.out.println("Team name and marks ");
        for(int i=0;i<n;i++){
            team[i].showPoint();
            if(team[i].getMark()>maxPoint){
                maxPoint = team[i].getMark();
                index = i;
            }
        }
        System.out.println("\n\n____The Winner team : "+team[index].teamName+"__");
        System.out.println(maxPoint +"Maximum point : ");
    }
}