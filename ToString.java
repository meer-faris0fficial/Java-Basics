public class ToString {
    String name;
    int age;
    String rollNo;
    String house;
    public ToString(String name, int age, String rollNo, String house) {
        this.name = name;
        this.age = age;
        this.rollNo = rollNo;
        this.house = house;
    }

    @Override
    public String toString() {
        // Note: when breaking a return string across lines, add '+' at the end
        return "Student Details:{name: "+ name  
                            + ", age: "  + age  
                            + ", roll number: "+ rollNo 
                            + " , house: " + house +" }";
    }

    public static void main(String[] args) {
        ToString student = new ToString("Tahir", 20, "234","mughal");
        System.out.println(student);
    }
    
}
