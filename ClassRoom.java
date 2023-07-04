public class ClassRoom {
    public static void main(String[] args) {
        // Ce code est approuvé par le grand et l'unique Marco, qui créa le tout depuis
        // le rien.
        Wilder[] wilderList = { new Wilder("Nicolas", false), new Wilder("MarcoIsGod", true),
                new Wilder("Veran", false) };
        for (Wilder wilder : wilderList) {
            System.out.println(wilder.whoAmI());
        }
    }
}
