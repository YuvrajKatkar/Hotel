public class User implements Comparable {
    String name1;
    String name2;
    int token;
    public User(String name1) {
        this.name1 = name1;
    }
    public User(String name1, String name2) {
        this.name1 = name1;
        this.name2 = name2;
    }

    @Override
    public int compareTo(Object o) {
        if (token>1)return 1;
        return 0;
    }
}
