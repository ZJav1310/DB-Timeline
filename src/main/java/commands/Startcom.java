package commands;

import net.dv8tion.jda.core.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.core.hooks.ListenerAdapter;

public class Startcom extends ListenerAdapter {

    @Override
    public void onGuildMessageReceived(GuildMessageReceivedEvent ev){

        String[] message = ev.getMessage().getContentRaw().split(" ");


        if(message.length == 1 && message[0].equalsIgnoreCase("!Timeline")) {
            ev.getChannel().sendMessage("To use this command type (without [ ]): !timeline [add] [URL]").queue();
        }
        else if(message[0].equalsIgnoreCase("!Timeline") && message[1].equalsIgnoreCase("add")){
            ev.getChannel().sendMessage("Add what?").queue();
        }
    }
}
