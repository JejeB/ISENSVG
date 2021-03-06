package fr.geometrie;


import java.awt.*;

class Rectangle extends Figure{


    protected int longueur;
    protected int largeur;

    Rectangle(Point p) {
        super(p);
    }

    Rectangle(Point p, Color c){
        super(p,c);
        longueur = 0;
        largeur = 0;
    }

    Rectangle(int longueur, int largeur){
        super(new Point(0,0));
        this.longueur = longueur;
        this.largeur = largeur;


    }


    public int getLargeur() {
        return largeur;
    }

    public int getLongueur() {
        return longueur;
    }

    public void affichePoint(){

        System.out.println("("+ this.origine.getX()+ "," +this.origine.getY()+")");
    }
    public double getPerimetre(){
        return 2*this.largeur + 2*this.longueur;
    }
    public  double getSurface(){
        return this.largeur * this.longueur;
    }

    public void setBoundingBox(int hauteurBB,int largueurBB){
        this.longueur = hauteurBB;
        this.largeur = largueurBB;
    }

    public void draw(Graphics g){
        g.setColor(c);
        g.fillRect(origine.getX(),origine.getY(),largeur,longueur);
    }
    public void drawDragged(Graphics g){
        g.setColor(c);
        g.drawRect(origine.getX(),origine.getY(),largeur,longueur);

    }
    public String figureName(){
        return "Rectangle " +longueur + ";"+ largeur;
    }
    public void setLargeur(int largeur) {
        this.largeur = largeur;
    }
    public void setLongueur(int longueur) { this.longueur = longueur; }

    public String toString(){
        String result="+";
        String noborder = "|";
        String fin = "";

        for (int i=0;i<this.longueur;i++){
            result +="-";
        }
        result += "+\n";

        for (int j=0;j<this.longueur;j++){
            noborder += " ";
        }
        noborder += "|\n";

        for (int h=0; h<largeur+2; h++){
            if (h == 0 || h == largeur+1){
                fin += result;
            }else {
                fin += noborder;
            }

        }

        return fin;
    }
}
