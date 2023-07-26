public class RandomExamples {
    public static void main(String[] args) {
        //write all the method you can to reverse a String
        String name = "Hrakar";
        System.out.println("ForEach(name) = " + ForEach(name));
        String nam1 = "Gaandi";
        System.out.println("ForLoop(nam1) = " + ForLoop(nam1));
    }
    public static String ForLoop(String param1){
        char[]MycharArray = param1.toCharArray();
        String revs = "";
        for(int i = 0; i < MycharArray.length;i++){
            revs = MycharArray[i] + revs;
        }
        return revs;
    }
    public static String ForEach(String param1){
        char [] myCharArray = param1.toCharArray();
        String rev = "";
        for (char MyChar: myCharArray ){
            rev = MyChar + rev;
        }
        return rev;
    }
}