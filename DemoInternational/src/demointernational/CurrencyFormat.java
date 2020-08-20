/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demointernational;

import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 *
 * @author USER
 */
public class CurrencyFormat {

    public static void main(String[] args) {
        Locale locales[] = {Locale.KOREA,Locale.JAPAN,Locale.UK,Locale.US, new Locale("en","SG")};
        for (Locale locale : locales) {
            NumberFormat currenyFormated = NumberFormat.getCurrencyInstance( locale);
            System.out.println(locale+":"+currenyFormated.format(200));
        }
        Date today = new Date();
        String dateStr;
        for (Locale locale : locales) {
            SimpleDateFormat sdf = new SimpleDateFormat("EEEE d MMMM yyyy",locale);
            dateStr = sdf.format(today);
            System.out.println(locale+":"+dateStr);
        }
    }
    
}
