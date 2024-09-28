package StaticMembers;

class Configuration {
    static String configValue;

    static {
        Configuration.configValue = "Hello World";
        System.out.println("Static block initialized");
    }
}

public class StaticBlockInit {
    public static void main(String[] args) {
        Configuration config = new Configuration();
        System.out.println(Configuration.configValue);
    }
}
