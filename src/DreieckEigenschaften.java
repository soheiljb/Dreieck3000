public class DreieckEigenschaften {

    //Variablen für die Seitenlängen des Dreiecks
    int seite_a;
    int seite_b;
    int seite_c;

    //Prüfe ob die Zahlen >=1 und <=99 sind
    public boolean pruefeWertebereich(int zahl){
        if (zahl < 1 || zahl > 99){
            System.out.println(zahl+ " entspricht nicht dem Wertebereich 1-99. Bitte eine Zahl zwischen 1-99 eingeben");
        }
        return zahl < 1 || zahl > 99;
    }

    //Prüfe ob die Seiten ein Dreieck ergeben
    public void dreiecksPruefung(){
        if(((seite_a + seite_b) < seite_c) || ((seite_a + seite_c) < seite_b) || ((seite_b + seite_c) < seite_a)) {
            System.out.println("Die drei Seiten ergeben kein Dreieck");
        }
        else {
            System.out.println("Die drei Seiten ergeben ein Dreieck");

            if (((seite_a == seite_b) && (seite_a != seite_c)) ||
                    ((seite_a == seite_c) && (seite_a != seite_b)) ||
                    ((seite_b == seite_c) && (seite_b != seite_a))){

                System.out.println("Es handelt sich um ein gleichschenkliges Dreieck");
            }
            else if (seite_a == seite_b && seite_a == seite_c) {
                System.out.println("Es handelt sich um ein gleichseitiges Dreieck");
            }
            else if ((seite_a != seite_b) && (seite_a != seite_c) && (seite_b != seite_c)) {
                System.out.println("Es handelt sich um ein unregelmäßiges Dreieck");
            }

        }

    }

}
