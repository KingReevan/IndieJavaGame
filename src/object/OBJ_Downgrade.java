package object;

import javax.imageio.ImageIO;
import java.io.IOException;
import java.util.Objects;

public class OBJ_Downgrade extends SuperObject{
    public OBJ_Downgrade(){
        name = "Downgrade";
        try{
            image = ImageIO.read(Objects.requireNonNull(getClass().getResourceAsStream("/res/objects/downgrade.png")));
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
