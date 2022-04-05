/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pck_entidad;

/**
 *
 * @author abecerra
 */
public class cls_conversion {

    public cls_conversion() {
    }
    
    public static int CInt(Object objValor) {
        try
        {
            return Integer.parseInt(CStr(objValor));
        }
        catch(Exception ex)
        {
            return 0;
        }

    }
    
    public static double CDbl(Object objValor) {
        try
        {
            return Double.parseDouble(CStr(objValor));
        }
        catch(Exception ex)
        {
            return 0;
        }
    }
    
    public static String CStr(Object objValor) {
        try
        {
            String str=String.valueOf((objValor+"").trim());
            
            if(str.toUpperCase().equals("NULL"))
                str="";
            
            return str;
            //return String.valueOf((objValor+"").trim());
        }
        catch(Exception ex)
        {
            return "";
        }

    }
    
    public static Boolean CBol(Object objValor) {
        try
        {
            return Boolean.parseBoolean(CStr(objValor));
        }
        catch(Exception ex)
        {
            return false;
        }

    }
}
