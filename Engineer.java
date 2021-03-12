package qldv;
import java.util.Scanner;
public class Engineer extends Person{
    private String major;
    private int numExp;
    public static int sttKS=0;
    
    Engineer(String name, int age, String gender, String add, String phoneNum, String homeTown, String code, int coSalary, int dayofWork, String major,int numExp, String setial){
        super(name, age, gender, add, phoneNum,homeTown, code, coSalary, dayofWork, setial);
        this.major= major;
        //this.setial  = setial;
        this.numExp = numExp;
    }

    Engineer(){
        sttKS++;
        setial= String.format("KS%03d",sttKS);
    }
       public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public int getNumExp() {
        return numExp;
    }

    public void setNumExp(int numExp) {
        this.numExp = numExp;
    }
    
    @Override
    public void Information(){
        System.out.println("Nhập thông tin kỹ sư: ");
        Scanner sc = new Scanner(System.in);
        super.Information();
        System.out.print("Ngành học: ");
        major = sc.nextLine();
        System.out.print("Số năm kinh nghiệm: ");
        numExp = Integer.parseInt(sc.nextLine());
    }
    
    public void showInformation(){
        super.showInformation();
        System.out.println("Ngành học: "+ this.major);
        System.out.println("Số năm kinh nghiệm: "+ this.numExp);
    }
    public void Salary(){
        double Salary = this.numExp * this.getDayofWork() * this.getCoSalary();
        System.out.println("=> Lương: "+ Salary);
        System.out.println("\n\n");
    }
    public void Run(){
        Information();
        showInformation();
        Salary();
        
    }
}
