package Inheritance.encapsulation;

public class employee extends encapsulation {
    private String name;
    private String post;
    private double salary;
    public void setName(String name){
        this.name=name;
    }
    public void setPost(String post){
        this.post=post;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getPost() {
        return post;
    }

    public double getSalary() {
        return salary;
    }

    public static void main(String[] args) {
        employee s1=new employee();
        s1.setName("chetan");
        s1.setPost("software engineer");
        s1.setSalary(100000);
        System.out.println(s1.getName());
        System.out.println(s1.getPost());
        System.out.println(s1.getSalary());
        s1.setname("rohit");
        s1.setAge(23);
        System.out.println(s1.getname());
        System.out.println(s1.getAge());
    }
}

