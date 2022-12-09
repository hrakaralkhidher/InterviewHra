public class CapitalizeTitle {
    public static void main(String[] args) {
        //jaVa iS eASy  -> Java Is Easy
        System.out.println(UsingSplit("jaVa iS eASy"));

    }
    public static String UsingSplit(String param1){
        String CapitalizedString = "";
        String[] MyWord = param1.split(" ");

        for(String Word:MyWord){
            //word = MyWord[i];
            //jaVa iS eASy
            String FirstChar = Word.substring(0,1);
//            String RemainingChar = Word.substring(1,Word.length()-1); or just the below one to make it easy
            String RemainingChar = Word.substring(1);

//             FirstChar.toUpperCase(); you can not write this directly cuz the String is immutable
            FirstChar = FirstChar.toUpperCase();
            RemainingChar = RemainingChar.toLowerCase();

            CapitalizedString = CapitalizedString + FirstChar + RemainingChar + " ";              //<
//            CapitalizedString +=  FirstChar + RemainingChar;  //<-- same as above                      <
//                                                                                                         <
//                                                                                                           <

        }////                                                                                                   <

//                                                                                                                <
        CapitalizedString = CapitalizedString.trim();// this is just to remove the space from the front and end thats
        // why it doesnt matter if you add space to front on end
        return CapitalizedString;

    }
}
