public class Main {

    static int legalAge = 21; // America...

    // Jos joku ajaisi tätä Java-ohjelmaa esim. komentoriviltä, hän voisi kirjoitta:
    // javarun main --verbose --mode=TESTING
    public static void main(String[] args) {
        
        // final = tämän muuttujan arvo ei koskaan muuttu
        final String missX = "Elina"; 

        String nimi = "Jaakko";

        if (true){

        }

        // switch on näppärä tapa kirjoittaa else if:t ilman "iffittelyä"
        switch (nimi) {
            // in case nimi is Pertti
            case "Pertti":
            case "Paavo":
            case "Mika":
            case "Maria":
            case "Metin":
                System.out.println("Hei Pertti");
                break;

            case missX:
                System.out.println("Hello " + missX);
                break;

            // default on vähän kuin "else"
            default:
                System.out.println("Hello ...?");
        }

    }

}