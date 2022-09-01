public class hello {
    public static void main(String[] args) {
        System.out.println("hesad");
        person p = new person("sada", 12, 1000);
        p.setName("asdas");
        p.setName("asdas");
        p.setName("asdas");
        p.setName("asdas");
        p.setName("asdas");
        p.setName("asdas");
        p.setName("asdas");
        p.setName("asdas");
        p.setName("asdas");
        p.setName("asdas");
        p.setName("asdas");
        p.setName("asdas");
        p.setName("     ");
        System.out.println(p.getSalary());

    }


}

class Methods {
    public Methods() {
    }

    public void m(int a, int b) {

        System.out.println(a * b);
    }

    public void m(int a) {
        System.out.println(a * a);
    }

    public void m(String str) {
        System.out.println(str);

    }
}

class person {


    public String name;
    private int age;
    private double salary;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

    public person(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }
}

class boss {
    public int salaty;
    private int age;
    protected int aa;

    public void test01() {
        System.out.println(salaty);

    }

    private void test02() {
        System.out.println(age);
    }

    protected void test03() {
        System.out.println(aa);
    }
}

class man extends boss {

    {
        System.out.println();
        test01();
    }

}
