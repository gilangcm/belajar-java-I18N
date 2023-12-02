package programmer.zaman.now.i18n;

import org.junit.jupiter.api.Test;

import java.text.MessageFormat;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Date;

public class MessageFormatTypeTest {
    @Test
    void testMessageFormatType() {
        var locale = new Locale("in", "ID");
        var resourceBundle = ResourceBundle.getBundle("message", locale);

        var pattern = resourceBundle.getString("status");

        var messageFormat = new MessageFormat(pattern, locale);
        String format = messageFormat.format(new Object[]{
                "Eko ", new Date(), 1000000
        });
        System.out.println(format);

    }

    @Test
    void testMessageFormatTypeAmerica() {
        var locale = new Locale("en", "US");
        var resourceBundle = ResourceBundle.getBundle("message", locale);

        var pattern = resourceBundle.getString("status");

        var messageFormat = new MessageFormat(pattern, locale);
        String format = messageFormat.format(new Object[]{
                "Eko ", new Date(), 1000000
        });
        System.out.println(format);

    }

    @Test
    void testChoiceFormatInMessageFormat() {
        var locale = new Locale("in","ID");
        var resourceBundle = ResourceBundle.getBundle("message",locale);
        var pattern = resourceBundle.getString("balance");

        var messageFormat = new MessageFormat(pattern,locale);
        System.out.println(messageFormat.format(new Object[]{-10000000}));
        System.out.println(messageFormat.format(new Object[]{0}));
        System.out.println(messageFormat.format(new Object[]{10000000}));
    }

    @Test
    void testChoiceFormatInMessageFormatAmerica() {
        var locale = new Locale("en","US");
        var resourceBundle = ResourceBundle.getBundle("message",locale);
        var pattern = resourceBundle.getString("balance");

        var messageFormat = new MessageFormat(pattern,locale);
        System.out.println(messageFormat.format(new Object[]{-10000000}));
        System.out.println(messageFormat.format(new Object[]{0}));
        System.out.println(messageFormat.format(new Object[]{10000000}));
    }
}

