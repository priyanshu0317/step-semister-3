class Participant {
    String name;
    String teamName;
    boolean registered;


    Participant(String name) {
        this(name, "Individual", false);
    }


    Participant(String name, String teamName, boolean registered) {
        this.name = name;
        this.teamName = teamName;
        this.registered = registered;
    }

    void printStatus() {
        System.out.println(name + " | Team: " + teamName +
                " | Registered: " + registered);
    }
}

public class Main {
    public static void main(String[] args) {

        Participant[] participants = {
                new Participant("Ravi"),
                new Participant("Anitha", "CodeStars", true),
                new Participant("Arjun", "TechTeam", false)
        };

        for (Participant p : participants) {
            p.printStatus();
        }
    }
}