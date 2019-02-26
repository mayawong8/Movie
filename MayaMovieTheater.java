import java.util.ArrayList;

public class MayaMovieTheater {
    //declaring constants
        static float TICKET_PRICE = 9.50f;
        static float PASS_PRICE = 160.50f;
        //declaring array list
        ArrayList<MayaMovie> movieList;
        String name;
        private float moneyMade;
        short availablePasses;
        int capacity;

        public MayaMovieTheater() {
            //default constructor
            this.movieList = new ArrayList<MayaMovie>();
            this.name = "TBD";
            this.moneyMade = 0;
            this.availablePasses = 0;
            this.capacity = 0;

        }

        public MayaMovieTheater (String t, short ap, int c){
            //constructor that takes a name and an initial # of passes that the theater has available and the capacity.
            this.name = t;
            this.availablePasses = ap;
            this.capacity = c;
        }

        public MayaMovieTheater (String t, short ap, int c,  ArrayList<MayaMovie> movie){
            //constructor that takes a name, an initial number of passes that the theater has available, the capacity and an arrayList of the movies currently playing.
            this.name = t;
            this.availablePasses = ap;
            this.capacity = c;
            this.movieList = movie;
        }

        public float getMoneyMade(){
        //returns moneyMade
            return moneyMade;
        }

        public short setPassesAvailable(short n) {
            //sets the number of monthly passes available
            this.availablePasses = n;
            return n;
        }

        public String nameoutputer (ArrayList<MayaMovie>movies){
            //loops through the array list and sets values, output in tostring
            String out = "";
            for (MayaMovie i:movies){
                out +=i.name + ", ";
            }
            return out;
        }

        public String toString(){
            //returns string
            return this.name + "\n" + "Currently Showing: " + nameoutputer(movieList) + "\n" + "Passes Available: " + availablePasses + "\n" + "Total income: " + moneyMade;
        }

        public void sellPass(){
            //simulates the selling of a monthly pass at this theater, minus 1 to availblePasses and added price
           if (this.availablePasses>0){
               this.moneyMade += getMoneyMade()+ PASS_PRICE;
               this.availablePasses -=1;
           }
           else{
               System.out.println("No passes available");
           }

        }

        public void sellPass(int n){
            //an overloaded sellPass(int n) as above only you are selling n passes
            if (this.availablePasses >=n){
                this.availablePasses -=n;
                this.moneyMade += (PASS_PRICE*n);
            }
        }

        public void sellTickets(int num, MayaMovie aMovie) {
            //simulates the selling of the specified number of tickets at this theater for a specified movie
            if (this.capacity>=num){
                this.moneyMade+=((num*TICKET_PRICE)+(aMovie.premium *num));
                aMovie.setNumPatrons(num);
                this.capacity-=num;
            }
            else {
                //when there is zero availablePasses left
                System.out.println ("no more room");
            }

        }





    }




