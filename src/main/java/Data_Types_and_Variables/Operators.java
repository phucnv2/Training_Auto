package Data_Types_and_Variables;

public class Operators {
    public static void main(String[] args) {
        int number1 = 3;
        int number2 = 4;
        int tong = number1 + number2;
        int hieu = number1 - number2;
        int tich = number1 * number2;
        String name = "NGUYEN VAN PHUC";
        int age = 30;
        System.out.println("Tong 2 so la: " + tong);
        System.out.println("Hieu 2 so la: " + hieu);
        System.out.println("Tich 2 so la: " + tich);
        System.out.println("Chia 2 so la: " + ((double) number1 / number2));

        if (number2 > number1) {
            System.out.println("Số " + number2 + " lớn hơn số " + number1);
        } else {
            System.out.println("Số " + number1 + " lớn hơn số " + number2);
        }

        if (name == "PHUC" && age == 30) {
            System.out.println("Đây là: " + name + ", " + age + " tuổi");
        } else {
            System.out.println("Đây là thằng nào ấy");
        }
        int day = 6;
        switch (day) {
            case 2:
                System.out.println("Day la so: " + day);
                break;
            case 3:
                System.out.println("Day la so: " + day);
                break;
            case 4:
                System.out.println("Day la so: " + day);
                break;
            case 5:
                System.out.println("Day la so: " + day);
                break;
            default:
                System.out.println("Khong co so nao ca!");
        }
    }

}
