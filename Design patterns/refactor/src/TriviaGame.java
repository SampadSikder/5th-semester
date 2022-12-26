
import java.util.ArrayList;
import java.util.LinkedList;

class Player{
    String playerName;
    int places;
    int wins;
    boolean inPenaltyBox;
    Player(String playerName){
        this.playerName=playerName;
        this.places=0;
        this.wins=0;
        this.inPenaltyBox=false;
    }
    public void setWins(int wins){
        this.wins=wins;
    }
    public void newLocation(int dice){
        places = places + dice;
        if (places > 11)
        {
            places= places - 12;
        }

    }
    public String currentCategory() {
        if (places%4 == 0) return "Pop";
        else if (places %4 == 1) return "Science";
        else if (places%4 == 2) return "Sports";
        else return "Rock";
    }

    public String getPlayerName(){
        return playerName;
    }
    public int getPlace(){
        return places;
    }
    public int getNumberOfWins(){
        return wins;
    }
    public boolean isInPenaltyBox(){
        return inPenaltyBox;
    }

}
public class TriviaGame {
    ArrayList<Player> players = new ArrayList<Player>();
    LinkedList popQuestions = new LinkedList();
    LinkedList scienceQuestions = new LinkedList();
    LinkedList sportsQuestions = new LinkedList();
    LinkedList rockQuestions = new LinkedList();

    int currentPlayer = 0;
    boolean isGettingOutOfPenaltyBox;

    public TriviaGame() {
        for (int i = 0; i < 50; i++) {
            popQuestions.addLast("Pop Question " + i);
            scienceQuestions.addLast(("Science Question " + i));
            sportsQuestions.addLast(("Sports Question " + i));
            rockQuestions.addLast("Rock Question "+ i);
        }
    }



    public boolean isPlayable() {
        return (players.size() >= 2);
    }

    public boolean addPlayer(String playerName) {
        Player player=new Player(playerName);
        players.add(player);
        return true;
    }

    public void rollDice(int dice) {

        if (players.get(currentPlayer).isInPenaltyBox()) {
            if (dice % 2 != 0) {
                isGettingOutOfPenaltyBox = true;
                players.get(currentPlayer).newLocation(dice);
                players.get(currentPlayer).currentCategory();
                askQuestion();
            }else {
                isGettingOutOfPenaltyBox = false;
            }
        } else {
            players.get(currentPlayer).newLocation(dice);
            players.get(currentPlayer).currentCategory();
            askQuestion();
        }
    }

    private void askQuestion() {
        if (currentCategory() == "Pop")
            announce(popQuestions.removeFirst());
        if (currentCategory() == "Science")
            announce(scienceQuestions.removeFirst());
        if (currentCategory() == "Sports")
            announce(sportsQuestions.removeFirst());
        if (currentCategory() == "Rock")
            announce(rockQuestions.removeFirst());
    }



    public boolean wasCorrectlyAnswered() {
        if (inPenaltyBox[currentPlayer]) {
            if (isGettingOutOfPenaltyBox) {
                return addPointsAndReturnWinner();
            } else {
                currentPlayer++;
                if (currentPlayer == players.size()) currentPlayer = 0;
                return true;
            }
        } else {
            return addPointsAndReturnWinner();
        }
    }
    public boolean addPointsAndReturnWinner(){
        announce("Answer was correct!!!!");
        wins[currentPlayer]++;
        announce(players.get(currentPlayer)
                + " now has "
                + wins[currentPlayer]
                + " Gold Coins.");
        boolean winner = didPlayerWin();
        currentPlayer++;
        if (currentPlayer == players.size()) currentPlayer = 0;
        return winner;
    }
    public boolean wrongAnswer() {
        announce("Question was incorrectly answered");
        announce(players.get(currentPlayer) + " was sent to the penalty box");
        inPenaltyBox[currentPlayer] = true;
        currentPlayer++;
        if (currentPlayer == players.size()) currentPlayer = 0;
        return true;
    }

    private boolean didPlayerWin() {
        return !(wins[currentPlayer] == 6);
    }

    protected void announce(Object message) {
        System.out.println(message);
    }
}