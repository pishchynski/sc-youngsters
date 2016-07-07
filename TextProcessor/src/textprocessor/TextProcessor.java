package textprocessor;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author pishchinsky
 */
public class TextProcessor {

    interface TextUnit {
        public void print();
    }
   
    class Symbol implements TextUnit {

        char value;
            
        @Override
        public void print() {
            System.out.println(value);
        }
        
        public void setValue(char value) {
            this.value = value;
        }
        
        public char getValue() {
            return this.value;
        }
    }
    
    class Word implements TextUnit {

        String value;
        
        public void setValue(String value) {
            this.value = value;
        }
        
        public String getValue() {
            return this.value;
        }
        
        @Override
        public void print() {
            System.out.println(value);
        }
        
    }
    
    class CompositeTextUnit implements TextUnit {
        
        List<TextUnit> childTextUnits = new ArrayList<>();
        
        @Override
        public void print() {
            for (TextUnit textUnit : childTextUnits) {
                textUnit.print();
            }
        }
    }
        
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
