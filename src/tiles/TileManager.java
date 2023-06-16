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
            tile[1] = new Tile();
            tile[1].image = ImageIO.read(getClass().getClassLoader().getResourceAsStream("tiles/grass.png"));
            tile[2] = new Tile();
            tile[2].image = ImageIO.read(getClass().getClassLoader().getResourceAsStream("tiles/grass.png"));
            tile[3] = new Tile();
            tile[3].image = ImageIO.read(getClass().getClassLoader().getResourceAsStream("tiles/grass.png"));
            tile[4] = new Tile();
            tile[4].image = ImageIO.read(getClass().getClassLoader().getResourceAsStream("tiles/grass.png"));
            tile[5] = new Tile();
            tile[5].image = ImageIO.read(getClass().getClassLoader().getResourceAsStream("tiles/grass.png"));
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }

    public void draw(Graphics2D graphics2D){
        graphics2D.drawImage(tile[0].image, 0,0, gp.tileSize, gp.tileSize, null);
        graphics2D.drawImage(tile[1].image, 48,0, gp.tileSize, gp.tileSize, null);
        graphics2D.drawImage(tile[2].image, 96,0, gp.tileSize, gp.tileSize, null);
        graphics2D.drawImage(tile[3].image, 144,0, gp.tileSize, gp.tileSize, null);
        graphics2D.drawImage(tile[4].image, 192,0, gp.tileSize, gp.tileSize, null);
        graphics2D.drawImage(tile[5].image, 240,0, gp.tileSize, gp.tileSize, null);
    }
}
