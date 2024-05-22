package Documentador;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Documentador
{
    public static boolean correo(String email)
    {
        Pattern pattern = Pattern
                .compile("^[a-zA-Z0-9_!#$%&'\\*+\\=?{|}~^.-]+@[a-zA-Z0-9.-]+$");
 
        Matcher mather = pattern.matcher(email);
 
        if (mather.find() == true) {
            System.out.println("El email ingresado es válido.");
            return true;
        } else 
        {
            System.out.println("El email ingresado es inválido.");
            return false;
        }
    }
    
    public static boolean telefono(String tel)
    {
        Pattern pattern = Pattern.compile("^(\\+\\d{1,3}( )?)?((\\(\\d{3}\\))|\\d{3})[- .]?\\d{3}[- .]?\\d{4}$");
 
        Matcher mather = pattern.matcher(tel);
 
        if (mather.find() == true) {
            System.out.println("El teléfono ingresado es válido.");
            return true;
        } else 
        {
            System.out.println("El teléfono ingresado es inválido.");
            return false;
        }
    }
    
    public static boolean version(String ver)
    {
        Pattern pattern = Pattern.compile("^[0-9].[0-9].*$");
 
        Matcher mather = pattern.matcher(ver);
 
        if (mather.find() == true) {
            System.out.println("La versión es válida.");
            return true;
        } else 
        {
            System.out.println("La versión es inválida.");
            return false;
        }
    }
}
