package Day14;


import java.util.Scanner;

// liet ke, dem  cac so nguyen to nho hon hoac bang n:
public class SangSoNguyenTo {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Nhập giá trị của n
            System.out.println(" input value n : ");

            int n = scanner.nextInt();

            // Khởi tạo mảng để lưu trữ các số nguyên tố
            boolean[] isPrime = new boolean[n +1 ];
            for (int i = 2; i <= n; i++) {
                isPrime[i] = true;
            }

            // Sàng Eratosthenes: loại bỏ các bội số của các số nguyên tố
            for (int i = 2; i * i <= n; i++) {
                if (isPrime[i]) {
                    for (int j = i * i; j <= n; j += i) {
                        isPrime[j] = false;
                    }
                }
            }

            // In ra các số nguyên tố không vượt quá n
            for (int i = 2; i <= n; i++) {
                if (isPrime[i]) {
                    System.out.println(i + " is a numbers prime ");
                }
            }

        }
    }


