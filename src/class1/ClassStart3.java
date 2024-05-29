package class1;

public class ClassStart3 {

    public static void main(String[] args) {

        /* Student student1 = new Student(); // Student 객체 생성
        Student Student1 = x001; // new Student()의 결과로 x001 참조값 반환
        student1 = x001; // 결과 */

        Student student1;
        student1 = new Student();
        student1.name = "학생1"; // student1 객체의 name 멤버 변수에 값 대입
        // x001.name = " 학생1"; // 변수에 있는 참조값을 통해 실제 객체에 접근, 해당 객체의 name 멤버 변수에 값 대입
        student1.age = 15;
        student1.grade = 90;

        Student student2 = new Student();
        student2.name = "학생2";
        student2.age = 16;
        student2.grade = 80;

        System.out.println(student1); // @앞은 패키지 + 클래스정보, @뒤는 16진수는 참조값
        System.out.println(student2);

        System.out.println("이름:" + student1.name + " 나이:" + student1.age + " 성적:" + student1.grade);
        System.out.println("이름:" + student2.name + " 나이:" + student2.age + " 성적:" + student2.grade);
    }
}
