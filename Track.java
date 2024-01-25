// Shoham Avraham 318232469; Ronen Giladov 209506757; Assignmet2_part1
package Race;

public class Track {
    private int finishedRacers = 0;

    public int runners(){
        finishedRacers++;
        return finishedRacers;
    }
}
