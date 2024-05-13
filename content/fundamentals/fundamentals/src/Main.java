//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Person p1 = new Person("Paulo", 25, 987654321);

        String pessoa1 = p1.toString();
        System.out.println(p1.getName());
    }
}

class Person{
    public String name;
    public int age;
    private int cpf;

    public Person(String name, int age, int cpf) {
        this.name = name;
        this.age = age;
        this.cpf = cpf;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", cpf=" + cpf +
                '}';
    }
}

