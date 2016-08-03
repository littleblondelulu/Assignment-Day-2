public class Tweet {
    private  String text;
    private String username;
    //changed timestamp from int to double to count minutes in hours
    private double timestamp;
    private boolean isPrivate;

    public String getText(){
        return text;
    }

    public String getUserName(){
        return username;
    }

    public double getTimestamp(){
        return timestamp;
    }

    public boolean getIsPrivate() {
        return isPrivate;
    }

    public void setText(String newText){
    if(newText.length()> 140){
        System.out.println("Text exceeds 140 characters");
    } else {
        text = newText;
       }
    }

    public void setUserName(String newUserName){
        username = newUserName;
    }

    public void setTimestamp(double  newTimestamp){
        timestamp = newTimestamp;
    }

    public void setIsPrivate(boolean newPrivateAccount) {
        isPrivate = newPrivateAccount;
      }
}




public class Client{
   private  String name;
   private  int ssn;
   private  boolean usCitz;
   private  double checkingAccountBalance;

    public String getName() {
        return name;
    }

    public int getSSN(){
        return ssn;
    }

    public boolean getUSCitz(){
        return usCitz;
    }

    public double getCheckingAccountBalance(){
        return checkingAccountBalance;
    }

    public void setName(String newName){
        name = newName;
    }

    public void setSSN(int newSSN) {
        if (!usCitz) {return;
        }
        else
        {
            ssn = newSSN;
        }
    }

    public void setUSCitz(boolean newUSCitz){
        usCitz = newUSCitz;
    }

    public void setcheckingAccountBalance(double newCheckingAccountBalance) {
        checkingAccountBalance = newCheckingAccountBalance;
    }

}

public class Travel{
    private String destination;
    private  int flightNum;
    private boolean roundTrip;
    private int numPsgrs;
    private int numBags;

    public String getDestination(){
        return destination;
    }

    public int getFlightNum(){
        return flightNum;
    }

    public boolean getRoundTrip(){
        return roundTrip;
    }

    public int getNumPsgrs(){
        return numPsgrs;
    }

    public int getNumBags(){
        return numBags;
    }

    public void setDestination(String newDestination){
        destination = newDestination;
    }

    public void setFlightNum(int newFlightNum){
        flightNum = newFlightNum;
    }

    public void setRoundTrip(boolean newRoundTrip){
         roundTrip = newRoundTrip;
    }

    public void setNumPsgrs(int newNumPsgrs){
        numPsgrs = newNumPsgrs;
    }

    public void setNumBags(int newNumBags){
        if(newNumBags >= 2)
            System.out.println("There will be a minimum charge of $25 to check each additional bag.");

            numBags = newNumBags;
    }

}

public class Dog{
    private String name;
    private int age;
    private String breed;
    private int vetApt;
    private boolean upToDate;

    public String getName(){
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getBreed(){
      return breed;
    }

    public int getVetApt(){
        return vetApt;
    }

    public boolean getUpToDate(){
        return upToDate;
    }

    public void setName(String newName){
        name = newName;
    }

    public void setAge(int newAge){
        age = newAge;
    }

    public void setBreed(String newBreed){
        breed = newBreed;
    }

    public void setVetApt(int newVetApt){
        vetApt = newVetApt;
    }

    public void setUpToDate(boolean newUpToDate) {
        if (!newUpToDate) {
            System.out.println("Time for a checkup!");
        } else {
            upToDate = newUpToDate;
        }
    }
}

public class Game{
    private String sport;
    private String team1;
    private String team2;
    private int score;
    private boolean win;
    private String vip;

    public String getSport(){
        return sport;
    }

    public String getTeam1(){
        return team1;
    }

    public String getTeam2(){
        return team2;
    }

     public int getScore(){
         return score;
     }

    public boolean getWin(){
        return win;
    }

    public String getVIP(){
        return vip;
    }

    public void setSport(String newSport){
        sport = newSport;
    }

    public void setTeam1(String newTeam1){
        team1 = newTeam1;
    }

    public void setTeam2(String newTeam2){
        team2 = newTeam2;
    }

    public void setScore(int newScore){
        score = newScore;
    }
    //added 2 arguments (team1pts / team2pts) as placeholders
    public void setWin(boolean newWin, team1pts, team2pts) {
        if (score == 0) {
            System.out.println("It's a tie for " + team1 + " and " + team2 + " with a score of " + setScore() + "!");
        } else {
            win = newWin;
        }
    }

    public void setVIP(String newVIP){
        vip = newVIP;
    }

}

