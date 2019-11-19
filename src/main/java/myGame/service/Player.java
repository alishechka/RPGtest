package myGame.service;

public class Player {

    private  int HP=100;
    private  int DMG=10;
    private int DEF=0;

    public void getStatus(){
        System.out.println("HP: "+HP
                            +" DMG: "+DMG
                            +" DEF: "+DEF);
    }
    public int getDEF() {
        return DEF;
    }

    public void setDEF(int DEF) {
        this.DEF = DEF;
    }

    public Player() {
    }

    public int getHP() {
        return HP;
    }

    public void setHP(int HP) {
        this.HP = HP;
    }

    public int getDMG() {
        return DMG;
    }

    public void setDMG(int DMG) {
        this.DMG = DMG;
    }
}
