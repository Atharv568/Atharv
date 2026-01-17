public class findOccurence {

    static int first = -1;
    static int last = -1;

    public static void findFirstLastOcc(String name, char Find, int i, int m) {
        if (i > m) {
            return;
        }

        if (name.charAt(i) == Find && first == -1) {
            first = i;
        }

        if (name.charAt(m) == Find && last == -1) {
            last = m;
        }

        findFirstLastOcc(name, Find, i + 1, m - 1);
    }

    public static void main(String args[]) {
        String name = "abaacdaefaah";
        char Find = 'a';

        findFirstLastOcc(name, Find, 0, name.length() - 1);

        System.out.println("First occurrence is : " + first);
        System.out.println("Last occurrence is : " + last);
    } 
}
