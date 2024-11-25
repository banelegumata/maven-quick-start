package clinic.programming.training;
import java.util.ArrayList;
import java.util.List;
import org.apache.commons.lang3.StringUtils;
//just new comment to help push file again.
public class Application {
	public int countWords(String words){
		String[] separateWords = StringUtils.split(words, ' ');
		return (separateWords == null) ? 0 : separateWords.length;
	}
    public void greet(){
        List<String> greetings = new ArrayList<>();
        greetings.add("hellow");

        for (String greeting : greetings){
            System.out.println("Greetings: " + greeting);
        }
    }
    public Application() {
        System.out.println ("Inside Application");
    }

    // method main(): ALWAYS the APPLICATION entry point
    public static void main (String[] args) {
    	System.out.println ("Starting Application");
	    Application app = new Application();
        app.greet();
		
		int count = app.countWords(" i have four words");
		System.out.println("word count" + count);
		
		
    }
}