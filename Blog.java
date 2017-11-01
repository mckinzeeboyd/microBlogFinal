import java.util.ArrayList;
import static java.lang.System.out;
import java.util.Scanner;

public class Blog

{
    Scanner keyboard = new Scanner(System.in);
    public static void main(String[] args)
    {
        int selection;
        Scanner keyboard = new Scanner(System.in);
        boolean blogging = true;
        ArrayList<User> allUsers = new ArrayList<User>();
        ArrayList<Content> createdPosts = new ArrayList<Content>();

        String currentUser = "";
        int i = 0;

        do
        {
            printMenu();
            out.println("You are currently the user: \n" + currentUser);
            selection = keyboard.nextInt();
            keyboard.skip("\n");
            if(selection<1 || selection>6)
            {
                out.println("I'm sorry you have selected an invalid option.");
            }
            if(selection ==1)
            {
                out.println("Ok, to make a new account, we need some information.");
                out.println("Please enter your first and last name.");
                String name = keyboard.nextLine();
                out.println("Ok, now I need you to come up with a screen name.");
                String screenName = keyboard.nextLine();
                out.println("Next we need a url to a pic for your profile.");
                String picUrl = keyboard.nextLine();
                out.println("Now we need an email address to keep in contact.");
                String emailAdd = keyboard.nextLine();

                allUsers.add(new User(screenName,name,picUrl,emailAdd));
                out.println("Thanks for making an account with us, now you can login from the menu below.");
            }
            if(selection ==2)
            {
                out.println("To become an existing user, please enter the number that corresponds to the username you wish to be.");

                for(i=0; i<allUsers.size(); i++)
                {
                    out.println((i+1) + "\n" + allUsers.get(i).getUserInfo() + "\n");

                }
                int userSelect = keyboard.nextInt();
                currentUser = allUsers.get(userSelect-1).getUserInfo();
                out.println("You are now the user: \n" + currentUser + "\n\n");
            }
            if(selection ==3)
            {
                if(currentUser.equals(""))
                {
                    out.println("I'm sorry, you need to become a user first to make a post!");
                }
                else
                {
                    out.println("To enter your post, just type a message and hit enter!");
                    String newPost = keyboard.nextLine();
                    String userPosting = currentUser;
                    createdPosts.add(new Content(newPost, currentUser));

                }
            }
            if(selection ==4)
            {
                out.println("Here's a list of everything that has been posted in MicroBlog v.2");
                for(i=0; i<createdPosts.size(); i++)
                {
                    out.println("\n" + createdPosts.get(i).getContent() + "\n");
                }
            }
            if(selection == 5)
            {
                out.println("Here's a current list of all users who have signed up with MicroBlog v.2");
                for(i=0; i<allUsers.size(); i++)
                {
                    out.println("" + allUsers.get(i).getUserInfo()+ "\n");
                }
            }
            if(selection==6)
            {
                out.println("Good bye " + currentUser + " see you next time.");
                blogging = false;
            }

        }while(blogging);


    }
    public static void printMenu()
    {
        out.println("\nWelcome to MicroBlog v.2");
        out.println("Please select an item from the Main Menu:");
        out.println("1) Create a new user");
        out.println("2) Become an existing user");
        out.println("3) Create a post as the current user");
        out.println("4) Print all posts");
        out.println("5) Print all users");
        out.println("6) Logout\n");

    }


}
