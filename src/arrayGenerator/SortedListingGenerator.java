package arrayGenerator;

/**
 * A simple array generator, that generates a sorted array [0,1,2,..,n]
 *
 * @author Hugh Osborne
 * @version September 2020
 */

public class SortedListingGenerator implements ListingGenerator {

    private int[] array;

    /**
     * Create an array of ints of size <tt>size</tt>, and populate it
     * with the values 0..<tt>size</tt>-1.
     *
     * @param size the size of the array to be created
     */
    public SortedListingGenerator(int size)
    {
        array = new int[size];
        for (int index = 0; index < array.length; index++) {
            array[index] = index;
        }
    }

    /**
     * @return the array created by this ArrayGenerator
     */
    public int[] getArray() {
        return array;
    }

    /**
     * @return the size of the array
     */
    public int getSize() {
        return array.length;
    }
}
