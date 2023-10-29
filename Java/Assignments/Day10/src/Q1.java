import java.awt.*;

class MovingCircle extends Frame implements Runnable{
    Thread t1, t2, t3;
    int baseX, baseY, x1, x2;

    public MovingCircle() {
        baseX=200;
        baseY=200;
        t1 = new Thread(this, "one");
        t2 = new Thread(this, "two");
        t3 = new Thread(this, "three");
        t1.start();
        t2.start();
        t3.start();
    }

    @Override
    public void paint(Graphics g)
    {
        // Paint the circle
        g.setColor(Color.YELLOW);
        g.fillOval(baseX, baseY, 50, 50);
        g.setColor(Color.BLUE);
        g.fillOval(x1, x2, 50, 50);
    }

    public void run() {
        while(true) {
            if(Thread.currentThread() == t1){
                baseX++;
                baseY++;
                if(baseX == this.getWidth() - 100)
                    baseX = 200;
                if(baseY == this.getWidth() - 100)
                    baseY = 200;
                try{
                    Thread.sleep(10);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
            if(Thread.currentThread() == t2){
                x1++;
                x2--;
                if(x1 == this.getWidth() - 100)
                    baseX = 300;
                if(x2 == this.getWidth() - 100)
                    baseY = 300;
                try{
                    Thread.sleep(20);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
            repaint();
        }
    }
}


public class Q1 {
    public static void main(String[] args){
        MovingCircle fr = new MovingCircle();
        fr.setSize(700, 700);
        fr.setVisible(true);
    }
    
}
