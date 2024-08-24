package singleton;

/**
 * Singleton dizayn patterni, bir sinifdən yalnız bir obyektin yaradılmasını təmin edir və
 * bu obyektin bütün proqram daxilində tək olmasını təmin edir.
 * Bu, sinifin özü özünü idarə etməsinə və digər siniflərdən asılı olmadan həmin obyektin mövcudluğunu təmin etməyə imkan verir.
 * Tək instansiya: Sinifdən yalnız bir obyekt yaradılır.
 * Qlobal giriş nöqtəsi: getInstance() metodu ilə tək instansiyaya çıxış təmin edilir.
 * Thread-safe: Multithreading mühitində sinxronizasiya ilə təhlükəsizlik təmin olunur.
 */
public class Singleton {
    private Singleton() {
    }

    private static Singleton singleton;

    public static Singleton getInstance() {
        if (singleton == null) {
            singleton = new Singleton();
        }
        return singleton;
    }
}
