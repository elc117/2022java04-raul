// -------------- Classe mae por Raul Steinmetz --------------//
//  A ideia é que essa classe representa um inimigo em um jogo 2D
//  -> Dicas de classes que herdam ela:
//      - Boss (Inimigo mais forte, com ataque especial)
//      - Diversos MOBS com funcionalidades diferentes
//  -> Exemplos de nome de classe filha:
//      - Zumbi
//      - Fantasma
// -----------------------------------------------------------//



public class Enemy {
    private int health;
    private float xPosition;
    private float yPosition;

    private float power;

    public Enemy(int health, float xPosition, float yPosition, float power)
    {
        this.health = health;
        this.power = power;
        this.xPosition = xPosition;
        this.yPosition = yPosition;
    }

    public float getxPosition() {
        return xPosition;
    }

    public void setxPosition(float xPosition) {
        this.xPosition = xPosition;
    }

    public float getyPosition() {
        return yPosition;
    }

    public void setyPosition(float yPosition) {
        this.yPosition = yPosition;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void Scream()
    {
        System.out.println("I am going to kill you!!!");
    }

    public void takeHit(int power)
    {
        health -= power;
    }
}
