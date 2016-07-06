package textprocessor;

import java.util.ArrayList;

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
    
    class Sentence implements TextUnit {
        
        StringBuilder value = new StringBuilder();
        
        public void add(Word word) {
            this.value.append(word.value);
        }
        
        public void add(String str) {
            this.value.append(str);
        }
        
        public void add(Symbol sym) {
            this.value.append(sym.value);
        }
        
        @Override
        public void print() {
            System.out.println(value.toString());
        }
    }
   
    class Paragraph implements TextUnit {
        ArrayList<Sentence> values = new ArrayList<>();
        
        public void add(Word word) {
            this.value.append(word.value);
        }
        
        @Override
        public void print(){
            for (Sentence sentence : values) {
                System.out.print(sentence);
            }
        }
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
