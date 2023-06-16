package entity;

import com.yup.twodgame.GamePanel;
import com.yup.twodgame.KeyHandler;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Objects;

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
            up1 = ImageIO.read(getClass().getClassLoader().getResourceAsStream("player/ant_up_1.png"));
            up2 = ImageIO.read(getClass().getClassLoader().getResourceAsStream("player/ant_up_2.png"));
            down1 = ImageIO.read(getClass().getClassLoader().getResourceAsStream("player/ant_down_1.png"));
            down2 = ImageIO.read(getClass().getClassLoader().getResourceAsStream("player/ant_down_2.png"));
            left1 = ImageIO.read(getClass().getClassLoader().getResourceAsStream("player/ant_left_1.png"));
            left2 = ImageIO.read(getClass().getClassLoader().getResourceAsStream("player/ant_left_2.png"));
            right1 = ImageIO.read(getClass().getClassLoader().getResourceAsStream("player/ant_right_1.png"));
            right2 = ImageIO.read(getClass().getClassLoader().getResourceAsStream("player/ant_right_2.png"));
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

    public void update(){ // called 60 times per second, inside the gamelop
        if(keyH.upPressed){
            direction = "up";
            y -= speed;
        }
        else if(keyH.downPressed){
            direction = "down";
            y += speed;
        }
        else if(keyH.leftPressed){
            direction = "left";
            x -= speed;
        }
        else if(keyH.rightPressed){
            direction = "right";
            x += speed;
        }
        spriteCounter++; // player image changes in every 10 frames
        if(spriteCounter > 10){
            if(spriteNum == 1){
                spriteNum = 2;
            }
            else if(spriteNum ==  2){
                spriteNum = 1;
            }
            spriteCounter = 0;
        }
    }

    public void draw(Graphics2D graphics2D){
        BufferedImage image = null;
        switch(direction){
            case "up":
                if(spriteNum == 1){
                    image = up1;
                }
                if(spriteNum == 2){
                    image = up2;
                }
                break;
            case "down":
                if(spriteNum == 1){
                    image = down1;
                }
                if(spriteNum == 2){
                    image = down2;
                }
                break;
            case "left":
                if(spriteNum == 1){
                    image = left1;
                }
                if(spriteNum == 2){
                    image = left2;
                }
                break;
            case "right":
                if(spriteNum == 1){
                    image = right1;
                }
                if(spriteNum == 2){
                    image = right2;
                }
                break;
        }
        graphics2D.drawImage(image, x, y, gp.tileSize, gp.tileSize, null); // image observer, you can't type here
    }
}
