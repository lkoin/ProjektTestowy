public class Person {
    private String name;
    private String surname;
    private int age;
    private String email;


    public void setEmail(String email) {
        this.email = email;
    }
    public String getEmail() {
        return email;
    }

    public Person(String name, String surname, String email,int age) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' + "email=" + email +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                '}';
    }
}
