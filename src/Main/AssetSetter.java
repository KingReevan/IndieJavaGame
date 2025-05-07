package Main;

import object.*;

public class AssetSetter {
    GamePanel gp;
    public AssetSetter(GamePanel gp){
        this.gp = gp;
    }
    public void setObject(){
        gp.obj[0] = new OBJ_Key();
        gp.obj[0].worldX = gp.tileSize;
        gp.obj[0].worldY = gp.tileSize;

        gp.obj[1] = new OBJ_Key();
        gp.obj[1].worldX = 7 * gp.tileSize;
        gp.obj[1].worldY = gp.tileSize;

        gp.obj[3] = new OBJ_Key();
        gp.obj[3].worldX =  gp.tileSize;
        gp.obj[3].worldY = 21 * gp.tileSize;

        gp.obj[4] = new OBJ_Chest();
        gp.obj[4].worldX = 45 * gp.tileSize;
        gp.obj[4].worldY = gp.tileSize;

        gp.obj[5] = new OBJ_Door();
        gp.obj[5].worldX = 48 * gp.tileSize;
        gp.obj[5].worldY = 3 * gp.tileSize;

        gp.obj[6] = new OBJ_Door();
        gp.obj[6].worldX = 42 * gp.tileSize;
        gp.obj[6].worldY = 2 * gp.tileSize;

        gp.obj[7] = new OBJ_Door();
        gp.obj[7].worldX = 44 * gp.tileSize;
        gp.obj[7].worldY = 7 * gp.tileSize;

        gp.obj[8] = new OBJ_Boots();
        gp.obj[8].worldX = 21 * gp.tileSize;
        gp.obj[8].worldY = 2 * gp.tileSize;

        gp.obj[9] = new OBJ_Key();
        gp.obj[9].worldX = 39 * gp.tileSize;
        gp.obj[9].worldY = 48 * gp.tileSize;

        gp.obj[10] = new OBJ_Boots();
        gp.obj[10].worldX = 45 * gp.tileSize;
        gp.obj[10].worldY = 36 * gp.tileSize;

        gp.obj[11] = new OBJ_Door();
        gp.obj[11].worldX = 3 * gp.tileSize;
        gp.obj[11].worldY = 3 * gp.tileSize;

        gp.obj[12] = new OBJ_Downgrade();
        gp.obj[12].worldX = 42 * gp.tileSize;
        gp.obj[12].worldY = 29 * gp.tileSize;

        gp.obj[13] = new OBJ_Door();
        gp.obj[13].worldX = gp.tileSize;
        gp.obj[13].worldY = 20 * gp.tileSize;

        gp.obj[14] = new OBJ_Key();
        gp.obj[14].worldX = 2 * gp.tileSize;
        gp.obj[14].worldY = 46 * gp.tileSize;

        gp.obj[15] = new OBJ_Boots();
        gp.obj[15].worldX = 18 * gp.tileSize;
        gp.obj[15].worldY = 28 * gp.tileSize;

        gp.obj[16] = new OBJ_Downgrade();
        gp.obj[16].worldX = 4 * gp.tileSize;
        gp.obj[16].worldY = 35 * gp.tileSize;

        gp.obj[17] = new OBJ_Key();
        gp.obj[17].worldX = 14 * gp.tileSize;
        gp.obj[17].worldY = 44 * gp.tileSize;

        gp.obj[18] = new OBJ_Door();
        gp.obj[18].worldX = 4 * gp.tileSize;
        gp.obj[18].worldY = 36 * gp.tileSize;

        gp.obj[19] = new OBJ_Door();
        gp.obj[19].worldX = 8 * gp.tileSize;
        gp.obj[19].worldY = 36 * gp.tileSize;

        gp.obj[20] = new OBJ_Key();
        gp.obj[20].worldX = 28 * gp.tileSize;
        gp.obj[20].worldY = gp.tileSize;
    }
}
