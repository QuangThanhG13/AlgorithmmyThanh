package exercisetech28.xuakitu;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class exercise1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("hay nhap 1 doan van ban s : ");
        String s = scanner.nextLine();
        System.out.println("hay nhap 1 doan van ban s2 : ");
        String s1 = scanner.nextLine();

        String chuyen = chuyenThanhInThuong(s);
        System.out.println(chuyen);

        int[] demSoLuong = demSoLuongKiTuTrongMang(s);
        System.out.println(" So luong chu cai thuong " + demSoLuong[0]);
        System.out.println(" So luong so la :  " + demSoLuong[1]);
        System.out.println(" So luong ki tu dac biet la " + demSoLuong[2]);



        demVaInSoLanXuatHien(s);
        inRatuTrungLap(s,s1);
        checkPangram(s);
        checkPangram(s1);

        boolean result = reverseString(s);
        if (result) {
            System.out.println("Chuỗi " + s  + " là chuỗi đối xứng.");
        } else {
            System.out.println("Chuỗi " + s + " không là chuỗi đối xứng.");
        }
    }



    public static String chuyenThanhInThuong(String s) {
        return s.toLowerCase();
    }

    public static int[] demSoLuongKiTuTrongMang(String s) {
        int[] ketQua = new int[3];
        for (char c : s.toCharArray()) {
            if (Character.isLetter(c)) {
                ketQua[0]++;
            } else if (Character.isDigit(c)) {
                ketQua[1]++;
            } else {
                ketQua[2]++;
            }
        }
        return ketQua;
    }

    public static void demVaInSoLanXuatHien(String s) {
        int[] count = new int[256];
        Arrays.fill(count, 0);
        // gan gia tri ban dau la 0 cho tat ca phan tu cua mang

        for (char c : s.toCharArray()) {
            count[c]++; // dung ma ascii cua ki tu day de dem.
        }
        for (int i = 0; i < 256; i++) {
            if (count[i] != 0) {
                // nó sẽ in ra những chữ cái xuất hiện ít nhất đúng 1 lần
                System.out.println((char) i + " " + count[i]);
            }
        }

        int maxFre = 0;
        char res = 0;// để lưu kí tự xuât hiện nhiều nhất

        for (int i = 0; i < 256; i++) {
            if (count[i] >= maxFre) {
                maxFre = count[i];
                res = (char) i;
            }
        }
        System.out.println("so lan ky tu xuat hien nhieu nhat : " + res);
    }

    public static void inRatuTrungLap(String s1, String s2) {
        int[] count = new int[256];
        Arrays.fill(count, 0);

        for (char c : s1.toCharArray()) {
            count[c] = 1;
        }
        for (char c : s2.toCharArray()) {
//            if (count[c] == 1) { // bai 7
//                count[c] = 2;
//            }
            count[c] =1;// bai 9
        }
        for (int i = 0; i < 256; i++) {
            if (count[i] == 1) {
                System.out.print((char) i);
            }
        }
    }
    public static void checkPangram (String s) {
        int[] count = new int[256];
        Arrays.fill(count, 0);

        for (char c : s.toCharArray()) {
            //count[c] = 1; //bai 10
            count[Character.toLowerCase(c)] = 1; // bai 11 khoong phan biet chu hoa hay chu thuong
        }
        //a--z (nam trong khoang 97 - 122
        boolean ok = true;
        for (int i = 97; i <= 122; i++) {
            if (count[i] == 0) {
                ok = false;
                break;
            }
        }
        if (ok) {
            System.out.println();
            System.out.println("Yes");
        }else {
        System.out.println("No ");
        }
    }

    public static boolean reverseString (String s) {
       //Cach 1 su dung reverse :
        StringBuilder sb = new StringBuilder(s);
        sb.reverse(); // dao nguoc chuoi

        String reversedString = sb.toString();// chuyen StringBuider thanh chuoi
      return s.equals(reversedString) ;
    }
    public static boolean reverseString1 (String s) {
        //Cach 2 :  su dung 2 con cho  :
      int left = 0;
      int right = s.length() - 1;
    while (left <= right) {
        if (s.charAt(left) != s.charAt(right)) {
            return false;
        }
        left++;
        right--;
    }
       return true;
    }
}