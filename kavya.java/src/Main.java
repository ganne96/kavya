class Student {
    public static String name;

    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        Student.name = name;
    }

    public static void main(String args[]) {
        Student.setName("Kavya");
        Student s1 = new Student();
        Student s2 = new Student();
        s2.setName("Ganne");
        System.out.println(s1.getName());
        System.out.println(s2.getName());
    }
}

