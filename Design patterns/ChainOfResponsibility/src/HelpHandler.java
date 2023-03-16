public interface HelpHandler {
    boolean hasHelp();
    void setHandler(HelpHandler handler, Topic topic);
    void handleHelp();
}

class DefaultHelpHandler implements HelpHandler {
    private HelpHandler successor;
    private Topic topic;

    public DefaultHelpHandler(HelpHandler successor, Topic topic) {
        this.successor = successor;
        this.topic = topic;
    }

    @Override
    public boolean hasHelp() {
        return topic.getTopicId() != Topic.NO_HELP_TOPIC;
    }

    @Override
    public void setHandler(HelpHandler handler, Topic topic) {
        this.successor = handler;
        this.topic = topic;
    }

    @Override
    public void handleHelp() {
        if (successor != null) {
            successor.handleHelp();
        }
    }
}
