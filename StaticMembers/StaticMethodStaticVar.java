package StaticMembers;

class IdGenerator {
    private static int nextID = 0;

    public static int generateId() {
        IdGenerator.nextID++;
        return IdGenerator.nextID;
    }
}

public class StaticMethodStaticVar {
    public static void main(String[] args) {
        System.out.println(IdGenerator.generateId());
        System.out.println(IdGenerator.generateId());
        System.out.println(IdGenerator.generateId());
        System.out.println(IdGenerator.generateId());
    }
}
