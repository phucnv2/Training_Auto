package Data_Types_and_Variables;

import java.util.*;

public class Array_For {

    public static void main(String[] args) {
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        int[] myNum = {101, 20, 30, 40, 1, 5, 23, 45, 100};
        System.out.println(cars[1]); // in ra theo vị trí
        System.out.println(cars.length); // lấy ra độ dài
        // in ra cac phan tu cua mang bang for
        for (int i = 0; i < myNum.length; i++) {
            System.out.println(myNum[i]);
        }
        System.out.println("-----------");
        // in ra cac phan tu bang for-each

        System.out.println("-----------");
        // sắp xếp mảng
        Arrays.sort(myNum);
        System.out.println("Mang duoc sap xep lai:" + Arrays.toString(myNum));
        System.out.println("-----------");
        // ArrayList
        ArrayList<Integer> lst = new ArrayList(List.of(1, 2, 3, 4, 5));
        System.out.println(lst);
        System.out.println("-----------");
        // them phan tu vao
        lst.add(6);
        lst.add(1, 10);
        System.out.println(lst);
        System.out.println("-----------");
        // so phan tu cua list
        System.out.print("mang lay ra so phan tu cua list: ");
        System.out.println(lst.size());

        // lay gia tri theo index
        System.out.print("mang sau khi lay gia tri theo index: ");
        System.out.println(lst.get(1));
        // xoa phan tu theo index
        lst.remove(2);
        System.out.print("mang sau khi xoa phan tu theo index: ");
        System.out.println(lst);
        // xoa theo gia tri
        lst.remove(Integer.valueOf(10));
        System.out.print("mang sau khi xoa theo gia tri: ");
        System.out.println(lst);
        // thay đoi thong tin theo index va element
        lst.set(1, 2);
        System.out.print("mang sau khi thay doi thong tin: ");
        System.out.println(lst);
        // kiem tra gia tri co ton tai trong líst hay khong
        System.out.println("---kiem tra gia tri co ton tai trong líst hay khong---");
        int n = 4;
        boolean ktra = lst.contains(n);
        if (ktra == true) {
            System.out.println("Phan tu " + n + " co ton tai trong List!");
        } else {
            System.out.println("Phan tu " + n + " khong ton tai trong List!");
        }
        System.out.println("--- sap xep list tang dan ---");
        ArrayList<Integer> lst1 = new ArrayList(List.of(1, 12, 3, 14, 5, 60));
        Collections.sort(lst1);
        System.out.println("Líst sau sx: " + lst1);

        System.out.println("--- sap xep list tang dan ---");
        for (int i = 0; i < lst.size(); i++) {
            int vitri = lst.get(i);
            System.out.println(vitri);
        }

    }
}
