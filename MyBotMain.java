import org.pircbotx.PircBotX;
import org.pircbotx.hooks.Event;
import org.pircbotx.hooks.Listener;
import org.pircbotx.hooks.ListenerAdapter;
import org.pircbotx.hooks.events.MessageEvent;
import org.pircbotx.hooks.managers.ListenerManager;
import java.util.*;

public class MyBotMain {

    public static void main(String[] args) throws Exception {

        // Now start our bot up.
        PircBotX bot = new PircBotX();

        // Enable debugging output.
        bot.setVerbose(true);      
        
		bot.setName("Z2GGY");
		bot.setLogin("LoungeBot");
		
		bot.setAutoNickChange(true);      

		bot.getListenerManager().addListener(new MyBot());

        // Connect to the IRC server.
        bot.connect("irc.rizon.net");
		

        // Join the #pircbot channel.
        bot.joinChannel("#awesomecougars");
		
		

    }
	
	

}