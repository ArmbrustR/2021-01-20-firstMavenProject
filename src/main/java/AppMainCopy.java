public class AppMainCopy {

    public static void main(String[] args) {


        String mySuperstring = "WellcomeHomeMyDearfancyFriend";
        int lengthstring = mySuperstring.length();
        boolean longer20 = lengthstring > 20;
        boolean isFancy = containsFancy(mySuperstring);

        System.out.println("String is longer 20? " + longer20);
        System.out.println("Fancy inside the string? " + isFancy);
    }

    public static boolean checkLengh(String mySuperstring){
        return mySuperstring.length() > 20;
    }

    public static boolean containsFancy(String mySuperstring){
        return mySuperstring.contains("fancy");
    }

}

