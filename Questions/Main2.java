/* Suppose player Peter and Alex and Enemy with name Lotus and Jack. you have to create a scenario such that
 crate a object of Player name Peter and Alex and Enemy with name Lotus and Jack, there is a integer type name
 energy with initial value 6 and noOfBullets with initial value 12 , method with name play and kill when ever
 method  play and kill is called no of bullets decrease by one. Also tell how many bullets are fired.(Extra//
  also display no of bullets fired.)
 */



class Game{
       static  int noOfBullets=12;
       static int energy=6;
        static int count;
      public void play(){
          noOfBullets --;
            count++;
    }
    public void kill(){
       noOfBullets --;
         energy --;
         count ++;
    }
      static void display (){
         System.out.println("No of Bullets left is: " +noOfBullets );
         System.out.println("No of Energy left is: " +energy );
          System.out.println("NO of bullets fired are:" +count);
     }


}

public class Main2 {
    public static void main(String[] args) {
        Game Peter=new Game();
        Game Alex=new Game();      // creating objects
        Game Lotus=new Game();
        Game Jack=new Game();


        Peter.play();
        Alex.kill();
                                   // calling methods
        Lotus.kill();
        Jack.play();

        Game.display();         // display result

    }
}
