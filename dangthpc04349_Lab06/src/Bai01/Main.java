package Bai01;

import java.util.Scanner;

/*
Nhập họ và tên từ bàn phím. Xuất tên, họ và tên đệm ra màn hình trong đó tên và
họ xuất IN HOA.
HƯỚNG DẪN:
 Sử dụng các phương thức xử lý chuỗi: substring(), indexOf(), lastIndexOf()
và toUpperCase() để thực hiện bài này
o Họ được lấy từ đầu đến ký tự trắng đầu tiên
o Tên được lấy từ sau ký tự trắng cuối cùng đến cuối chuỗi
o Tên đệm được lấy sau ký tự trắng đầu tiên và trước ký tự trắng cuối
cùng

 */
/**
 *
 * @author dangthpc04349
 */
public class Main {
    public static void main(String[] args) {
        Name name = new Name();
        //xử lí
        name.input();
        name.xuly();
        name.output();
        //output
        
    }
}
