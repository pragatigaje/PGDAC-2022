class BookSeats
{
	int total_seats = 10;
	synchronized void bookSeat(int seats)
	{
		if (total_seats>=seats)
		{
			System.out.println("Seats booked Successfully by : "+Thread.currentThread().getName());
			total_seats-=seats;
			System.out.println("Remaining seats : "+total_seats);
		}
		else
		{
			System.out.println("Seats booking Failed "+Thread.currentThread().getName());
			System.out.println("Remaining seats : "+total_seats);
		}
	}	
}

class SeatBookingDemo extends Thread
{
	static BookSeats b;
	int seats;
	
	public void run()
	{
		b.bookSeat(seats);
	}
	
	public static void main(String args[]) throws Exception 
	{
		b = new BookSeats();
		SeatBookingDemo pragati = new SeatBookingDemo();
		pragati.seats=7;
		pragati.start();
		
		//pragati.join(); jugaad
		SeatBookingDemo pooja = new SeatBookingDemo();
		pooja.seats=6;
		pooja.start();
		
	}
}