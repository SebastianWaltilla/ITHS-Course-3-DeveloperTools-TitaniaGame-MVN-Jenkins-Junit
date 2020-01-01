package World;

public class Country extends Continent{

    // dessa skall väl kanske vara "statiska" så man kan rita upp en
    // karta i photoshop. :D

    // w= water, r= region.
    public static String[][] countryGrid =new String[][]{
            { "w", "r", "r", "r","r"},
            { "w", "r", "r", "r","r"}, // (detta blir då sydvästra hörnet)
            { "w", "r", "r", "r","r"},
            { "u", "w", "r", "r","r"},
            { "w", "w", "w", "w","w"},
    };


}
