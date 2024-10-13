public class Student {
        // Instance variables
        private String name;
        private int age;
        private String studentId;
        private String major;

        // Constructor
        public Student(String name, int age, String studentId, String major) {
            this.name = name;
            this.age = age;
            this.studentId = studentId;
            this.major = major;
        }

        // Getter and Setter methods
        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getStudentId() {
            return studentId;
        }

        public void setStudentId(String studentId) {
            this.studentId = studentId;
        }

        public String getMajor() {
            return major;
        }

        public void setMajor(String major) {
            this.major = major;
        }

        // Method to display student details
        public void displayInfo() {
            System.out.println("Student Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Student ID: " + studentId);
            System.out.println("Major: " + major);
        }

        // Main method for testing
        public static void main(String[] args) {
            // Create a new Student object
            Student student = new Student("Alice", 20, "S12345", "Computer Science");

            // Display the student information
            student.displayInfo();

            // Update the student's major
            student.setMajor("Mathematics");
            System.out.println("\nUpdated Major: " + student.getMajor());
        }
    }



