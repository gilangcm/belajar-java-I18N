package programmer.zaman.now.i18n;

import org.junit.jupiter.api.Test;

import java.text.ChoiceFormat;

public class ChoiceFormatTest {
    @Test
    void testChoiceFormat() {
        var pattern = "-1#negatif | 0#Kosong | 1#Satu | 1<Banyak";
        var choiceFormat = new ChoiceFormat(pattern);

        System.out.println(choiceFormat.format(-2));
        System.out.println(choiceFormat.format(-1));
        System.out.println(choiceFormat.format(0));
        System.out.println(choiceFormat.format(1));
        System.out.println(choiceFormat.format(3));
        System.out.println(choiceFormat.format(5));
    }
}
