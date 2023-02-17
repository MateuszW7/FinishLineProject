public class Player {
    private int space;

    public Player(){
        space = 1;
    }

    public void moveForward(){
        space++;
    }

    public int getSpace(){
        return space;
    }
}
