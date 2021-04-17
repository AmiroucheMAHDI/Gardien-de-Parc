package IHM;

import IHM.Assets;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.HashMap;

public class Constantes {
        public static final String PERSPATH="res/textures/pers.png";
        public static final String GARDIEN_UP1_PATH="res/textures/gardien_up1.gif";
        public static final String GARDIEN_UP2_PATH="res/textures/gardien_up2.gif";
        public static final String GARDIEN_LEFT1_PATH="res/textures/gardien_left1.gif";
        public static final String GARDIEN_LEFT2_PATH="res/textures/gardien_left2.gif";
        public static final String GARDIEN_RIGHT1_PATH="res/textures/gardien_right1.gif";
        public static final String GARDIEN_RIGHT2_PATH="res/textures/gardien_right2.gif";
        public static final String GARDIEN_DOWN1_PATH="res/textures/gardien_down1.gif";
        public static final String GARDIEN_DOWN2_PATH="res/textures/gardien_down2.gif";
        public static final String GROUND_PATH="res/textures/ground.png";
        public static final String TREE_PATH="res/textures/tree.png";
        public static final int WINDOW_WIDTH= Assets.getImageWidth(GROUND_PATH)*25 ;
        public static final int WINDOW_HEIGHT=Assets.getImageHeight(GROUND_PATH)*20 ;
        public static final BufferedImage GARDIEN_DOWN1 = Assets.getImage(GARDIEN_DOWN1_PATH);
        public static final BufferedImage GARDIEN_DOWN2 =  Assets.getImage(GARDIEN_DOWN2_PATH);
        public static final BufferedImage GARDIEN_LEFT1 =  Assets.getImage(GARDIEN_LEFT1_PATH);
        public static final BufferedImage GARDIEN_LEFT2 = Assets.getImage(GARDIEN_LEFT2_PATH);
        public static final BufferedImage GARDIEN_RIGHT1 =Assets.getImage(GARDIEN_RIGHT1_PATH);
        public static final BufferedImage GARDIEN_RIGHT2 =Assets.getImage(GARDIEN_RIGHT2_PATH);
        public static final BufferedImage GARDIEN_UP1 =Assets.getImage(GARDIEN_UP1_PATH);
        public static final BufferedImage GARDIEN_UP2 = Assets.getImage(GARDIEN_UP2_PATH);
        public static final BufferedImage GROUND = Assets.getImage(GROUND_PATH);
        public static final BufferedImage TREE = Assets.getImage(TREE_PATH);
}
