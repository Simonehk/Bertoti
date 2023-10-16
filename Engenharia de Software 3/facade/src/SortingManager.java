
//facade
public class SortingManager {

    private Sorter quicksort;    
    private Sorter mergesort;

    public SortingManager() {
        this.quicksort = (Sorter) new Quicksort();
        this. mergesort = (Sorter) new Mergesort();
    }    

    public void doQuicksort() {
        this.quicksort.sort();
    }

    public void doMergesort() {
        this.mergesort.sort();
    }
}
