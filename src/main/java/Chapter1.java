import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Chapter1 {
    public static void main(String[] args) {
//        Excerise2();
//        Excerise2b();
//        Excerise3();
//        Excerise4();
        Excerise8();
    }

    private static void Excerise2b() {
        System.out.println("\nExcercise 2b");
        File file = new File("/users/wnelson");
        File[] directories = file.listFiles(File::isDirectory);
        for (File directory : directories) {
            System.out.println(directory.getName());
        }
    }

    private static void Excerise2() {
        System.out.println("\nExcercise 2");
        File file = new File("/users/wnelson");
        File[] directories = file.listFiles((File dir, String name) -> new File(dir, name).isDirectory());
        for (File directory : directories) {
            System.out.println(directory);
        }
    }

    private static void Excerise3() {
        System.out.println("\nExcercise 3");
        File file = new File("/users/wnelson");
        String[] directories = file.list((File dir, String name) -> name.contains("u"));
        for (String directory : directories) {
            System.out.println(directory);
        }
    }

    private static void Excerise4() {
        System.out.println("\nExcercise 4");
        File file = new File("/users/wnelson");
        File[] files = file.listFiles();

        Arrays.sort(files, (File f1, File f2) -> {
            if ((f1.isDirectory() && f2.isDirectory()) || (f1.isFile() && f2.isFile()))
                return f1.getName().compareToIgnoreCase(f2.getName());
            return (f1.isDirectory() ? -1 : 1);
        });

        for (File sortedFile : files) {
            System.out.println(sortedFile);
        }
    }

    private static void Excerise8() {
        System.out.println("\nExcercise 8");
        String[] names = {"Peter", "Paul", "Mary"};
        List<Runnable> runners = new ArrayList<>();
        for (String name : names) {
            runners.add(() -> System.out.println(name));
        }
        System.out.println();
    }

}
