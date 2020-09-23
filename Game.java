public class Game {
    String ID;
    String title;
    String genre;
    double dailyRent;
    boolean rentStatus;
    double totalProfit; 

    public Game(String ID, String title, String genre, double dailyRent, double totalProfit) {
        this.ID = ID;
        this.title = title;
        this.genre = genre;
        this.dailyRent = dailyRent;
        this.rentStatus = false;
        this.totalProfit = totalProfit; 
    }

    public boolean getRentStatus() {
        // Is game available? True or false
        return true; 
    }
    public void printTotalProfit(double totalProfit, int days) {
        this.totalProfit = totalProfit*days; 
        System.out.println(""); 
    }
    public void print () {
        System.out.println( this.ID + " : " + this.title + "(" + this.genre + ") " + this.dailyRent + " Status: " + this.rentStatus);
        System.out.println();
    }
}
