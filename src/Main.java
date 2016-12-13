import uk.ac.starlink.table.StarTable;
import uk.ac.starlink.table.StarTableFactory;
import uk.ac.starlink.table.StarTableOutput;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        //Скачивает файл и записывает на диск
        StarTableFactory tfact = new StarTableFactory();
        //URL url = new URL("http://cdsarc.u-strasbg.fr/vizier/ftp/cats/I/276/catalog.dat.gz");
        //URLDataSource wdsURL = new URLDataSource(url);
        StarTable tab = tfact.makeStarTable("http://cdsarc.u-strasbg.fr/viz-bin/nph-Cat/fits?I%2F276/catalog.dat.gz","fits");
        StarTableOutput sto = new StarTableOutput();
        sto.writeStarTable(tab, "c:/WCT/tdsc.dat","ascii");
        System.out.println(tab.getColumnCount());




    }
}
