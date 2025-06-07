package javabasics.day5;

public class course {
    String cName;
    int duration; 

    public course(String cName, int duration) {
        this.cName = cName;
        this.duration = duration;
    }
    public static void main(String[] args) {
        course c1 = new course("Java full stack",4);
        c1.learn();

        course c2 = new course("DSA",7);
        c2.learn();
    }

    public void learn(){
        System.out.println("we are learning: "+ cName +"\nfor duration: "+ duration);
    }
}


