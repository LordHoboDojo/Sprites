public class MoblieSprite extends Sprite {
    private double vx,vy;

    public MoblieSprite(double x, double y, int width, int height, String image,double vx,double vy) {
        super(x, y, width, height, image);
        this.vx = vx;
        this.vy = vy;
    }

    @Override
    public void step(World world) {
        super.setX(super.getX()+vx);
        super.setY(super.getY()+vy);
    }

    public double getVx() {
        return vx;
    }

    public void setVx(double vx) {
        this.vx = vx;
    }

    public double getVy() {
        return vy;
    }

    public void setVy(double vy) {
        this.vy = vy;
    }
}
