public class Cube {
    int side;

    public Cube() {
        this.side = 1;
    }

    public Cube(int cubeLength) {
        setSide(cubeLength);
    }

    public void setSide(int newSide) {
        if (newSide < 1) {
            throw new IllegalArgumentException("A cube’s side length must be equal to or greater than 1!");
        }
        this.side = newSide;
    }

    public int getSide() {
        return this.side;
    }

    public int calculateVolume() {
        return side * side * side;
    }

    public int calculateSurfaceArea() {
        return side * side * 6;
    }
}
