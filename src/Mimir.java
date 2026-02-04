import java.time.format.ResolverStyle;

public class Mimir {
    public static void main(String[] args) {
        Mimir magiceightball = new Mimir();
    }

    public Mimir() {
        String Question;
        String Response0;
        String Response1to3;
        String Response4to6;
        String Response7to9;
        String Response10;
        int randomInt;
        randomInt = (int) (Math.random() * 11);
        Question = "Oh great Mimir tell me my future..... Will I get a good grade on my parahgraph for history?";
        Response0 = "Yeah defenlitly not happing. Just dont even think about it";
        Response1to3 = "ok lowkey can't tell you. Youll just have to wait and find out";
        Response4to6 = "Yes no yes no yes no yes no. I dont know figure it out your self";
        Response7to9 = "Yess Defitninly but with a twist. That may inculde spinousreses";
        Response10 = "YESS YESS YESS Defitninly  ";

        System.out.println(Question);
        System.out.println("MMM MM HMMMM Yes I see it, with the power of the nine realms!!!(You see a twinkle in his eyes ");
        System.out.println(randomInt);
        if (randomInt==0){
            System.out.println(Response0);

        }
        if (randomInt>=1 && randomInt <=3){
            System.out.println(Response1to3);

        }
        if (randomInt>=4 && randomInt <=6){
            System.out.println(Response4to6);

        }

        if (randomInt>=7 && randomInt <=9){
            System.out.println(Response7to9);

        }

        if (randomInt==10){
            System.out.println(Response10);

        }


    }

}





/*/ New responses
Response0 = "Yeah defenlitly not happing. Just dont even think about it";
Response1to3 = "ok lowkey can't tell you. Youll just have to wait and find out";
Response4to6 = "Yes no yes no yes no yes no. I dont know figure it out your self";
Response7to9 = "Yess Defitninly but with a twist. That may inculde spinousreses";
Response10 = "YESS YESS YESS Defitninly  ";/*/






// OG RESPONSES
// Response0 = "oh oh oh No, I have never seeen a future, so dark,violent,gortesque and, just sad ,in all of the nine realms! WHAT EVER YOU DO DON'T EVEN THINK ABOUT IT!! I SEE GREAT PAIN, SPINOSURESE'S, AND DESTORUCION. THIS IS A HORRIBLE VISION. I CAN'T HANDLE IT, NOT EVEN THOR and ODIN COULD HANDLE THIS, I JUST CAN'T.... SELF DESTRUCT IN 3...2...1 :O ";
//        Response1to3 = " oh dear i see it, DEFENILTY NOT! THIS IS THE A BAD IDEA DO NOT DO THIS IT WILL NOT END WELL, only somone as sick as Loki would fine this acceptable :(";
//        Response4to6 = "ok ok ok I have some good news and some bad news. It not looking as bad as Hel but its no Freya either. It is uncertiean, :| ";
//        Response7to9 = "All right, this looks good. You can do it!!! I see great happiness and peace, just like Fólkvangr. This is will go well. It will hurt you more if you don't do it. Have fun :)";
//        Response10 = "oh oh oh I have never seen somthing so beutiful in all of the nine realms, the gods have blessed you, SO MUCH HAPPINES,HOPE AND PEACE, it's bettter than Valhalla it's self. Go DO IT write away, Its amazing the things that will happen as a result. The positive emotions are too MUCH, I can't handle it.....SELF DESTRUCT IN 3...2...1 :)))  ";