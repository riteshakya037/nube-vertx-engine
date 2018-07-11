package utilities.filters;

import utilities.constants.Constants;

public class SQLFilter {
    public static boolean isReadType(String query){
        boolean isReadType = true;
        for(String queryType : Constants.sqlKeyWords()){
            if(containsWithCase(query,queryType)){
                isReadType=false;
                break;
            }
        }
        return isReadType;
    }
    public static boolean containsWithCase(String str1, String str2){
        if(str1.toLowerCase().contains(str2.toLowerCase())){
            return true;
        }else{
            return false;
        }
    }
}
