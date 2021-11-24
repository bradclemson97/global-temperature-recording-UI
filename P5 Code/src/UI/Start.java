package UI;
//        Brad
  //      2019-09-05
    //    11:49

public class Start {
    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                UserForm mainForm = new UserForm();
            }
        });
    }
}
