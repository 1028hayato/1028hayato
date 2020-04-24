package standardClass;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Task7 {
	public static void main(String args[]){
		Calendar cal = Calendar.getInstance();//Calendarのオブジェクトを生成
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日");

		System.out.print("現在日時: ");
		System.out.println(sdf.format(cal.getTime()) );

		cal.add(Calendar.DAY_OF_MONTH,+7);//Calenderに7日+

		System.out.print(" 1週間後: ");
		System.out.println(sdf.format(cal.getTime()) );//一週間後の月日を出力

		cal.set(2021,3,24);//Calenderに2021年4月22日をセット
		String[] week = {"","(日)","(月)","(火)","(水)","(木)","(金)","(土)"};//曜日の配列
		int i = cal.get(Calendar.DAY_OF_WEEK);//set後に返却された数宇を変数に代入

		System.out.print("   1年後: ");
		System.out.print(sdf.format(cal.getTime()) );
		System.out.println(week[i]);
	}
}