package es.unileon.prog.date;

public class Date{

	private int day;
	private int month;
	private int year;

	public date(int dia, int mes, int anho){

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
			case 10 numDays=31;
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
			case 2: if((day<= dayOfMonth(month)) && day >=0){
					correctDay=true;
				} 
			case 3: if((day<= dayOfMonth(month)) && day >=0){
					correctDay=true;
				} 
			case 4: if((day<= dayOfMonth(month)) && day >=0){
					correctDay=true;
				} 
			case 5: if((day<= dayOfMonth(month)) && day >=0){
					correctDay=true;
				} 
			case 6: if((day<= dayOfMonth(month)) && day >=0){
					correctDay=true;
				} 
			case 7: if((day<= dayOfMonth(month)) && day >=0){
					correctDay=true;
				} 
			case 8: if((day<= dayOfMonth(month)) && day >=0){
					correctDay=true;
				} 
			case 9: if((day<= dayOfMonth(month)) && day >=0){
					correctDay=true;
				} 
			case 10: if((day<= dayOfMonth(month)) && day >=0){
					correctDay=true;
				} 
			case 11: if((day<= dayOfMonth(month)) && day >=0){
					correctDay=true;
				} 
			case 12: if((day<= dayOfMonth(month)) && day >=0){
					correctDay=true;
				} 
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

	if (isSameDay==true){
		System.out.println("El dia es el mismo");
	}
	
	else {
		System.out.println("El dia no es el mismo");
	}

	if (isSameMonth==true){
		System.out.println("El mes es el mismo");
	}
	
	else {
		System.out.println("El mes no es el mismo");
	}

	if (isSameYear==true){
		System.out.println("El año es el mismo");
	}
	
	else {
		System.out.println("El año no es el mismo");
	}	
}


int getDay (){
	return this.day;
}

void setDay(){
	this.day=day;
}

int getMonth(){
	return this.month;
}

void setMonth(){
	this.day=day;
}

int getYear(){
	return this.year;
}

void setYear(){
	this.year=year;
}


/*
main

	Date date1= new date (dia, mes, anho);
	Date date2= new date (dia, mes, anho);

date1.issameyear(date2);
