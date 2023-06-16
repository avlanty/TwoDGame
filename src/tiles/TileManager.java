package tiles;

import com.yup.twodgame.GamePanel;

import javax.imageio.ImageIO;
import java.awt.*;
import java.io.*;

public class TileManager {

    GamePanel gp;
    Tile[] tile;

    public TileManager(GamePanel gp){
        this.gp = gp;
        tile = new Tile[10]; // if you need more, you can always change this num
    }

    public void getTileImage(){
        try{
            tile[0] = new Tile();
            tile[0].image = ImageIO.read(getClass().getClassLoader().getResourceAsStream("tiles/grass.png"));
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }

    public void draw(Graphics2D graphics2D){
        graphics2D.drawImage(tile[0].image, 0,0, gp.tileSize, gp.tileSize, null);
    }
}
