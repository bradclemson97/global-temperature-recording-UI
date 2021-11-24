package Panel;
//        Brad
  //      2019-09-06
    //    14:29

import View.RegionEntryForm;
import Model.Model;

public class Start {
    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() { RegionEntryForm mainForm = new RegionEntryForm(new Model());}
        });
    }
}
