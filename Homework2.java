import java.util.Scanner;

class Student {
    private long studentID;
    private String name;
    private String major;
    private long phone;

    public Student() {
    }

    public long getStudentID() {
        return studentID;
    }

    public String getName() {
        return name;
    }

    public String getMajor() {
        return major;
    }

    public long getPhone() {
        return phone;
    }

    public void setStudentID(long studentID) {
        this.studentID = studentID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }
}

public class Homework2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student[] students = new Student[3];

        for (int i = 0; i < students.length; i++) {
            System.out.print("학생의 학번, 이름, 전공, 전화번호를 입력하세요: ");

            long studentID = Long.parseLong(sc.next());
            String name = sc.next();
            String major = sc.next();
            long phone = Long.parseLong(sc.next());

            Student student = new Student();
            student.setStudentID(studentID);
            student.setName(name);
            student.setMajor(major);
            student.setPhone(phone);

            students[i] = student;
        }

        System.out.println("입력된 학생들의 정보는 다음과 같습니다.");

        for (int i = 0; i < students.length; i++) {
            Student s = students[i];

            String nozeroPhone = Long.toString(s.getPhone());
            String fullPhone = (nozeroPhone.length() == 10) ? "0" + nozeroPhone : nozeroPhone;
            String hyphenPhone = fullPhone.substring(0, 3) + "-" +
                    fullPhone.substring(3, 7) + "-" +
                    fullPhone.substring(7);

            System.out.println((i + 1) + "번째 학생: " +
                    s.getStudentID() + " " +
                    s.getName() + " " +
                    s.getMajor() + " " +
                    hyphenPhone);
        }

        sc.close();
    }
}