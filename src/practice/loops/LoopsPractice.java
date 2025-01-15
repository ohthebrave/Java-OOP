package practice.loops;

public class LoopsPractice {
    public static void main(String[] args){
        int count = 10;
        String str = "We have a large inventory of things in our warehouse falling in " +
                "the category:apperal and slightly " +
                "more in demand category:makeup along with the category:furniture and ...";

        printCategories(str);

        while(0 < count){
            System.out.println("Hello: " + count);
            count -= 1;
        }

        String name = "aibuhwqiub";

        for (int i = name.length()-1; i >= 0; i--){
            System.out.println("Char: "+ name.charAt(i));
        }

        for (int i = 0; i <= 20; i+=5){
            System.out.println(i);
        }
    }

    public static void printCategories(String str){
        int i = 0;
        while (!str.isEmpty()){
            int found = str.indexOf("category:",i);
            // we did not find more category in the string
            if (found == -1) break;
            //  start of the actual categories
            int start = found + 9;
            int end = str.indexOf(" ", start);
            System.out.println(str.substring(start,end));
            // to move on to the occurrence of category
            i = end + 1;
        }
    }
}
