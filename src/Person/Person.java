
public class Person {

    // staattiset muuttujat (class variables)
    static int legalAge = 18;

    // instanssi-muuttujat (object fields)
    // Luokalla Person on 2 kenttää
    public String name;
    private int age; // kenttä = memory...

    // Esimerkki INSTANSSI-metodista
    // instanssi-metodit toimivat aina objektin (olion) kautta
    int returnAge() {
        return returnAge(age); // voi myös this.
    }

    // Esimerkki overload:sta (edelleen instanssi metodi, koska static sana puuttuu)
    private int returnAge(int x){
        // palauta annettu ikä, jos se on suurempi kuin tämän olion ikä
        if (x > age) {
            return x;
        }
        else {
            return age;

        }
        
    }

    // esimerkki staattisesta metodista
    // staattiset metodit eivät vaadi objektia (oliota)
    // eivätkä instanssi-muuttujat (kentät) ole silloin käytettävissä...
    static int getLegalAge() {

        // ei voi kirjoittaa:
        // return _age;

        return Person.legalAge;

    }

    // this:n vastine luokka-muuttujissa on luokan nimi

    static int getLegalAgeInAmerica() {
        return Main.legalAge;
    }
}