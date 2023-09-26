package entity;

public class Princess {
    private int number;
    private String name;
    private int age;
    private String haircolor;
    private String eyecolor;

    public Princess(int number, String name, int age, String haircolor, String eyecolor) {
        this.number = number;
        this.name = name;
        this.age = age;
        this.haircolor = haircolor;
        this.eyecolor = eyecolor;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
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

    public String getHaircolor() {
        return haircolor;
    }

    public void setHaircolor(String haircolor) {
        this.haircolor = haircolor;
    }

    public String getEyecolor() {
        return eyecolor;
    }

    public void setEyecolor(String eyecolor) {
        this.eyecolor = eyecolor;
    }
//    public Princess(int number, String name, int age, String haircolor, String eyecolor) {
//        this.number = number;
//        this.name = name;
//        this.age = age;
//        this.haircolor = haircolor;
//        this.eyecolor = eyecolor;
//    }

}
