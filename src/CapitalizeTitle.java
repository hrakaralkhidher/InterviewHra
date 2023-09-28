public class CapitalizeTitle {
    public static void main(String[] args) {
        //jaVa iS eASy  -> Java Is Easy
        System.out.println(UsingSplit("jaVa iS eASy"));

        String nam = "haKaR alKhIdher";
        System.out.println(cap(nam));

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

    public static String cap(String parmeter){
        String capitalize = "";
        String[]myword = parmeter.split(" ");

        for(String word: myword){
            String firstLet=word.substring(0,1).toUpperCase();
            String remain=word.substring(1).toLowerCase();
            capitalize = capitalize + firstLet + remain + " ";
        }

        return capitalize.trim();

    }

























}
