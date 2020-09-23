public class Game {
    String ID;
    String title;
    String genre;
    double dailyRent;
    boolean rentStatus;

    public Game(String ID, String title, String genre, double dailyRent) {
        this.ID = ID;
        this.title = title;
        this.genre = genre;
        this.dailyRent = dailyRent;
        this.rentStatus = false;
    }

    public boolean getRentStatus() {
        // Is game available? True or false
        return true; 
    }

    public void print () {
        System.out.println( this.ID + " : " + this.title + "(" + this.genre + ") " + this.dailyRent + " Status: " + this.rentStatus);
        System.out.println();
    }
}
