package standardClass;

public class Task5 {
	public static void main(String args[]){
		String str = "cat_mouse_mouse_cat_cat";
		String[] strarray = str.split("_"); //文字列を配列化

		int count = 0;
		int count2 = 0;

		for(int i = 0; i < strarray.length; i++) {
			if(strarray[i].equals("cat")) {
				count++	;
				//catの場合にcountを1づつ増やす
			}else if(strarray[i].equals("mouse")){
				count2++;
				//mouseの場合にcountを1づつ増やす
			}
		}
		if(count > count2) {//countとcount2を比べて大きい方を出力
			System.out.println("catの方が多い");
		}else{
			System.out.println("mouseの方が多い");
		}
	}
}