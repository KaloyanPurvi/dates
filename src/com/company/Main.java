package com.company;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int firstDay=0;

		do{
			System.out.print("The first day of January is (1-7): ");
			firstDay= input.nextInt();
		}while(firstDay<1||firstDay>7);
		//Просто сложих лека проверка, за да не гърми

		System.out.print("Day: ");
		String chosenDayString= input.next();
		System.out.print("Month: ");
		String chosenMonthString= input.next();
		System.out.print("Year: ");
		String chosenYearString= input.next();
		System.out.println(chosenDayString+"/"+chosenMonthString+"/"+chosenYearString);

		//converting them
		int chosenDay=Integer.parseInt(chosenDayString);
		int chosenMonth=Integer.parseInt(chosenMonthString);
		int chosenYear=Integer.parseInt(chosenYearString);


		int firstDayOfMonth=firstDay;
		for(int i=2;i<=chosenMonth;i++){
			if(i==3){
				firstDayOfMonth+=1;
			} else if(i%2==1){
				firstDayOfMonth+=2;
			}else{
				firstDayOfMonth+=3;
			}
		}

		firstDayOfMonth=firstDayOfMonth%7;
		System.out.println("Purviq den ot meseca e: "+firstDayOfMonth);
		int yourDayofWeek=1,yourWeek=1;
		for(int i=firstDayOfMonth;i<=chosenDay;i++){
			yourDayofWeek=i;
			if(chosenDay!=1) {
				if (i % 7 == 0) {
					yourWeek++;
				}
			}
		}



		yourDayofWeek=(chosenDay+firstDayOfMonth-1)%7;
		//System.out.println("Your day is "+ yourDayofWeek+" and the week is "+yourWeek);

		String whichday;
		if(chosenDay<=7){
			whichday="first";
		}else if(chosenDay<=14){
			whichday="second";}
		else if(chosenDay<=21){
			whichday="third";
		}else whichday="last";

		//getting which day of the week our day is
		String day=String.valueOf(yourDayofWeek);
		switch (day){
			case "1":
				day="Monday";
				break;
			case "2":
				day="Tuesday";
				break;
			case "3":
				day="Wednesday";
				break;
			case "4":
				day="Thursday";
				break;
			case "5":
				day="Friday";
				break;
			case "6":
				day="Saturday";
				break;
			case "0":
				day="Sunday";

				break;
			default:
				System.out.println("koStanaE");
		}

		String month=String.valueOf(chosenMonth);
		switch (month){
			case "1":
				month="January";
				break;
			case "2":
				month="February";
				break;
			case "3":
                month="March";
				break;
			case "4":
                month="April";
				break;
			case "5":
                month="May";
				break;
			case "6":
                month="June";
				break;
			case "7":
                month="July";
				break;
			case "8":
                month="August";
				break;
			case "9":
                month="September";
				break;
			case "10":
                month="October";
				break;
			case "11":
                month="November";
				break;
			case "12":
                month="December";
				break;
			default:
				System.out.println("koStanaE");
		}

		System.out.println("Your day is the "+ whichday + " "+ day+" of "+month );
		System.out.println("week: "+yourWeek);

		if(firstDayOfMonth==0){firstDayOfMonth=7;}
		System.out.println("first day of month: "+firstDayOfMonth);
		//the calendar itself
		System.out.println(" M  T  W  T  F  S  S");
		for(int i=0;i<firstDayOfMonth-2;i++){
			System.out.print("   ");
		}
		if(chosenMonth!=1){
		System.out.print("   ");
		}
		if(chosenMonth==2){
			for(int i=1; i<=29;i++){

				if(i>9){
					System.out.print(i +" ");}
				else{
					System.out.print(" "+i +" ");}
				if((i+firstDayOfMonth)%7==1){
					System.out.println();
				}

			}


		}else if(chosenMonth%2==1){
			for(int i=1; i<=31;i++){

				if(i>9){
					System.out.print(i +" ");}
				else{
					System.out.print(" "+i +" ");}
				if((i+firstDayOfMonth)%7==1){
					System.out.println();
				}
			}
		}else{
			for(int i=1; i<=30;i++){
				if(i>9){
					System.out.print(i +" ");}
				else{
					System.out.print(" "+i +" ");}
				if((i+firstDayOfMonth)%7==1){
					System.out.println();
				}
			}
		}



	}
	public static void makingTheCalendar(int firstday){


	}
	public static void checkingWhichDay(int firstday){

	}
}
