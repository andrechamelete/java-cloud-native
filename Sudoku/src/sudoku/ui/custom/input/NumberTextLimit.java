package sudoku.ui.custom.input;

import static java.util.Objects.isNull;
import java.util.List;
import javax.swing.text.PlainDocument;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;

public class NumberTextLimit extends PlainDocument{

    private final List<String> NUMBERS = List.of("1", "2", "3", "4", "5", "6", "7", "8", "9");
    
    @Override
    public void insertString(final int offs, final String str, final AttributeSet a) throws BadLocationException {
        if(isNull(str) || (!NUMBERS.contains(str))) return;

        if(getLength() + str.length() <= 1) {
            super.insertString(offs, str, a);
        }
    }
    
}
