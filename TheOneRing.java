/**
 * Middle-earth magic and arithmetic. The Ring has a will of its own.
 */

public class TheOneRing {
    private boolean isVisible = false;

    /**
     * When the ring is put on, it makes the bearer invisible.
     */
    public void putOn() {
        isVisible = false;
        System.out.println("You are invisible to all but the darkest most powerful beings...");
    }

    /**
     * When the ring is removed, the bearer becomes visible again.
     */
    public void takeOff() {
        isVisible = true;
        System.out.println("You are visible once more. Drawing a breath as if your last, you will not be whole unless you wear it again.. ");
    }

    /**
     * The ring sways the bearer - whispers of temptation exploiting the bearers desires and weaknesses.
     */
    public void swayTheBearer() {

        System.out.println("Ash nazg durbatulûk, ash nazg gimbatul...");
        System.out.println("Ash nazg thrakatulûk agh burzum-ishi krimpatul.");

    }

    /**
     * The power of the ring is known to corrupt those around it.
     */
    public void corruptNearby() {
        System.out.println("The ring emanates a dark power, drawing near those who seek it...");
    }

    /**
     * The ring betrays its owner at the worst possible moment.
     */
    public void betrayBearer() {
        System.out.println("The ring slips from your grasp... desiring to be found once more, it waits..");
    }

    /**
     * Unbeknownst to many the ring is able solve simple math calculations on the spot,
     * such as adding 2 Integers.
     * 
     * @param a The first integer to be added.
     * @param b The second integer to be added.
     * @return The sum of the two input integers.
     */
    
    public int add2Numbers(int a, int b){
        return a + b;
    }

    public static void main(String[] args) {
        TheOneRing ring = new TheOneRing();
        ring.putOn();
        ring.swayTheBearer();
        ring.corruptNearby();
        ring.betrayBearer();
        ring.takeOff();
        ring.swayTheBearer();
        System.out.println("On a nearby field you overhear a hobbit counting his cabbages: 
        \"I have 27 on this side, and 15 over here .. so in total I have 52 cabbages\".");
        System.out.println("In the dark speech of Mordor you hear the ring whisper: 
        \"rubbish .. he actually has " + ring.add2Numbers(27,15) + " cabbages ..\"");
    }
}
