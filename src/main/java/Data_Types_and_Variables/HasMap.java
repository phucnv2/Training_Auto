package Data_Types_and_Variables;

import java.util.HashMap;

public class HasMap {
    public static void main(String[] args) {
        System.out.println("--- HASMAP ---");
        HashMap<Integer, String> hs = new HashMap<>();
        // Add phan tu
        hs.put(1,"Phuc");
        hs.put(2,"HIA");
        hs.put(3,"Nam");
        hs.put(4,"Auc");
        hs.put(5,"Qaaa");
        System.out.println(hs);

        // Get giá tri
        String vl = hs.get(1);
        System.out.println(vl);

        //delete
        hs.remove(1);

        // kiem tra ton tai
        boolean check = hs.containsKey(1);
        boolean checkvl = hs.containsValue(1);
        System.out.println(check);

        // duyet hasmap
        for(Integer key: hs.keySet()){
            String value = hs.get(key);
            System.out.println(value);
        }

        // example
        HashMap <String, String> user = new HashMap();
        user.put("Phuc_1","123");
        user.put("Phuc_2","123123123");
        user.put("Phuc_3","412123");
        user.put("Phuc_4","314123");
        user.put("Phuc_5","341231");
        String userName = "Phuc_5";
        String passWord ="341231";
        if(user.containsKey(userName)==false){
            System.out.println(" User "+userName + " không tồn tại trong hệ thống!");
        } else if (user.get(userName).equals(passWord)==false) {
            System.out.println("Password không chính xác!");
        }else{
            System.out.println("Login success!");
        }

    }
}
