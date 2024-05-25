package stud;
public class BrokenImmutableStudent {
    private final int id;
    private final String name;
    private final int deptNo;
    public BrokenImmutableStudent(int id, String name, int deptNo) {
        this.id = id;
        this.name = name;
        this.deptNo = deptNo;
    }
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public int getDeptNo() {
        return deptNo;
    }
}