/**
                    p
                   ack
                  age c
                  hristm
                 as;public
                class Gree
                tings {priv
              ate static fin
              al  int  KOMPLE
             XIT�T = 28; priv
           ate static final Str
           ing  BEGREIFEN  =  "*
         ";private static final int
         L�SUNGEN  =  10;   private
        static final  String  SCHAF
       FEN = "**"; public static voi
      d center(String msg) { for (int
     i = 0; i < (KOMPLEXIT�T - msg.le
    ngth()) >> 1; i++) {System.out.pri
    nt(" ");} System.out.println(msg);}
   public static void main(String[]args)
  {String line=BEGREIFEN; for(int i=0; i
  < L�SUNGEN; i++){center(line);line+=SCH
 AFFEN;} center("*");center("*\n");center
 ("Frohe Weihnachten"); center("w�nscht Ih
r Team der"); center("viadee Unternehmensbe
                   ratun
                   g");}}
 */

package christmas;

public class Greetings {
    private static final int KOMPLEXIT�T = 28;
    private static final String BEGREIFEN = "*";
    private static final int L�SUNGEN = 10;
    private static final String SCHAFFEN = "**";

    public static void center(String msg) {
        for (int i = 0; i < (KOMPLEXIT�T - msg.length()) >> 1; i++) {
            System.out.print(" ");
        }
        System.out.println(msg);
    }

    public static void main(String[] args) {
        String line = BEGREIFEN;
        for (int i = 0; i < L�SUNGEN; i++) {
            center(line);
            line += SCHAFFEN;
        }
        center("*");
        center("*\n");
        center("Frohe Weihnachten");
        center("w�nscht Ihr Team der");
        center("viadee Unternehmensberatung");
    }
}
