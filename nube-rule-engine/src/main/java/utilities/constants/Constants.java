package utilities.constants;

import java.util.ArrayList;

public class Constants {
    public static String DELETE = "DELETE";
    public static String INSERT = "INSERT";
    public static String UPDATE = "UPDATE";
    public static String ALTER = "ALTER";
    public static String SELECT = "SELECT";
    public static String ACCESS_DENIED = "Unauthorized";

    public static ArrayList<String> sqlKeyWords() {
        ArrayList<String> writeOperationList = new ArrayList<>();
        writeOperationList.add(DELETE);
        writeOperationList.add(INSERT);
        writeOperationList.add(UPDATE);
        writeOperationList.add(ALTER);
        return writeOperationList;
    }
}
