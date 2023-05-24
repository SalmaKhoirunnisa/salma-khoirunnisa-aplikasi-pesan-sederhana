class Main {
    public static void main(String[] args) {
        Message message = new Message("John", "Alice", "Halo, apa kabar?");
        message.send();

        VoiceMessage voiceMessage = new VoiceMessage("Alice", "John", "Halo juga!", 30);
        voiceMessage.send();

        PictureMessage pictureMessage = new PictureMessage("Bob", "Alice", "Lihat foto ini!", "https://example.com/image.jpg");
        pictureMessage.send();
    }
}
