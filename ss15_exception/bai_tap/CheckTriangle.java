package ss15_exception.bai_tap;

public class CheckTriangle {
    public void checkEdge(int a, int b, int c) throws TriangleException {
        if (a + b <= c || b + c <= a || a + c <= b) {
            throw new TriangleException("Nhập cạnh sai kích thước");
        }else {
            System.out.println("Đây là tam giác");
        }

    }
}
