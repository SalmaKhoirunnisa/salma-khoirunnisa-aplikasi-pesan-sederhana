class Message {
    private String sender;
    private String receiver;
    private String messageBody;

    public Message(String sender, String receiver, String messageBody) {
        this.sender = sender;
        this.receiver = receiver;
        this.messageBody = messageBody;
    }

    public String getSender() {
        return sender;
    }

    public String getReceiver() {
        return receiver;
    }

    public String getMessageBody() {
        return messageBody;
    }

    public void send() {
        System.out.println("Pesan dari " + sender + " kepada " + receiver + ": " + messageBody);
    }
}

class VoiceMessage extends Message {
    private int duration;

    public VoiceMessage(String sender, String receiver, String messageBody, int duration) {
        super(sender, receiver, messageBody);
        this.duration = duration;
    }

    @Override
    public void send() {
        System.out.println("Pesan suara dari " + getSender() + " kepada " + getReceiver() + ": " + getMessageBody() + ", Durasi: " + duration + " detik");
    }
}

class PictureMessage extends Message {
    private String pictureUrl;

    public PictureMessage(String sender, String receiver, String messageBody, String pictureUrl) {
        super(sender, receiver, messageBody);
        this.pictureUrl = pictureUrl;
    }

    @Override
    public void send() {
        System.out.println("Pesan gambar dari " + getSender() + " kepada " + getReceiver() + ": " + getMessageBody() + ", URL Gambar: " + pictureUrl);
    }
}

