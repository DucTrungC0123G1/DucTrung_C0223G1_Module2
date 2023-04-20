package mvc_2.repository;

import mvc_2.model.Staff;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
//Staff(String id, String name, boolean gender, String dayOfBirth)
public class StaffRepository implements IStaffRepository {
    Scanner sc = new Scanner(System.in);
    static List<Staff> list = new ArrayList<>();
    static {
        list.add(new Staff("01","Trung",true,"1993"));
        list.add(new Staff("02","Nhi",false,"1995"));
        list.add(new Staff("03","Tung",true,"1998"));
    }
    @Override
    public List<Staff> getStaffList() {
        return list;
    }

    @Override
    public void addStaff(Staff staff) {list.add(staff);

    }
}
