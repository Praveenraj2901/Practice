package basics;

public class StringBuilderEx {
	public static void main(String[] args) {
		/*
		 * String name = "Praveen"; name.concat("Raj"); System.out.println(name);
		 * StringBuilder sb = new StringBuilder("Praveen"); sb.append("raj");
		 * sb.insert(sb.indexOf("r",2)," ");
		 * sb.replace(sb.indexOf(" "),sb.indexOf("r",5),"");
		 * sb.delete(sb.indexOf("r",2),sb.length()); sb.reverse();
		 * System.out.println(sb); StringBuilder sd = new StringBuilder("abc123def");
		 * sd.reverse(); sd.delete(sd.indexOf("1"),sd.indexOf("1")+1);
		 * System.out.println(sd);
		 */
		
		
		StringBuilder nams = new StringBuilder("anime");
		String add = "ay";
		for(int i = 0; i<nams.length(); i++) {
		//	for(int j = i+1; j<nams.length(); j++) {
			if(nams.charAt(i)=='a'||nams.charAt(i)=='e'||nams.charAt(i)=='i'||nams.charAt(i)=='o'||nams.charAt(i)=='u') {
				continue;}
			else {
			//	if(nams.charAt(j)!='a'||nams.charAt(j)!='e'||nams.charAt(j)!='i'||nams.charAt(j)!='o'||nams.charAt(j)!='u') {
				nams.append(nams.charAt(i));
			//	nams.append(nams.charAt(j));
				nams.append(add);
				nams.deleteCharAt(i);
			//	nams.deleteCharAt(j);
				break;
				}
		//	}
		//	}
		}
		System.out.println(nams);
	}

}
