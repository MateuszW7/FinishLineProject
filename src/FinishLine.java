public class FinishLine {

    public FinishLine(){}

    public static boolean willMove(int dice1, int dice2, int space){
        int nextSpace = space + 1;
        if(dice1+dice2==nextSpace){
            System.out.println(dice1 + " and " + dice2 + " add up to " + nextSpace + "! You move to the next space(" + nextSpace + ")");
            return true;
        }
        if(dice1==nextSpace){
            System.out.println(dice1 +" equals " + nextSpace + "! You move to the next space(" + nextSpace + ")");
            return true;
        }
        if(dice2==nextSpace){
            System.out.println(dice2 +" equals " + nextSpace + "! You move to the next space(" + nextSpace + ")");
            return true;
        }
        System.out.println("You cannot advance, try again next turn!");
        return false;
    }
}
