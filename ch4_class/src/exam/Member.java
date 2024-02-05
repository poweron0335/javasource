package exam;

public class Member {
    private String id;
    private String pwd;
    private String name;
    private int age;
    private String job;
    private String grade = "silver";
    private int point;
    
    public Member(String id, String pwd, String name)
    {
        this.id = id;
        this.pwd = pwd;
        this.name = name;
    }
    public Member(String id, String pwd, String name, int age, String job)
    {
        this.id = id;
        this.pwd = pwd;
        this.name = name;
        this.age = age;
        this.job = job;
    }


}
