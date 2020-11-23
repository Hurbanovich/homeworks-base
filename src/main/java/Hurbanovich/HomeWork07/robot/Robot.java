package HomeWork07.robot;
import HomeWork07.robot.Hands.SamsungHand;
import HomeWork07.robot.Hands.SonyHand;
import HomeWork07.robot.Hands.ToshibaHand;
import HomeWork07.robot.Head.IHead;
import HomeWork07.robot.Hands.IHand;
import HomeWork07.robot.Head.SamsungHead;
import HomeWork07.robot.Head.SonyHead;
import HomeWork07.robot.Head.ToshibaHeand;
import HomeWork07.robot.Legs.ILeg;
import HomeWork07.robot.Legs.SamsungLeg;
import HomeWork07.robot.Legs.SonyLeg;
import HomeWork07.robot.Legs.ToshibaLeg;


public class Robot implements IRobot {
    private IHead head;
    private IHand hand;
    private ILeg leg;


    public Robot(IHead head, IHand hand, ILeg leg) {
        this.head = head;
        this.hand = hand;
        this.leg = leg;
    }

    public Robot(){}

    public IHead getHead() {
        return head;
    }

    public void setHead(IHead head) {
        this.head = head;
    }

    public IHand getHand() {
        return hand;
    }

    public void setHand(IHand hand) {
        this.hand = hand;
    }

    public ILeg getLeg() {
        return leg;
    }

    public void setLeg(ILeg leg) {
        this.leg = leg;
    }

    @Override
    public void action() {
        head.speek();
        hand.upHand();
        leg.step();
    }
   public static void comparisonPraic(IRobot robot1,IRobot robot2,IRobot robot3){
        robot1.getPrice();
        robot2.getPrice();
        robot3.getPrice();
        int c = Math.max(robot1.getPrice(), robot2.getPrice());
        int result = Math.max(c, robot3.getPrice());

       System.out.printf(" Cтоймость первого робата %d \n стоймость второго робата%d \n " +
               "стоймость третьего робота %d \n самый дорогой робат стоит %d",robot1.getPrice(),robot2.getPrice(),robot3.getPrice(),result);
    }

    /**
     * Get the cost of a robot
     * @return int
     */
    @Override
    public int getPrice(){
        int price = head.getPrice() + hand.getPrice() + leg.getPrice();
        return price;
    }

    public static void main(String[] args) {
        IHead sonyHead = new SonyHead(2456);
        IHand sonyHend = new SonyHand(1342);
        ILeg sonyLeg = new SonyLeg(2045);
        IHead toshibaHead = new ToshibaHeand(2543);
        IHand toshibaHand = new ToshibaHand(1222);
        ILeg toshibaLeg = new ToshibaLeg(2041);
        IHead samsungHead = new SamsungHead(2456);
        IHand samsungHand = new SamsungHand(1942);
        ILeg samsungLeg = new SamsungLeg(1745);
        IRobot robot_1 = new Robot(samsungHead,toshibaHand,sonyLeg);
        IRobot robot_2 =new Robot(sonyHead,samsungHand,toshibaLeg);
        IRobot robot_3 =new Robot(toshibaHead,sonyHend,samsungLeg);
        robot_1.getPrice();
        robot_1.action();
        robot_2.getPrice();
        robot_2.action();
        robot_3.getPrice();
        robot_3.action();
        Robot.comparisonPraic(robot_1,robot_2,robot_3);
    }



}