package dangthpc04349_lab01;
/*
        Dangthpc04349_Lab01_Bai1
Nhập vào họ tên và điểm của sinh viên và xuất ra màn hình
*/
import java.util.*;
public class Bai1_Lab01 {
        public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("\tCHUONG TRINH NHAP VAO THONG TIN SINH VIEN");
        double mark = 0;
        String s = "";
        //
        int i;
        boolean check = true;
        do {
            System.out.print("Ten sinh vien: ");
            s = in.nextLine();
            s = s.toLowerCase();
            for (i = 0; i < s.length(); i++) {
                if ((s.charAt(i) > 'z' || s.charAt(i) < 'a')) {
                    if (s.charAt(i) == ' ')
                        check = true;
                    else {
                        check = false;
                        break;
                    }
                }
            }
            if (s.length() == 0 || check == false) {
                System.out.println("\tVui long nhap dung ten sinh vien!\n");
            }
        } while (s.length() == 0 || check == false);
        // kiểm tra xem đó có phải là tên hay không (tên chỉ tồn tại chữ cái và dấu cách)

        // BAT DAU CHUAN HOA!
        
        s = s.trim();   //xóa khoảng trắng thừa ở hai vị trí đầu và cuối chuỗi S

        // xoa 1 khoang trang khi gap 2 khoang trang
        for (i = 1; i < s.length(); i++) {
            if (s.charAt(i) == ' ' && s.charAt(i + 1) == ' ') {
                s = s.substring(0, i + 1) + s.substring(i + 2);
                i--;
            }
        }

        // in hoa ký tự đầu tiên
        String upr = s.substring(0, 1);     
        upr = upr.toUpperCase();
        s = upr + s.substring(1);

        // in hoa ký tự đầu từ
        for (i = 1; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                String t = s.substring(i + 1, i + 2);
                t = t.toUpperCase();
                s = s.substring(0, i + 1) + t + s.substring(i + 2);

            }
        }
        // Nhập điểm TB
        do {
            System.out.print("Diem Trung Binh cua sinh vien: ");
            mark = in.nextDouble();
            if (mark < 0 || mark > 10) {        //kiểm tra điểm có hợp lệ không 
                System.out.println("\t\tERROR\nDiem nay khong ton tai!\nVui long nhap diem trong khoang [0;10]!");
            }
        } while (mark < 0 || mark > 10);
        // xet hoc luc
        String level = "";
        if (mark >= 9)
            level = "Xuat sac";
        else if (mark >= 8)
            level = "Gioi";
        else if (mark >= 6)
            level = "Kha";
        else if (mark >= 5)
            level = "Trung binh";
        else if (mark >= 3)
            level = "Yeu";
        else
            level = "kem";
        System.out.println("\n\t\tTen:             " + s);
        System.out.println("\t\tDiem Trung Binh: " + mark);
        System.out.println("\t\tHoc luc:         " + level);
    }
}
