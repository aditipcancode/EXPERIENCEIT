public class countXX {
    public static void main(String[] args) {

        countXX count = new countXX();

        System.out.println(count.countXX("abcxx"));
        System.out.println(count.countXX("xxx"));
        System.out.println(count.countXX("xxxx"));
        System.out.println(count.countXX("xxxxxxxxx"));
    }

  public  int countXX(String str) {
        int count = 0;

        for (int i = 0; i < str.length() - 1; i++) {
            if (str.substring(i, i + 2).equals("xx")) {
                count+= 1;
            }
        }

        return count;
    }

}