import java.util.*;
class Rectangle implements Comparable<Rectangle>{
  private int width;
  private int height;

  public Rectangle(int width, int height){
    this.width = width;
    this.height = height;
  }
    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public int getArea() {
        return width * height;
    }

    public int getPerimeter() {
        return 2 * (width + height);
    }
  @Override
  public int compareTo(Rectangle other){
    return Integer.compare(getPerimeter(), other.getPerimeter());
  }
  @Override
    public String toString() {
        return "Rectangle{" +"width=" + width +", height=" + height +", area=" + getArea() +", perimeter=" + getPerimeter() +'}';
    }
}
class AreaComparator implements Comparator<Rectangle> {
    @Override
    public int compare(Rectangle rect1, Rectangle rect2) {
        return Integer.compare(rect1.getArea(), rect2.getArea());
    }
}
public class RectangleDemo {
    public static void main(String args[]) {
        List<Rectangle> rectangles = new ArrayList<Rectangle>();
        rectangles.add(new Rectangle(4, 7));
        rectangles.add(new Rectangle(5, 9));
        rectangles.add(new Rectangle(6, 4));

        System.out.println("Before sorting:");
        for (Rectangle r : rectangles) {
            System.out.println(r);
        }

        rectangles.sort(new AreaComparator());
        System.out.println("After sorting by area:");
        for (Rectangle r : rectangles) {
            System.out.println(r);
        }

        Collections.sort(rectangles);
        System.out.println("After sorting by perimeter:");
        for (Rectangle r : rectangles) {
            System.out.println(r);
        }
    }
}
