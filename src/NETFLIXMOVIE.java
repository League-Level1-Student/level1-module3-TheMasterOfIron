import javax.swing.JOptionPane;

public class NETFLIXMOVIE {
public static void main(String[] args) {
	Movie m1 = new Movie("Fortnite The Movie",-100);
	Movie m2 = new Movie("2018 Youtube Rewind",-50);
	Movie m3 = new Movie("The Dead Memes Movie",0);
	Movie m4 = new Movie("Burger King Foot Lettuce",15);
	Movie m5 = new Movie("Bee Movie",25);
	Movie m6 = new Movie("Never Dying Hope",50);
	Movie m7 = new Movie("The 90s",90);
	Movie m8 = new Movie("P VS T",83000000); 
	m1.getTicketPrice();
	NetflixQueue q = new NetflixQueue();
	q.addMovie(m1);
	q.addMovie(m2);
	q.addMovie(m3);
	q.addMovie(m4);
	q.addMovie(m5);
	q.addMovie(m6);
	q.addMovie(m7);
	q.addMovie(m8);
	q.printMovies();
	q.sortMoviesByRating();
	JOptionPane.showMessageDialog(null, "The best movie is " + q.getBestMovie() + ".");
	JOptionPane.showMessageDialog(null, "The second best movie is " + q.getMovie(1) + ".");
	JOptionPane.showMessageDialog(null, "The third best movie is " + q.getMovie(2) + ".");
JOptionPane.showMessageDialog(null, "The fourth best movie is " + q.getMovie(3) + ".");
JOptionPane.showMessageDialog(null, "The fourth worst movie is " + q.getMovie(4) + ".");
JOptionPane.showMessageDialog(null, "The third worst movie is " + q.getMovie(5) + ".");
JOptionPane.showMessageDialog(null, "The second worst movie is " + q.getMovie(6) + ".");
JOptionPane.showMessageDialog(null, "The worst movie is " + q.getMovie(7) + ".");
}
}
