package es.unileon.prog.date;

public class Date{

	private int day;
	private int month;
	private int year;

	public int getDay (){
		return this.day;
	}

	public void setDay(){
		this.day=day;
	}

	public int getMonth(){
		return this.month;
	}

	public void setMonth(){
		this.day=day;
	}

	public int getYear(){
		return this.year;
	}

	public void setYear(){
		this.year=year;
	}

	Date(int dia, int mes, int anho){

		this.day=dia;
		this.month=mes;
		this.year=anho;
	}

	boolean isSameDay(){

		boolean sameDay=false;

		if (this.day()==date2.getDate()){

			sameDay=true;
		}
		
		return sameDay;
	}

	boolean isSameMonth(Date date){

		boolean sameMonth=false;

		if (this.month == date2.getMonth()){

			sameMonth=true;
		}
		
		return sameMonth;
	}

	boolean isSameYear(Date date){

		boolean sameYear=false;

		if (this.year()==date2.getYear()){

			sameYear=true;
		}
		
		return sameYear;
	}

	public int daysOfMonth(int month){

		this.month=month;
		int numDays;
		switch(month){

			case 1:	numDays=31;
			case 2: numDays=28;
			case 3: numDays=31;
			case 4: numDays=30;
			case 5: numDays=31;
			case 6: numDays=30;
			case 7: numDays=31;
			case 8: numDays=31;
			case 9: numDays=30;
			case 10: numDays=31;
			case 11: numDays=30;
			case 12: numDays=31;
		}

		return numDays;
	}

	public boolean dayCorrect(int day, int month){

		correctDay=false;

		switch(month){

			case 1: if((day<= dayOfMonth(month)) && day >=0){
					correctDay=true;
				} 
				break;
			case 2: if((day<= dayOfMonth(month)) && day >=0){
					correctDay=true;
				} 
				break;
			case 3: if((day<= dayOfMonth(month)) && day >=0){
					correctDay=true;
				} 
				break;
			case 4: if((day<= dayOfMonth(month)) && day >=0){
					correctDay=true;
				} 
				break;
			case 5: if((day<= dayOfMonth(month)) && day >=0){
					correctDay=true;
				} 
				break;
			case 6: if((day<= dayOfMonth(month)) && day >=0){
					correctDay=true;
				} 
				break;
			case 7: if((day<= dayOfMonth(month)) && day >=0){
					correctDay=true;
				} 
				break;
			case 8: if((day<= dayOfMonth(month)) && day >=0){
					correctDay=true;
				} 
				break;
			case 9: if((day<= dayOfMonth(month)) && day >=0){
					correctDay=true;
				} 	
				break;
			case 10: if((day<= dayOfMonth(month)) && day >=0){
					correctDay=true;
				} 
				break;
			case 11: if((day<= dayOfMonth(month)) && day >=0){
					correctDay=true;
				} 
				break;
			case 12: if((day<= dayOfMonth(month)) && day >=0){
					correctDay=true;
				} 
				break;
		}
	return correctDay;
	}

	public String nameMonth(int month){

		this.month=month;
		String nameMonth=new String ("");

		switch(month){

			case 1: nameMonth="January";
				break;
			case 2: nameMonth="February";
				break;
			case 3: nameMonth="March";
				break;
			case 4: nameMonth="April";
				break;
			case 5: nameMonth="May";
				break;
			case 6: nameMonth="June";
				break;
			case 7: nameMonth="July";
				break;
			case 8: nameMonth="August";
				break;
			case 9: nameMonth="September";
				break;
			case 10: nameMonth="October";
				break;
			case 11: nameMonth="November";
				break;
			case 12: nameMonth="December";
				break;
		}

		return nameMonth;
	}

	public String nameSeason(int day, int month){


		this.day=day;
		this.month=month;
		String season=new String ("");

		switch (month){

			case 1: season="Winter";
				break;
			case 2: season="Winter";
				break;
			case 3: if(day<23){
					season="Winter";
				}
				else {
					season="Spring";
				}
				break;
			case 4: season="Spring";
				break;
			case 5: season="Spring";
				break;
			case 6: if(day<21){
					season="Spring";
				}
				else {
					season="Summer";
				}
				break;
			case 7: season="Summer";
				break;
			case 8: season="Summer";
				break;
			case 9: if(day<23){
					season="Summer";
				}
				else {
					season="Autumn";
				}
				break;
			case 10: season="Autumn";
				break;
			case 11: season="Autumn";
				break;
			case 12: if(day<21){
					season="Autumn";
				}
				else {
					season="Winter";
				}
				break;
			}

		return season;
	}

	public void sameDate(){

		if (isSameDay==true){
			System.out.println("It's the same day");
		}
	
		else {
			System.out.println("Days are diferent");
		}

		if (isSameMonth==true){
			System.out.println("It's the same month");
		}
	
		else {
			System.out.println("Months are diferent");
		}

		if (isSameYear==true){
			System.out.println("It's the same year");
		}
	
		else {
			System.out.println("Years are diferent");
		}	
	}

	public void monthsUntilEndYear(int month){

		this.month=month;
		int monthEndYear=0;
		for(int i=month; i<= 12; i++){
			monthEndYear++;
		}
		System.out.println(monthEndYear);

	}

	public void printDate(int day, int month, int year){

		System.out.println(day +" / " + month + " / " +year);

	}

	public void datesUntilEndMonth(int day, int month, int year);

		this.day=day;
		this.month=month;
		this.year=year;

		for (int i=day ; i<= daysOfMonth(month); i++){

			System.out.println(i +" / " + month + " / " +year);
		}
	}

	public void monthsSameDays(int month){

		this.month=month;

		for(int i=1; i<=12; i++){
			if (dayOfMonth(month)==dayOfMonth(i)){
				System.out.println(nameMonth(i)/*".\n"*/);
			}
		}
	}

	
}

	public int getDay (){
		return this.day;
	}

	public void setDay(){
		this.day=day;
	}

	public int getMonth(){
		return this.month;
	}

	public void setMonth(){
		this.day=day;
	}

	public int getYear(){
		return this.year;
	}

	public void setYear(){
		this.year=year;
	}
/*
main

	Date date1= new date (dia, mes, anho);
	Date date2= new date (dia, mes, anho);

date1.issameyear(date2);

*/
