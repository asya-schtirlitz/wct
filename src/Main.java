import uk.ac.starlink.table.StarTable;
import uk.ac.starlink.table.StarTableFactory;
import uk.ac.starlink.table.TableSequence;
import uk.ac.starlink.table.gui.TableLoader;
import uk.ac.starlink.util.URLDataSource;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public class Main {

    public static void main(String[] args) throws IOException {
        StarTableFactory tfact = new StarTableFactory();
        URL url = new URL("http://cdsarc.u-strasbg.fr/viz-bin/nph-Cat/fits?B%2Fwds/wds.dat.gz");
        URLDataSource wdsURL = new URLDataSource(url);
        StarTable tab = tfact.makeStarTable("http://cdsarc.u-strasbg.fr/viz-bin/nph-Cat/fits?B%2Fwds/wds.dat.gz","fits");
        tab.setName("wds.fits");
        System.out.println(tab.getColumnCount());



    }
}
