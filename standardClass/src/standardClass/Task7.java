package standardClass;

import java.util.Calendar;

public class Task7 {
	public static void main(String args[]){
		Calendar cal = Calendar.getInstance();//Calendarのオブジェクトを生成

		System.out.print("現在日時: ");
		System.out.print(cal.get(Calendar.YEAR) +"年");
		System.out.print(cal.get(Calendar.MONTH) + 1 +"月");
		System.out.println(cal.get(Calendar.DAY_OF_MONTH) + "日");//現在日を出力

		cal.add(Calendar.DAY_OF_MONTH,+7);//Calenderに7日+

		System.out.print(" 1週間後: ");
		System.out.print(cal.get(Calendar.YEAR) +"年");
		System.out.print(cal.get(Calendar.MONTH) + 1 +"月");
		System.out.println(cal.get(Calendar.DAY_OF_MONTH) + "日");//一週間後の月日を出力

		cal.set(2021,3,22);//Calenderに2021年4月22日をセット
		String[] week = {"","(日)","(月)","(火)","(水)","(木)","(金)","(土)"};//曜日の配列
		int i = cal.get(Calendar.DAY_OF_WEEK);//set後に返却された数宇を変数に代入

		System.out.print("   1年後: ");
		System.out.print(cal.get(Calendar.YEAR) +"年");
		System.out.print(cal.get(Calendar.MONTH) + 1 +"月");
		System.out.print(cal.get(Calendar.DAY_OF_MONTH) + "日");
		System.out.println(week[i]);
	}
}