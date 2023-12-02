package programmer.zaman.now.i18n;

import org.junit.jupiter.api.Test;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Currency;
import java.util.Locale;

public class CurrencyTest {
    @Test
    void testCurrency() {
        var indonesia = new Locale("in", "ID");
        var currency = Currency.getInstance(indonesia);

        System.out.println(currency.getDisplayName());
        System.out.println(currency.getCurrencyCode());
        System.out.println(currency.getSymbol(indonesia));
    }

    @Test
    void testCurrencyUSA() {
        var america = new Locale("en", "US");
        var currency = Currency.getInstance(america);

        System.out.println(currency.getDisplayName());
        System.out.println(currency.getCurrencyCode());
        System.out.println(currency.getSymbol(america));
    }

    @Test
    void testNumberFormatCurrencyIndonesia() {
        var indonesia = new Locale("in","ID");
        var numberFormat = NumberFormat.getCurrencyInstance(indonesia);

        String format = numberFormat.format(100000000);
        System.out.println(format);
    }

    @Test
    void testNumberFormatCurrencyParseIndonesia() {
        var indonesia = new Locale("in","ID");
        var numberFormat = NumberFormat.getCurrencyInstance(indonesia);

        try {
            var parse = numberFormat.parse("Rp900.000,25").doubleValue();
            System.out.println(parse);
        } catch (ParseException e) {
            System.out.println("error parse : " + e.getMessage());
        }

    }
}
