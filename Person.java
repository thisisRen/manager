
package qldv;

import java.util.Scanner;

public class Person {
    private String name;
    private int age;
    private String gender;
    private String add;
    private String phoneNum;
    private String homeTown;
    private String code;
    private int coSalary;
    private int dayofWork;
    protected String setial;
    
    public Person(String name, int age, String gender, String add, String phoneNum, String homeTown,
            String code, int coSalary, int dayofWork, String setial){
        
        this.name= name;
        this.age= age;
        this.gender=gender;
        this.add= add;
        this.phoneNum= phoneNum;
        this.homeTown = homeTown;
        this.code=code;
        this.coSalary=coSalary;
        this.dayofWork = dayofWork;
        this.setial = setial;
        
    }
    Person(){}
    public String getSetial() {
        return setial;
    }

    public void setSetial(String setial) {
        this.setial = setial;
    }
    
    
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
    
    public String getGender() {
        return gender;
    }
 
    public void setGender(String gender) {
        this.gender = gender;
    }
    
    public String getAdd() {
        return add;
    }
 
    public void setAdd(String Add) {
        this.add = add;
    }
    
    public String getPhoneNum() {
        return phoneNum;
    }
 
    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }
    
    public String getHomeTown() {
        return homeTown;
    }
 
    public void setHomeTown(String homeTown) {
        this.homeTown = homeTown;
    }
    
    public String getCode() {
        return code;
    }
 
    public void setCode(String code) {
        this.code = code;
    }
    
    public int getCoSalary() {
        return coSalary;
    }
 
    public void setCoSalary(int coSalary) {
        this.coSalary = coSalary;
    }
    
    public int getDayofWork() {
        return dayofWork;
    }
 
    public void setDayofWork(int dayofWork) {
        this.dayofWork = dayofWork;
    }
    
    public void Information(){
        Scanner sc = new Scanner(System.in);
        System.out.print("H??? v?? t??n: ");
        name = sc.nextLine();
        System.out.print("Tu???i: ");
        age = Integer.parseInt(sc.nextLine());
        System.out.print("Gi???i t??nh: ");
        gender = sc.nextLine();
        System.out.print("?????a ch???: ");
        add = sc.nextLine();
        System.out.print("S??T: ");
        phoneNum = sc.nextLine();
        System.out.print("Qu?? qu??n: ");
        homeTown = sc.nextLine();
        System.out.print("H??? s??? l????ng: ");
        coSalary = Integer.parseInt(sc.nextLine());
        System.out.print("Ng??y l??m vi???c ");
        dayofWork = Integer.parseInt(sc.nextLine());
        
    }
    public void Salary(){
        double Salary = this.getDayofWork() * this.getCoSalary();
        System.out.println("=> L????ng: "+ Salary);
        System.out.println("\n");
    }
    
    public void showInformation(){
        System.out.println("\n");
        System.out.println("**********************************\n");
        System.out.println("M?? c??n b???: "+this.setial);
        System.out.println("H??? v?? t??n: "+ this.name);
        System.out.println("Tu???i: "+ this.age);
        System.out.println("Gi???i t??nh: "+ this.gender);
        System.out.println("?????a ch???: "+ this.add);
        System.out.println("S??T: "+ this.phoneNum);
        System.out.println("Qu?? qu??n: "+ this.homeTown);
        System.out.println("H??? s??? l????ng: "+ this.coSalary);
        System.out.println("Ng??y l??m vi???c "+ this.dayofWork);
     
    }
    public void Run(){
        Information();
        showInformation();
        Salary();
    }
   
}   

