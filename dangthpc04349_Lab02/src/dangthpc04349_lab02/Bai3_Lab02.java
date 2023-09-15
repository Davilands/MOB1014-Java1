/*
Chương trình tính tiền điện 
*/
package dangthpc04349_lab02;

/**
 * @author dangthpc04349
 */
import java.util.*;
public class Bai3_Lab02 {
    public static void main(String[] args) {
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