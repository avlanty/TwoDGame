package entity;

import com.yup.twodgame.GamePanel;
import com.yup.twodgame.KeyHandler;

import javax.imageio.ImageIO;
import java.awt.*;
import java.io.IOException;

public class Player extends Entity{

    GamePanel gp;
    KeyHandler keyH;

    public Player(GamePanel gp, KeyHandler keyH){
        this.gp = gp;
        this.keyH = keyH;
        setDefaultValues();
        getPlayerImage();
    }

    public void getPlayerImage(){
        try{
            up1 = ImageIO.read(getClass().getResourceAsStream("/player/ant_up_1.png"));
            up2 = ImageIO.read(getClass().getResourceAsStream("/player/ant_up_2.png"));
            down1 = ImageIO.read(getClass().getResourceAsStream("/player/ant_down_1.png"));
            down2 = ImageIO.read(getClass().getResourceAsStream("/player/ant_down_2.png"));
            left1 = ImageIO.read(getClass().getResourceAsStream("/player/ant_left_1.png"));
            left2 = ImageIO.read(getClass().getResourceAsStream("/player/ant_left_2.png"));
            right1 = ImageIO.read(getClass().getResourceAsStream("/player/ant_right_1.png"));
            right2 = ImageIO.read(getClass().getResourceAsStream("/player/ant_right_2.png"));

        }
        catch(IOException e){
            e.printStackTrace();
        }
    }

    public void setDefaultValues() {
        x = 100;
        y = 100;
        speed = 4;
        direction = "down";
    }

    public void update(){
        if(keyH.upPressed){
            y -= speed;
        }
        else if(keyH.downPressed){
            y += speed;
        }
        else if(keyH.leftPressed){
            x -= speed;
        }
        else if(keyH.rightPressed){
            x += speed;
        }
    }

    public void draw(Graphics2D graphics2D){
        graphics2D.setColor(Color.white);
        graphics2D.fillRect(x, y, gp.tileSize, gp.tileSize);
    }
}
