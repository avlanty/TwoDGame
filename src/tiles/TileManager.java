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
        tile = new Tile[36]; // if you need more, you can always change this num
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
            tile[6] = new Tile();
            tile[6].image = ImageIO.read(getClass().getClassLoader().getResourceAsStream("tiles/grass.png"));
            tile[7] = new Tile();
            tile[7].image = ImageIO.read(getClass().getClassLoader().getResourceAsStream("tiles/grass.png"));
            tile[8] = new Tile();
            tile[8].image = ImageIO.read(getClass().getClassLoader().getResourceAsStream("tiles/grass.png"));
            tile[9] = new Tile();
            tile[9].image = ImageIO.read(getClass().getClassLoader().getResourceAsStream("tiles/grass.png"));
            tile[10] = new Tile();
            tile[10].image = ImageIO.read(getClass().getClassLoader().getResourceAsStream("tiles/grass.png"));
            tile[11] = new Tile();
            tile[11].image = ImageIO.read(getClass().getClassLoader().getResourceAsStream("tiles/grass.png"));
            tile[12] = new Tile();
            tile[12].image = ImageIO.read(getClass().getClassLoader().getResourceAsStream("tiles/grass.png"));
            tile[13] = new Tile();
            tile[13].image = ImageIO.read(getClass().getClassLoader().getResourceAsStream("tiles/grass.png"));
            tile[14] = new Tile();
            tile[14].image = ImageIO.read(getClass().getClassLoader().getResourceAsStream("tiles/grass.png"));
            tile[15] = new Tile();
            tile[15].image = ImageIO.read(getClass().getClassLoader().getResourceAsStream("tiles/grass.png"));
            tile[16] = new Tile();
            tile[16].image = ImageIO.read(getClass().getClassLoader().getResourceAsStream("tiles/grass.png"));
            tile[17] = new Tile();
            tile[17].image = ImageIO.read(getClass().getClassLoader().getResourceAsStream("tiles/grass.png"));
            tile[18] = new Tile();
            tile[18].image = ImageIO.read(getClass().getClassLoader().getResourceAsStream("tiles/grass.png"));
            tile[19] = new Tile();
            tile[19].image = ImageIO.read(getClass().getClassLoader().getResourceAsStream("tiles/grass.png"));
            tile[20] = new Tile();
            tile[20].image = ImageIO.read(getClass().getClassLoader().getResourceAsStream("tiles/grass.png"));
            tile[21] = new Tile();
            tile[21].image = ImageIO.read(getClass().getClassLoader().getResourceAsStream("tiles/grass.png"));
            tile[22] = new Tile();
            tile[22].image = ImageIO.read(getClass().getClassLoader().getResourceAsStream("tiles/grass.png"));
            tile[23] = new Tile();
            tile[23].image = ImageIO.read(getClass().getClassLoader().getResourceAsStream("tiles/grass.png"));
            tile[24] = new Tile();
            tile[24].image = ImageIO.read(getClass().getClassLoader().getResourceAsStream("tiles/grass.png"));
            tile[25] = new Tile();
            tile[25].image = ImageIO.read(getClass().getClassLoader().getResourceAsStream("tiles/grass.png"));
            tile[26] = new Tile();
            tile[26].image = ImageIO.read(getClass().getClassLoader().getResourceAsStream("tiles/grass.png"));
            tile[27] = new Tile();
            tile[27].image = ImageIO.read(getClass().getClassLoader().getResourceAsStream("tiles/grass.png"));
            tile[28] = new Tile();
            tile[28].image = ImageIO.read(getClass().getClassLoader().getResourceAsStream("tiles/grass.png"));
            tile[29] = new Tile();
            tile[29].image = ImageIO.read(getClass().getClassLoader().getResourceAsStream("tiles/grass.png"));
            tile[30] = new Tile();
            tile[30].image = ImageIO.read(getClass().getClassLoader().getResourceAsStream("tiles/grass.png"));
            tile[31] = new Tile();
            tile[31].image = ImageIO.read(getClass().getClassLoader().getResourceAsStream("tiles/grass.png"));
            tile[32] = new Tile();
            tile[32].image = ImageIO.read(getClass().getClassLoader().getResourceAsStream("tiles/grass.png"));
            tile[33] = new Tile();
            tile[33].image = ImageIO.read(getClass().getClassLoader().getResourceAsStream("tiles/grass.png"));
            tile[34] = new Tile();
            tile[34].image = ImageIO.read(getClass().getClassLoader().getResourceAsStream("tiles/grass.png"));
            tile[35] = new Tile();
            tile[35].image = ImageIO.read(getClass().getClassLoader().getResourceAsStream("tiles/grass.png"));
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
        graphics2D.drawImage(tile[6].image, 0,48, gp.tileSize, gp.tileSize, null);
        graphics2D.drawImage(tile[7].image, 48,48, gp.tileSize, gp.tileSize, null);
        graphics2D.drawImage(tile[8].image, 96,48, gp.tileSize, gp.tileSize, null);
        graphics2D.drawImage(tile[9].image, 144,48, gp.tileSize, gp.tileSize, null);
        graphics2D.drawImage(tile[10].image, 192,48, gp.tileSize, gp.tileSize, null);
        graphics2D.drawImage(tile[11].image, 240,48, gp.tileSize, gp.tileSize, null);
        graphics2D.drawImage(tile[12].image, 0,96, gp.tileSize, gp.tileSize, null);
        graphics2D.drawImage(tile[13].image, 48,96, gp.tileSize, gp.tileSize, null);
        graphics2D.drawImage(tile[14].image, 96,96, gp.tileSize, gp.tileSize, null);
        graphics2D.drawImage(tile[15].image, 144,96, gp.tileSize, gp.tileSize, null);
        graphics2D.drawImage(tile[16].image, 192,96, gp.tileSize, gp.tileSize, null);
        graphics2D.drawImage(tile[17].image, 240,96, gp.tileSize, gp.tileSize, null);
        graphics2D.drawImage(tile[18].image, 0,144, gp.tileSize, gp.tileSize, null);
        graphics2D.drawImage(tile[19].image, 48,144, gp.tileSize, gp.tileSize, null);
        graphics2D.drawImage(tile[20].image, 96,144, gp.tileSize, gp.tileSize, null);
        graphics2D.drawImage(tile[21].image, 144,144, gp.tileSize, gp.tileSize, null);
        graphics2D.drawImage(tile[22].image, 192,144, gp.tileSize, gp.tileSize, null);
        graphics2D.drawImage(tile[23].image, 240,144, gp.tileSize, gp.tileSize, null);
        graphics2D.drawImage(tile[24].image, 0,192, gp.tileSize, gp.tileSize, null);
        graphics2D.drawImage(tile[25].image, 48,192, gp.tileSize, gp.tileSize, null);
        graphics2D.drawImage(tile[26].image, 96,192, gp.tileSize, gp.tileSize, null);
        graphics2D.drawImage(tile[27].image, 144,192, gp.tileSize, gp.tileSize, null);
        graphics2D.drawImage(tile[28].image, 192,192, gp.tileSize, gp.tileSize, null);
        graphics2D.drawImage(tile[29].image, 240,192, gp.tileSize, gp.tileSize, null);
        graphics2D.drawImage(tile[30].image, 0,240, gp.tileSize, gp.tileSize, null);
        graphics2D.drawImage(tile[31].image, 48,240, gp.tileSize, gp.tileSize, null);
        graphics2D.drawImage(tile[32].image, 96,240, gp.tileSize, gp.tileSize, null);
        graphics2D.drawImage(tile[33].image, 144,240, gp.tileSize, gp.tileSize, null);
        graphics2D.drawImage(tile[34].image, 192,240, gp.tileSize, gp.tileSize, null);
        graphics2D.drawImage(tile[35].image, 240,240, gp.tileSize, gp.tileSize, null);
    }
}
