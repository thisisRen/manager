package qldv;
import java.util.Scanner;

public class Security extends Person {
    private String area;
    public static int sttBV=0;
    Security(String name, int age, String gender, String add, String phoneNum, String homeTown, String code, int coSalary, int dayofWork,String area, String setial){
        super(name, age, gender, add, phoneNum,homeTown, code, coSalary, dayofWork, setial);
        this.area = area;
      //  this.setial  = setial;
        sttBV++;
        setial= String.format("BV%03d",sttBV);
    }

    Security(){
        sttBV++;
        setial= String.format("BV%03d",sttBV);
    }
    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }
    
    @Override
    public void Information(){
        System.out.println("Nhập thông tin bảo vệ: ");
        Scanner sc = new Scanner(System.in);
        super.Information();
        System.out.print("Khu vực bảo vệ: ");
        area = sc.nextLine();
    }
    public void showInformation(){
        super.showInformation();
        System.out.println("Khu vực bảo vệ: "+ this.area);
     
    }
    public void Run(){
        Information();
        showInformation();
        Salary();
        
    }
}
