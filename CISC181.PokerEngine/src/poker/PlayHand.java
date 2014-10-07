package poker;

import java.util.ArrayList;
import java.util.Collections;

public class PlayHand {

	public static void main(String[] args) {
			
		//Reg Five card
		Deck dStud = new Deck();
		Hand hStud = new Hand(dStud);
		
		//Joker five card
		Deck dJoker = new Deck(2);
		Hand hJoker = new Hand(dJoker);
		
		//Four Wilds five card
		ArrayList<Card> Wilds = new ArrayList<Card>();
		Wilds.add(new Card(eSuit.CLUBS, eRank.TWO));
		Wilds.add(new Card(eSuit.DIAMONDS, eRank.TWO));
		Wilds.add(new Card(eSuit.SPADES, eRank.TWO));
		Wilds.add(new Card(eSuit.HEARTS, eRank.TWO));
		
		Deck dWild = new Deck(0, Wilds);
		Hand hWild = new Hand(dWild);

	}

}
