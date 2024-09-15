package Common;

import javax.swing.JOptionPane;
import java.io.File;

public class OpenPdf {
    public static void openById(String id){
        try{
            if((new File("D:\\"+id+".pdf")).exists()){
                Process p = Runtime
                        .getRuntime()
                        .exec("cmd /c start D:\\"+id+".pdf");
            }
            else {
                JOptionPane.showMessageDialog(null, "File does not Exist! ");
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
}
