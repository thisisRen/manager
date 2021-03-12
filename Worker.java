
package qldv;
import java.util.Scanner;
public class Worker extends Person {
    private int level;
    public static int sttCN=0;
    
    Worker(String name, int age, String gender, String add, String phoneNum, String homeTown, String code, int coSalary, int dayofWork, int level, String setial){
        
        super(name, age, gender, add, phoneNum,homeTown, code, coSalary, dayofWork, setial);
        this.level=level;
     //   this.setial=setial;
        
        sttCN++;
        setial= String.format("CN%03d",sttCN);
        
    }
    Worker(){
        sttCN++;
        setial= String.format("CN%03d",sttCN);
    }
    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }
   
    @Override
    public void Information(){
        System.out.println("Nhập thông tin công nhân: ");
        Scanner sc = new Scanner(System.in);
        super.Information();
        System.out.print("Bậc: ");
        level = Integer.parseInt(sc.nextLine());
    }
    
    public void showInformation(){
        super.showInformation();
        System.out.println("Bậc: "+ this.level);
    }
    public void Salary(){
        double Salary = this.level * this.getDayofWork() * this.getCoSalary();
        System.out.println("=> Lương: "+ Salary);
        System.out.println("\n\n");
    }
    public void Run(){
        Information();
        showInformation();
        Salary();
        
    }
}
