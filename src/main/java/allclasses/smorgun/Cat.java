package allclasses.smorgun;

public class Cat {
    private String name;
    private int age;
    private String gender;
    private String breed;
    
    public Cat(String name, int age, String gender, String breed) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.breed = breed;
    }
    
    public void displayInfo() {
        System.out.println("Кот: " + name + ", Возраст: " + age + 
                         ", Пол: " + gender + ", Порода: " + breed);
    }
    
    public void meow() {
        System.out.println(name + " говорит: Мяу");
    }
    
    public String getName() {
        return name;
    }
    
    public int getAge() {
        return age;
    }
    
    public String getGender() {
        return gender;
    }
    
    public String getBreed() {
        return breed;
    }
}