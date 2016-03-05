/**
 * Created by Manasa on 3/5/2016.
 *
 * For this program you need to have 2 different folders, Cereal and Chex.
 * The Chex folder should exist inside the Cereal folder
 * Place the RiceChex & WheatChex java classes in the Chex folder
 * Place the Cheerios java class in the Cereal folder
 * Here a folder represents a package
 */

import Cereal.Cheerios;
import Cereal.Chex.*;
public class Chapter20 {
    public static void main(String args[]){
        System.out.println("These are the different healthy cereals available");
        Cheerios ch = new Cheerios();
        ch.belongsTo();
        RiceChex rc = new RiceChex();
        rc.belongsTo();
        WheatChex wc = new WheatChex();
        wc.belongsTo();
    }
}
