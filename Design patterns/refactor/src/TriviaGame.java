
import java.util.ArrayList;
import java.util.LinkedList;

public class TriviaGame {
    ArrayList players = new ArrayList();
    int[] places = new int[6];
    int[] wins = new int[6];
    boolean[] inPenaltyBox = new boolean[6];

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
        players.add(playerName);
        int numberOfPlayers=players.size();
        places[numberOfPlayers] = 0;
        wins[numberOfPlayers] = 0;
        inPenaltyBox[numberOfPlayers] = false;

        announce(playerName + " was added");
        announce("They are player number " + players.size());
        return true;
    }

    public void rollDice(int dice) {
        announce(players.get(currentPlayer) + " is the current player");
        announce("They have rolled a " + dice);

        if (inPenaltyBox[currentPlayer]) {
            if (dice % 2 != 0) {
                isGettingOutOfPenaltyBox = true;
                announce(players.get(currentPlayer) + " is getting out of the penalty box");
                newLocation(dice);
            }else {
                announce(players.get(currentPlayer) + " is not getting out of the penalty box");
                isGettingOutOfPenaltyBox = false;
            }
        } else {
            newLocation(dice);
        }
    }
    private void newLocation(int dice){
        places[currentPlayer] = places[currentPlayer] + dice;
        if (places[currentPlayer] > 11)
        {
            places[currentPlayer] = places[currentPlayer] - 12;
        }
        announce(players.get(currentPlayer)
                + "'s new location is "
                + places[currentPlayer]);
        announce("The category is " + currentCategory());
        askQuestion();
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


    private String currentCategory() {
        if (places[currentPlayer] %4 == 0) return "Pop";
        else if (places[currentPlayer] %4 == 1) return "Science";
        else if (places[currentPlayer]%4 == 2) return "Sports";
        else return "Rock";
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