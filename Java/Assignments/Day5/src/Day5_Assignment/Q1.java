package Day5_Assignment;

/**
 * printable
 */
interface printable {    
    public void publicDetails();
}

class CktPlayer implements printable {
    private String name;
    private int runs;

    CktPlayer() {
        name = "not given";
        runs = 0;
    }

    CktPlayer(String name, int runs){
        this.name = name;
        this.runs = runs;
    }

    public void publicDetails(){
        System.out.println("Name: " + name);
        System.out.println("Runs: " + runs);
    }
}

class FktPlayer implements printable {
    private String name;
    private int goals;

    FktPlayer(){
        name = "not given";
        goals = 0;
    }

    FktPlayer(String name, int goals){
        this.name = name;
        this.goals = goals;
    }

    public void publicDetails() {
        System.out.println("Name: " + name);
        System.out.println("Goal: " + goals);
    }
}


public class Q1 {
    public static void main(String[] args){
        CktPlayer c = new CktPlayer("Virat", 10000);
        FktPlayer f = new FktPlayer("Neymar", 500);

        c.publicDetails();
        f.publicDetails();
    }
}
