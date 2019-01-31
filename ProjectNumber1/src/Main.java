public class Main {
    //Code your solution to problem number one here
    static int problemOne(String s){
        int answer = 0;
        for (int i = 0; i < s.length(); i++){
            if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u'){
                answer++;
            }
        }
        return answer;
    }
    //Code you problem number two here
    static int problemTwo(String s){
        int answer = 0;
    for (int i = 0; i <s.length()-2; i++){
        if (s.substring(i,i+3).equals("bob")){
            answer++;
        }
    }


        return answer;
    }
    //Code your solution to problem number 3 here
    static String problemThree(String s){
        String s1 = s;
        String s2 = "";
        String ts = "";
        for (int i=0; i<s.length();i++) {
            for (int j=i;j<s.length()-1;j++) {
                if ((int)s.charAt(j)<=(int)s.charAt(j+1)) {//Check if characters are in alphabetical order
                    s2 = s1.substring(i,j+2);//get substring
                } else {
                    s2 = s1.substring(i,j+1);
                    break; //Exit loop if characters are not in alphabetical order

                }

            }
            if (ts.length() >= s2.length()) {// check if the length of found string is longer
                s2 = ""; // reset processing string
            }
            else { // get the longer string
                ts = s2; // store the longest string here
                s2 = "";
            }
        }
        return ts;
    }
    public static void main(String[] args) {
        /*
        Set s to a string and run your method using s as the parameter
        Run your method in a println statement to determine what the output was
        Once you think you have it working try running the tests.
        The tests will put your method through several different Strings to test
        all possible cases.  If you have 100% success then there is no bugs in your methods.
         */
        String s;
    }
}
