package org.example;
import java.io.IOException;
import java.util.Scanner;

public class Helper {
    private static String[][] obj = {{"Teknik","FT"}, {"Vokasi","SV"}, {"Ilmu Budaya","FIB"}};
    private static Scanner scanner = new Scanner(System.in);
    public static String readString(String intro) {
        System.out.print(intro+" : ");
        return scanner.nextLine();
    }
    public static int readInt(String intro) {
        System.out.print(intro+" : ");

        while (true) {
            try {
                return Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.print("Input must be an integer. Try again: ");
            }
        }
    }
    public static double readDouble(String intro) {
        System.out.print(intro+" : ");
        while (true) {
            try {
                return Double.parseDouble(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.print("Input must be a number. Try again: ");
            }
        }
    }
    public static boolean readBoolean(String intro) {
        System.out.print(intro+" : ");
        while (true) {
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("true")) {
                return true;
            } else if (input.equalsIgnoreCase("false")) {
                return false;
            } else {
                System.out.print("Input must be 'true' or 'false'. Try again: ");
            }
        }
    }
    public static String getFakultas(String kode){
        String code = "NA";
        for (int i = 0 ; i < obj.length;i++){
            if(obj[i]!=null){
                if(kode.equals(obj[i][1])){
                    code = obj[i][0];
                    break;
                }
            }else{
                break;
            }
        }
        return code;
    }
    public static String getKodeFakultas(String fakultas){
        String code = "NA";
        for (int i = 0 ; i < obj.length;i++){
            if(obj[i]!=null){
                if(fakultas.equals(obj[i][0])){
                    code = obj[i][1];
                    break;
                }
            }else{
                break;
            }
        }
        return code;
    }
    public static void clear() throws IOException{
        try {
            if (System.getProperty("os.name").contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                System.out.print("\033[H\033[2J");
                System.out.flush();
            }
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
    public static void pressEnterToContinue()
    {
        try
        {
            Helper.readString("Press Enter key to continue...");
            Helper.clear();
        }
        catch(Exception e)
        {}
    }

}
