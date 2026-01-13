public class Loops {
    public static void main(String[] args) {
        Loops myCount= new Loops();

    }//main method

       public Loops() {
        CountDown();


           //call counting methods in here
       }
       public void Countup(){
           for(int x=1; x<6; x=x+1){
               System.out.println(x);
           }



       }

       public void CountByThrees(){
           for(int y = 3; y <16; y = y +3){
               System.out.print(y);
           }


       }
       public void CountDown(){
           for(int z = 10; z>0; z = z -1){
               System.out.print(z);

           }
           System.out.println("Happy Loop Year");




       }
       public void nestedLoop(){

        for(int y=1; y<6; y=y+1){
            for(int x=0; x<y; x=x+1){
                System.out.print(y);
            }
            System.out.println("\n");



        }


       }

}
