import java.util.*;

public class Calcolatrice extends Stack{

    
    private boolean ControlloCaratteri(char c){
        return (!Character.isDigit(c) && ControlloSimboli(c));
    }
    private boolean ControlloSimboli(char c){
        return ((c != ')') && (c != ']'));

    }
    private char removeParenthesis(char P){
        Iterator I = super.iterator();
        char segno = 'n';
        char c;

        while(I.hasNext()){
            c = (char)I.next();
            if(c == ')' || c == ']'){
                segno = (char)super.pop();
                super.pop();
            }
        }
        return segno;
    }

    public void NotazionePolacca(String str){
        String strPolacca = "";
        
    
}
}
