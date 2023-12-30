package ManipulandopastascomFile;

import java.io.File;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Dijiti um caminho do seu arquivo: ");
        String stcPath = sc.nextLine();

        File path = new File(stcPath);

        File[] folders = path.listFiles(File::isDirectory);
        System.out.println("Folders: ");
        for (File folderss : folders) {
            System.out.println(folderss);
        }

        File[] files = path.listFiles(File::isFile);
        System.out.println("Files: ");
        for (File file : files) {
            System.out.println(file);
        }

        boolean sucesso = new File(stcPath + "\\subdir").mkdir();
        System.out.println("Diretorio created successFully: " + sucesso);

        sc.close();
    }
}
