package sio.tp1bis_javafon;

public class Pokemon {
    private String nom;
    private int attaque;
    private int defense;
    private int vitesse;
    private int attaqueSpeciale;
    private int defenseSpeciale;
    private int pvMax;
    private int pvActuel;
    private String imgStats;
    private String imgFace;
    private String imgDos;
    private String imgNom;
    private Sort s1;
    private Sort s2;
    private Sort s3;
    private Sort s4;

    public Pokemon(String nom, int attaque, int defense, int vitesse, int attaqueSpeciale, int defenseSpeciale, int pvMax, int pvActuel, String imgStats, String imgFace, String imgDos, String imgNom, Sort s1, Sort s2, Sort s3, Sort s4) {
        this.nom = nom;
        this.attaque = attaque;
        this.defense = defense;
        this.vitesse = vitesse;
        this.attaqueSpeciale = attaqueSpeciale;
        this.defenseSpeciale = defenseSpeciale;
        this.pvMax = pvMax;
        this.pvActuel = pvActuel;
        this.imgStats = imgStats;
        this.imgFace = imgFace;
        this.imgDos = imgDos;
        this.imgNom = imgNom;
        this.s1 = s1;
        this.s2 = s2;
        this.s3 = s3;
        this.s4 = s4;
    }

    public String getImgStats() {
        return imgStats;
    }

    public String getImgFace() {
        return imgFace;
    }

    public String getImgDos() {
        return imgDos;
    }

    public String getImgNom() {
        return imgNom;
    }

    public Sort getS1() {
        return s1;
    }

    public Sort getS2() {
        return s2;
    }

    public Sort getS3() {
        return s3;
    }

    public Sort getS4() {
        return s4;
    }

    public String getNom() {
        return nom;
    }

    public int getAttaque() {
        return attaque;
    }

    public int getDefense() {
        return defense;
    }

    public int getVitesse() {
        return vitesse;
    }

    public int getAttaqueSpeciale() {
        return attaqueSpeciale;
    }

    public int getDefenseSpeciale() {
        return defenseSpeciale;
    }

    public int getPvMax() {
        return pvMax;
    }

    public int getPvActuel() {
        return pvActuel;
    }
}
