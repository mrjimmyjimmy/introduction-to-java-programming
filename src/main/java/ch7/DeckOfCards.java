package ch7;

/**
 * @author jimmy xu
 * @date 2020/7/29 8:22
 */
public class DeckOfCards {

    enum Suit {
        /**
         * 牌的颜色
         */
        SPADES,
        HEARTS,
        DIAMONDS,
        CLUBS
    }

    private static int[] deck = new int[52];
    static {
        for (int i = 0; i < 52; i++) {
            deck[i] = i;
        }

        // shuffle the cards
        for (int i = 0; i < 52; i++) {
            int index = (int) (Math.random() * 52);
            int temp = deck[i];
            deck[i] = deck[index];
            deck[index] = temp;
        }
    }

    public static void main(String[] args) {
        for (int i = 0; i < 4; i++) {
            System.out.println(pick(i));
        }
    }

    private static String pick(int i) {
        int card = deck[i];
        int rankNumber = card % 13 + 1;
        int suitNumber = card / 13;
        return "The card is " + Suit.values()[suitNumber].name() + " " + rankNumber;
    }
}
