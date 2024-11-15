public class NameChecker {
    private static volatile NameChecker instance;
    public String checker;
    private NameChecker(String checker){
        this.checker = checker;
    }
    public static NameChecker getInstance(String checker){
        NameChecker resultat = instance;
        if (resultat != null){
            return resultat;
        }
         synchronized (NameChecker.class){
        if (resultat == null){
            instance = new NameChecker(checker);
        }
        return instance;
        }
    }
}
