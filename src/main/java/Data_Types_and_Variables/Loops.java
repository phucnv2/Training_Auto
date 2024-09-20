package Data_Types_and_Variables;

public class Loops {
    public static void main(String[] args) {
        // vong lap do while là thực hiên khối lẹnh xong mới check điều kiện
        int n = 1;
        int tong = 0;
        do {
            tong = tong + n;
            n++;
        }
        while (n < 10);
        System.out.println(tong);

        // vong lap while

        int i = 0;
        while(i<5){
            System.out.println(i);
            i++;
        }
    }
}
