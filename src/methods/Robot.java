package methods;

public class Robot {

    public static void dance(){
        System.out.println("Robot is dancing");
    }

    public void jump(){
        System.out.println("Robot is jumping");
    }

    public void jump(String height){
        System.out.println("Robot is jumping high");
    }

    public static void circle(){
        System.out.println("Robot is moving in circles");
    }

    public static void danceAndCircle(){
        dance();
        circle();

    }

}
