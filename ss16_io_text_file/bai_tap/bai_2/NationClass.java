package ss16_io_text_file.bai_tap.bai_2;

public class NationClass {
    private int id;
    private String sign;
    private String name;

    public NationClass() {
    }

    public NationClass(int id, String sign, String name) {
        this.id = id;
        this.sign = sign;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "NationClass{" +
                "id=" + id +
                ", sign='" + sign + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    public String getCsv() {
        return id + "," + sign + "," + name;
    }

}
