package UncheckedException;
import java.util.Optional;
public class UncheckedException {
	public static void main(String args[]) throws Exception {
		String str = null;
	Optional<String>optionalStr=Optional.ofNullable(str);
	if(optionalStr.isPresent())
		System.out.println(str.length());
	else
		System.out.println("null values");
	String str1 = "java8";
	Optional<String>optionalStr1=Optional.ofNullable(str1);
	if(optionalStr1.isPresent())
		System.out.println(str1.length());
	else
		System.out.println("null values");
	String str2 = null;
	String optionalStr2 = Optional.ofNullable(str2).orElseThrow(() -> new Exception());
	System.out.println(optionalStr2);
	}
}