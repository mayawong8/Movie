import java.util.ArrayList;

public class MayaMovieTestProgram {

        public static void main (String[] args) {
            //Testing MayaMovie Class
            MayaMovie test1 = new MayaMovie("Shrek",3,2.00f);
            System.out.println (test1);

            MayaMovie test2 = new MayaMovie("Shrek",3);
            System.out.println (test2);

            MayaMovie test3 = new MayaMovie();
            System.out.println (test3);



                //Create two arrayLists

            ArrayList <MayaMovie> movies = new ArrayList<MayaMovie>();
            ArrayList <MayaMovie> movies2 = new ArrayList<MayaMovie>();
                //Fill lists with 4 movies each

            MayaMovie Shrek = new MayaMovie("Shrek", 3 );
            MayaMovie Up = new MayaMovie("Up", 6);
            MayaMovie Maya = new MayaMovie("Maya", 13, 2.50f);
            MayaMovie ZombieLand = new MayaMovie("ZombieLand", 16);
            movies.add(Shrek);
            movies.add(Maya);
            movies.add(ZombieLand);
            movies.add(Up);
            movies2.add(Shrek);
            movies2.add(Maya);
            movies2.add(ZombieLand);
            movies2.add(Up);

//Add a premium of 2.50 to the second movie in each arrayList

//Create one theater using your 2 parameter constructor
//theater1 should have 100 passes
            MayaMovieTheater theater1 = new MayaMovieTheater("Cineplex", (short) 100, (short)1000);
                theater1.movieList = movies;
//Create one theater using your 3 parameter constructor
//theater2 should have 250 passes
            MayaMovieTheater theater2 = new MayaMovieTheater("Orleans Theater", (short) 250, 2000, movies2);

                System.out.println("Here are the theaters at the start:");
                System.out.println(theater1);
                System.out.println(theater2);

                //Add your second arrayList to your theater1

                // Simulate selling passes from different theaters
                theater1.sellPass();
                theater1.sellPass(4);
                theater2.sellPass();
                theater2.sellPass(3);

                /*Simulate selling tickets for various movies from theater1*/
                theater1.sellTickets(5, theater1.movieList.get(0));
                theater1.sellTickets(12,theater1.movieList.get(1));
                theater1.sellTickets(3, theater1.movieList.get(2));
                theater1.sellTickets(10, theater1.movieList.get(3));

                /*Simulate selling tickets for various movies from theater2*/
                theater2.sellTickets(6, theater2.movieList.get(0));
                theater2.sellTickets(18, theater2.movieList.get(1));
                theater2.sellTickets(60, theater2.movieList.get(2));
                theater2.sellTickets(2, theater2.movieList.get(3));


                // Make sure that it all worked
                System.out.println("\nTheater 1 has made " + theater1.getMoneyMade());
                System.out.println("Theater 2 has made " + theater2.getMoneyMade());
                System.out.println("\nHere are the theaters at the end:");
                System.out.println(theater1);
                System.out.println(theater2);
        }
}










