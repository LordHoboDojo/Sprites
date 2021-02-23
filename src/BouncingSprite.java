public class BouncingSprite extends MoblieSprite {
    public BouncingSprite(double x, double y, int width, int height, String image, double vx, double vy) {
        super(x, y, width, height, image, vx, vy);
    }
    private void bounce(){
        if (super.getY() + super.getHeight()/2.0>=600 ||super.getY() - super.getHeight()/2.0<=0) super.setVy(super.getVy()*-1);
        if (super.getX() + super.getWidth()/2.0>=600 ||super.getX() - super.getWidth()/2.0<=0) super.setVx(super.getVx()*-1);
    }
    @Override
    public void step(World world) {
        super.step(world);
        bounce();
    }
}
