package ss4_oop.thuc_hanh;

public class Rectangle {
    int width;
    int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int getArea() {
        return this.height * this.width;
    }

    public int getPerimeter() {
        return (this.height + this.width) * 2;
    }
    public String display(){
        return "HCN{"+"cd="+width+" cr ="+height+"}";
    }

}
