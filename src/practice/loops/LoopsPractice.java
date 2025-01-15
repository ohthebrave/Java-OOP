package practice.loops;

public class LoopsPractice {
    public static void main(String[] args){
//        int count = 0;
        String str = "We have a large inventory of things in our warehouse falling in " +
                "the category:apperal and slightly " +
                "more in demand category:makeup along with the category:furniture and ...";

        printCategories(str);

//        while(count <= 10){
//            System.out.println("Hello: " + count);
//            count += 1;
//        }
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
