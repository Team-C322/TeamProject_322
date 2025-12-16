
package allclasses.Statsyuk;

public class Person {
    private String name;
    private int age;
    private String city;

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getName() {

        return name;
    }

    public int getAge() {
        return age;
    }

    public Person(String name, int age, String city) {
        this.name = name;
        this.age = age;
        this.city = city;
    }

    public void celebrateBirthday() {
        this.age++;
        System.out.println(name + " отметил день рождения и теперь ему " + age + " лет!");
    }

    public String getInfo() {
        return "Имя: " + name + ", Возраст: " + age + ", Город: " + city;
    }
}