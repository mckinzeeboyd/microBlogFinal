import static java.lang.System.out;
import java.util.Scanner;

public class Content
{
    private String content;
    private String whatUserPosted;

    public String getContent()
    {
        return content + "\n" + whatUserPosted;
    }
    Content(String postCont, String userPosted)
    {
        this.content = postCont;
        this.whatUserPosted = userPosted;
    }
}