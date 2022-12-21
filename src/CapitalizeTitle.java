public class CapitalizeTitle {
    public static void main(String[] args) {
        //jaVa iS eASy  -> Java Is Easy
        System.out.println(UsingSplit("jaVa iS eASy"));

    }
    public static String UsingSplit(String param1){
        String CapitalizedString = "";
        String[] MyWord = param1.split(" ");////MyWord: ["jaVa", "iS", "eASy"]
        for(String Word:MyWord){//MyWord: ["jaVa", "iS", "eASy"] Word; "JaVa"// once its done with first word itll go to next one
            String FirstChar = Word.substring(0,1);//Word; "JaVa"  FirstChar: "j"
//            String RemainingChar = Word.substring(1,Word.length()-1); or just the below one to make it easy
            String RemainingChar = Word.substring(1);//Word; "jaVa" RemainingChar: "aVa"
            FirstChar = FirstChar.toUpperCase();//Word; "jaVa" FirstChar: "j" To: "J"
            RemainingChar = RemainingChar.toLowerCase();

            CapitalizedString = CapitalizedString + FirstChar + RemainingChar + " ";
//            CapitalizedString +=  FirstChar + RemainingChar;  //<-- same as above



        }
        CapitalizedString = CapitalizedString.trim();
        return CapitalizedString;

    }
}
