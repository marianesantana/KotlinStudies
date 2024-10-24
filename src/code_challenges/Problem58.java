package code_challenges;

public class Problem58 {
    public int lengthOfLastWord(String s) {

        //Com Split 1ms
//        String[] newS = s.split(" ");
//        int lastIndex = newS.length -1;
//        int sizeOfLasIndex = newS[lastIndex].length();
//        return sizeOfLasIndex;

        //com charAt 0ms
        int count = 0;
        for (int i = s.length()-1; i>=0; i--){
            if(s.charAt(i) != ' '){
                count++;
            } else if (count>0) {
                break;

            }
        }
        return count;
    }

    public static void main(String[] args) {
        Problem58 problem58 = new Problem58();
        System.out.println(problem58.lengthOfLastWord("luffy is still joyboy"));
    }
}
