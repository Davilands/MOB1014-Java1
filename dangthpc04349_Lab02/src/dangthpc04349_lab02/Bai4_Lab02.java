/*
MENU 3 chương trình
*/
package dangthpc04349_lab02;
import java.util.*;
/**
 *
 * @author dangthpc04349
 */
public class Bai4_Lab02 {
        public static void main(String[] args) {
        int chose;
        Scanner in = new Scanner(System.in);

        int next = 0;
        do {
            System.out.println("\t\t\t\tMENU CHUONG TRINH");
            System.out.println("\t\t+-------------------------------------------+");
            System.out.println("\t\t|    Nhap 1: Giai phuong trinh bac nhat     |");
            System.out.println("\t\t|    Nhap 2: Giai phuong trinh bac hai      |");
            System.out.println("\t\t|    Nhap 3: Chuong trinh tinh tien dien    |");
            System.out.println("\t\t|    Nhap 0: Thoat khoi MENU chuong trinh   |");
            System.out.println("\t\t+-------------------------------------------+");
            System.out.print("Lua chon cua ban la: ");
            chose = in.nextInt();
            do {
                switch (chose) {
                    case 1:
                        bai1();
                        do {
                            System.out.println(
                                    "\n\nBan co muon tiep tuc dung tinh nang nay khong? (1.Tiep tuc dung & 0.Quay lai MENU)");
                            // System.out.println("\t");
                            System.out.print("\tLua chon cua ban la: ");
                            next = in.nextInt();
                            if (next == 1) {
                                bai1();
                            } else if (next == 0) {
                                System.out.print("\033[H\033[2J");
                                System.out.flush(); // xóa màn hình console nguồn tham khảo ở dưới
                                // clrscr in JAVA (https://www.javatpoint.com/how-to-clear-screen-in-java)
                                break;
                            } else {
                                System.out.println("Vui long nhap dung! ");
                                System.out.println(
                                        "\nBan co muon tiep tuc dung tinh nang nay khong? (1.Tiep tuc dung & 0.Quay lai MENU)");
                                next = in.nextInt();
                            }
                        } while (next != 0);
                        break;
                    case 2:
                        bai2();
                        do {
                            System.out.println(
                                    "\n\nBan co muon tiep tuc dung tinh nang nay khong? (1.Tiep tuc dung & 0.Quay lai MENU)");

                            System.out.print("\tLua chon cua ban la: ");
                            next = in.nextInt();
                            if (next == 1) {
                                bai2();
                            } else if (next == 0) {
                                System.out.print("\033[H\033[2J");
                                System.out.flush();
                                // clrscr in JAVA (https://www.javatpoint.com/how-to-clear-screen-in-java)
                                break;
                            } else {
                                System.out.println("Vui long nhap dung! ");

                                System.out.println(
                                        "\nBan co muon tiep tuc dung tinh nang nay khong? (1.Tiep tuc dung & 0.Quay lai MENU)");
                                next = in.nextInt();
                            }
                        } while (next != 0);
                        break;
                    case 3:
                        bai3();
                        do {
                            System.out.println(
                                    "\n\nBan co muon tiep tuc dung tinh nang nay khong? (1.Tiep tuc dung & 0.Quay lai MENU)");

                            System.out.print("\tLua chon cua ban la: ");
                            next = in.nextInt();
                            if (next == 1) {
                                bai3();
                            } else if (next == 0) {
                                System.out.print("\033[H\033[2J"); // ma thoat ANSI("\033"=27)=ESC
                                System.out.flush();
                                // clrscr in JAVA (https://www.javatpoint.com/how-to-clear-screen-in-java)

                                break;
                            } else {
                                System.out.println("Vui long nhap dung! ");

                                System.out.println(
                                        "\nBan co muon tiep tuc dung tinh nang nay khong? (1.Tiep tuc dung & 0.Quay lai MENU)");
                                next = in.nextInt();
                            }
                        } while (next != 0);

                        break;
                    case 0:
                        System.out.println("\t\tBan chon thoat!\n\t\tXin cam on!");
                        break;
                    default:
                        System.out.println("Vui long nhap dung!");
                        break;
                }
            } while (chose < 0 || chose > 3);

        } while (next == 0 && chose != 0);

    }
    public static void bai1() {
        Scanner in = new Scanner(System.in);
        System.out.println("CHUONG TRINH GIAI PHUONG TRINH BAC NHAT!");
        System.out.println("\t\tAx + B = 0");
        try {
        System.out.print("Nhap vao he so a: ");
        float a = in.nextFloat();
        System.out.print("Nhap vao he so b: ");
        float b = in.nextFloat();
        
        if (a == 0) {
            if (b == 0)
                System.out.println("Phuong trinh co vo so nghiem!");
            else
                System.out.println("Phuong trinh vo nghiem!");
        } else {
            float x = -b / a;
            System.out.printf("Phuong trinh co nghiem: \n\tx = %.2f \n", x);
        }
        }catch (Exception e) {
            System.out.println("Vui long nhap so!");
        }
    }
    public static void bai2() {
        Scanner in = new Scanner(System.in);
        System.out.println("CHUONG TRINH GIAI PHUONG TRINH BAC HAI!");
        System.out.println("\t\tAx^2 + Bx + C = 0\n");
        try {
        System.out.print("\tNhap vao he so a: ");
        Double a = in.nextDouble();
        System.out.print("\tNhap vao he so b: ");
        Double b = in.nextDouble();
        System.out.print("\tNhap vao he so c: ");
        Double c = in.nextDouble();
        solve_the_equation_2(a, b, c);
        }catch (Exception e) {
            System.out.println("Vui long nhap so!");
        }
    }
    
    public static void solve_the_equation_1(Double a, Double b) {   
    //phương thức giải phương trình bậc nhất
        if (a == 0) {
            if (b == 0)
                System.out.println("Phuong trinh co vo so nghiem!");
            else
                System.out.println("Phuong trinh vo nghiem!");
        } else {
            Double x = -b / a;
            System.out.printf("Phuong trinh co nghiem: \n\tx = %.2f", x);
        }
    }

    public static void solve_the_equation_2(Double a, Double b, Double c) {
    //phương thức giải phương trình bậc hai
        if (a != 0) {
            Double delta = Math.pow(b, 2) - 4 * a * c;      //tính delta
            //tiến hành biện luận DELTA
            if (delta < 0)
                System.out.println("Phuong trinh vo nghiem!");
            else if (delta == 0) {
                double x = -b / (2 * a);
                System.out.println("Phuong trinh co nghiem kep: \n\t\tx1 va x2 = " + x);
            } else {
                double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                double x2 = (-b - Math.sqrt(delta)) / (2 * a);
                System.out.println("Phuong trinh co hai nghiem phan biet: ");
                System.out.printf("\t\tx1 = %.2f\n\t\tx2 = %.2f", x1, x2);
            }
        } else
            solve_the_equation_1(b, c); //gọi lại phuoeng thức giải ptbn nếu a=0
    }
    public static void bai3() {
        Scanner in = new Scanner(System.in);
        boolean check=true;
        System.out.println("CHUONG TRINH TINH TIEN DIEN");
        double kw, money = 0;
        do {
            check = true;
           System.out.print("\tNhap vao so dien su dung (Kw/thang): ");
        try {    
            kw = in.nextDouble();
            if (kw < 50)
                money = kw * 1000;
            else
                money = (50 * 1000) + (kw - 50) * 1200;
            if (kw <= 0) {
                   System.out.println("\t\tERROR\nVui long nhap lai so Kw > 0!");
                   check=false;
            }
        }catch (Exception e) {
            System.out.println("\t\tERROR\nVui long nhap so!");
            return;
        }
        }while (check==false);
        System.out.printf("So tien can tra la: %.0f VND \n" , money );
    //BONUS
    String s = Integer.toString((int)money);
    // lam tron so tien
    String tien_thua = "";
    if (s.length() < 5) {
            tien_thua = tien_thua + s.substring(s.length() - 3, s.length());
            s = s.substring(0, 1);
        } else {
            tien_thua = tien_thua + s.substring(s.length() - 3, s.length());
            s = s.substring(0, (s.length() - 3));
        }
        if (tien_thua.charAt(0) != '0' || tien_thua.charAt(1) != '0' || tien_thua.charAt(2) != '0') {
            // s = s.substring(0, s.length() - 1);
            if (s.length() == 1) {
                // char k = tien_thua.charAt(0);
                s = String.valueOf(s.charAt(0) - 48 + 1);
            } else {
                s = s.substring(0, (s.length() - 1)) + String.valueOf(s.charAt(s.length() - 1) - 48 + 1);
            }
        }    
        System.out.print("Thanh tien: ");
        read_money(s);
        System.out.println("");
    }
        
        
        //
        private static int i;
            public static void doc_so(char num) {
        // char num;
        switch (num) {
            case '1':
                System.out.print("Mot ");
                break;
            case '2':
                System.out.print("Hai ");
                break;
            case '3':
                System.out.print("Ba ");
                break;
            case '4':
                System.out.print("Bon ");
                break;
            case '5':
                System.out.print("Nam ");
                break;
            case '6':
                System.out.print("Sau ");
                break;
            case '7':
                System.out.print("Bay ");
                break;
            case '8':
                System.out.print("Tam ");
                break;
            case '9':
                System.out.print("Chin ");
                break;
            case '0':
                System.out.print("Khong ");
                break;
        }
    }

    public static void doc_hang_chuc(String s) {
        if (s.charAt(0) == '1') {
            System.out.print("Muoi ");
            if (s.charAt(1) != '0') {
                doc_so(s.charAt(1));
                // doc_so(s.charAt(1));
            }
        } else {
            if (s.charAt(0) == '0') {
                System.out.print("Linh ");
                doc_so(s.charAt(1));
            } else {
                doc_so(s.charAt(0));
                System.out.print("Muoi ");
                if (s.charAt(1) == '5')
                    System.out.print("Lam ");
                else
                    doc_so(s.charAt(1));
            }
        }
    }

    public static void read_money(String s) {
        String number_temp;
        if (s.length() == 1) {
            doc_so(s.charAt(0));
            System.out.print("nghin dong!");
        } else if (s.length() == 2) {
            doc_hang_chuc(s);
            System.out.print("nghin dong!");
        } else if (s.length() == 3) {
            doc_so(s.charAt(0));
            System.out.print("Tram ");
            if (s.charAt(1) == '0') {
                System.out.print("Linh ");
                doc_so(s.charAt(s.length() - 1));
            } else {
                number_temp = s.substring(1);
                doc_hang_chuc(number_temp);
            }
            System.out.print("nghin dong!");
            // doc_hang_tram(s);
        } else if (s.length() == 4) {
            doc_so(s.charAt(0));
            System.out.print("Trieu ");
            doc_so(s.charAt(1));
            System.out.print("Tram ");
            number_temp = s.substring(2);
            doc_hang_chuc(number_temp);
            System.out.print("nghin dong!");
        } else if (s.length() == 5) {
            doc_hang_chuc(s);
            s = s.substring(2);
            // doc_so(s.charAt(0));
            System.out.print("Trieu ");
            doc_so(s.charAt(0));
            System.out.print("Tram ");
            number_temp = s.substring(1);
            doc_hang_chuc(number_temp);
            System.out.print("nghin dong!");
        } else if (s.length() == 6) {
            doc_so(s.charAt(0));
            System.out.print("Tram ");
            if (s.charAt(1) == '0') {
                System.out.print("Linh ");
                doc_so(s.charAt(2));
            } else {
                number_temp = s.substring(1);
                doc_hang_chuc(number_temp);
            }
            System.out.print("Trieu ");

            number_temp = s.substring(1);
            s = number_temp.substring(2);
            doc_so(s.charAt(0));
            System.out.print("Tram ");
            if (s.charAt(1) == '0') {
                System.out.print("Linh ");
                doc_so(s.charAt(s.length() - 1));
            } else {
                number_temp = s.substring(1);
                doc_hang_chuc(number_temp);
            }
            System.out.print("nghin dong!");
        } else if (s.length() == 7) {
            if (s.charAt(1) > '0' || s.charAt(2) > '0')
                System.out.print("Tren ");
            doc_so(s.charAt(0));

            System.out.print("Ty ");
            System.out.print("VND!");
        } else {
            System.out.print("So tien lon hon 99 Ty VND nen khong doc duoc!");
        }
        // System.out.print("VND!");
    }
}
