package web.car;

public class Car {
    private String Model;
    private String Color;
    private int Hp;

    public Car() {
    }

    public Car(String model, String color, int hp) {
        Model = model;
        Color = color;
        Hp = hp;
    }

    public String getModel() {
        return Model;
    }

    public void setModel(String model) {
        Model = model;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        Color = color;
    }

    public int getHp() {
        return Hp;
    }

    public void setHp(int hp) {
        Hp = hp;
    }

    @Override
    public String toString() {
        return "Car{" +
                "Model='" + Model + '\'' +
                ", Color='" + Color + '\'' +
                ", Hp='" + Hp + '\'' +
                '}';
    }
}
