import java.util.ArrayList;

public class IntegerSet {
    ArrayList<Integer> number;

    IntegerSet() {
        number = new ArrayList<>();
    }

    //Requires: int
    //Modifies: this
    //Effects: insert integer into set unless it's already there, in which case do nothing
    public void insert(Integer num) {
        if (!number.contains(num)) {
            number.add(num);
        }
    }

    //Requires: int
    //Modifies: this
    //Effects: if the integer is in the set remove it, otherwise do nothing
    public void remove(Integer num) {
        if (number.contains(num)) {
            number.remove(num);
        }
    }

        //Effects: returns the size of the integer set
        public int size(){
            return number.size();
        }

        //Requires: int
        //Effects: returns true if num is in set, otherwise return false
        public boolean contains(Integer num){
            return number.contains(num);
        }


    }
