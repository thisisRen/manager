
package qldv;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class QLDV {
    public static void main(String[] args) {
            int n=12;
            String ThongTin[];
            
            List<Person> CanBo = new ArrayList<Person>();
            while(n != 0){
                
                Scanner sc = new Scanner(System.in);
                System.out.println("*********** MENU ***********");
                System.out.println("1.THÊM MỚI CÁN BỘ");
                System.out.println("2.TÌM KIẾM THEO TÊN");
                System.out.println("3.TÍNH LƯƠNG");
                System.out.println("4.THÔNG TIN CÁN BỘ");
                System.out.println("0.THOÁT");

                System.out.print("Chọn chức năng : ");
                n = sc.nextInt();
                        
                if(n==0){
                    System.out.println("Kết thúc chương trình");
                    break;
                }
                        if(n==1){
                            int m;
                            System.out.println("Chọn đối tượng");
                            System.out.println("1.Công nhân");
                            System.out.println("2.Bảo vệ");
                            System.out.println("3.Kĩ sư");
                            m = sc.nextInt();

                            if(m==1){
                                Worker worker = new Worker() ;
                                CanBo.add(worker);
                                
                                worker.Run();
                            }
                            else if(m==2){
                                Security security = new Security() ;
                                CanBo.add(security);
                                
                                security.Run();
                            }
                            else if(m==3){
                                Engineer engineer = new Engineer() ;
                                CanBo.add(engineer);
                               
                                engineer.Run();
                            }
                        }
                
                if(n==2){
                    if(CanBo.isEmpty()) System.out.println("HÃY NHẬP THÔNG TIN CÁN BỘ");
                    else{
                        String s;
                        System.out.print("Tìm kiếm: ");
                        sc.nextLine();
                        s = sc.nextLine();
                        List <Person> result2 = CanBo.stream()
                            .filter(x -> s.equals(x.getName()))
                            .collect(Collectors.toList());
                        for(int i=0; i< result2.size(); i++){
                            result2.get(i).showInformation();
                        }
                        System.out.print("\n\n");
                    }

                    
                }        
                        
                        
                if(n==3){
                    int bac, namkn, cong, hsluong;
                    double luong;
                    System.out.println("\nTHÊM THÔNG TIN");
                    System.out.print("Bậc (nếu có): ");
                    bac = sc.nextInt(); 
                    if(bac==0) bac=1;
                    System.out.print("Số năm kinh nghiệm (nếu có): ");
                    namkn = sc.nextInt();
                    if(namkn==0) namkn=1;
                    System.out.print("Số ngày công: ");
                    cong = sc.nextInt();
                    System.out.print("Hệ số lương: ");
                    hsluong = sc.nextInt();
                    System.out.println("=> Lương: " + (bac*namkn*cong*hsluong) +"\n\n");
                }
                
                if(n==4){
                    int m;
                    System.out.println("Chọn đối tượng");
                    System.out.println("1.Công nhân");
                    System.out.println("2.Bảo vệ");
                    System.out.println("3.Kĩ sư");
                    m = sc.nextInt();
                    if(m==1){
                        if(CanBo.isEmpty()) System.out.println("KHÔNG CÓ DỮ LIỆU\n\n");
                        else{
                            for(Person worker : CanBo){
                                if(worker.getSetial().startsWith("CN")) {
                                    worker.showInformation();
                                } 
                            }
                        }
                    }
                    if(m==2){
                        if(CanBo.isEmpty()) System.out.println("KHÔNG CÓ DỮ LIỆU\n\n");
                        else{
                            for(Person security : CanBo){
                                if(!security.getSetial().startsWith("BV")) {
                                    security.showInformation();
                                }
                            }
                        }
                    }
                    if(m==3){
                        if(CanBo.isEmpty()) System.out.println("KHÔNG CÓ DỮ LIỆU\n\n");
                        else{
                            for(Person engineer : CanBo){
                                if(engineer.getSetial().startsWith("KS"))
                                engineer.showInformation();
                            }
                        }
                    }
                } 
            }
    }   
  
    
}
