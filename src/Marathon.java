public class Marathon {
    public static void main(String[] args) {
        int maxtime = 0;
        int index = 0;
        String[] names = {
                "Elena", "Thomas", "Hamilton", "Suzie", "Phil", "Matt", "Alex",
                "Emma", "John", "James", "Jane", "Emily", "Daniel", "Neda",
                "Aaron", "Kate"
        };
        int[] times = {
                341, 273, 278, 329, 445, 402, 388, 275, 243, 334, 412, 393, 299,
                343, 317, 265
        };
        for (int i = 0; i < names.length; i++) {
            if (maxtime < times[i]) {
                maxtime = times[i];
                index = i;
            }
        }
        System.out.println(names[index] + ": " + times[index]);
    }
}