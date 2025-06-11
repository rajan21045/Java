public class Course {
    private String title;
    private int credit;
    private String courseCode;

    public void setValue(String title, int credit, String courseCode){
        this.title = title;
        this.credit = credit;
        this.courseCode = courseCode;
    }

    public void showValues(){
        System.out.println("Title Is "+ title);
        System.out.println("Credit Is "+ credit);
        System.out.println("Course Code Is "+ courseCode);
        System.out.println(" ");
        System.out.println(".............................");
        System.out.println(" ");
    }

    public String getTitle(){
        return title;
    }


    public static void main(String[] args) {
        Course[] courses = new Course[5];

        for(int i =0; i<5; i++){
            courses[i] = new Course();
        }

        courses[0].setValue("Computer Science", 4,"CS101");
        courses[1].setValue("Calculus", 3,"MTH102");
        courses[2].setValue("English Literature", 2,"ENG201");
        courses[3].setValue("Chemistry", 2,"CHM103");
        courses[4].setValue("Data Structure", 2,"CS202");

        System.out.println("Courses With Title Starting With 'c' : ");
        System.out.println(" ");
        for(Course course : courses){
            if(course.getTitle().startsWith("C")){
                course.showValues();
            }
        }
    }
}
