package mvc_2.repository;

import mvc_2.model.Staff;

import java.util.List;

public interface IStaffRepository {
    List<Staff> getStaffList();
    void addStaff(Staff staff);
}
