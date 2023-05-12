import java.util.Scanner;

public class Main extends DreieckEigenschaften{
    public static void main(String[] args) {

        DreieckEigenschaften dreieckEigenschaften = new DreieckEigenschaften();
        Scanner eingabewert = new Scanner(System.in);

        //Variablen für Seitenlänge werden benutzerdefiniert zur Laufzeit eingegeben

        while (true) {
            System.out.println("Bitte Wert für Seite a eingeben");
            dreieckEigenschaften.seite_a = eingabewert.nextInt();

            if (!dreieckEigenschaften.pruefeWertebereich(dreieckEigenschaften.seite_a)) {
                break;
            }
        }

        while (true) {
            System.out.println("Bitte Wert für Seite b eingeben");
            dreieckEigenschaften.seite_b = eingabewert.nextInt();

            if (!dreieckEigenschaften.pruefeWertebereich(dreieckEigenschaften.seite_b)) {
                break;
            }
        }

        while (true) {
            System.out.println("Bitte Wert für Seite c eingeben");
            dreieckEigenschaften.seite_c = eingabewert.nextInt();

            if (!dreieckEigenschaften.pruefeWertebereich(dreieckEigenschaften.seite_c)) {
                break;
            }
        }

        dreieckEigenschaften.dreiecksPruefung();

    }
}
