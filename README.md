import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.entities.Message;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class HelloBot extends ListenerAdapter {

  public statics void main(String[] args) throws Exception {

    JDABulider.createDefault("YOUR_BOT_TOKEN")
            .addEventListeners(new HelloBot()).build();
    }
    @Override
    public void onMessageReceived(MessageReceivedEvent event) {
      Message message = event.gegtMessage();
      String content = message.getContentRaw();

      if (content.equalsIgnoreCase("안녕")) {
          event.getChannel().sendMessage("안녕하세요!").queue();
      }
    }
}
