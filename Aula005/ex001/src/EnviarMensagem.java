public interface EnviarMensagem {

    void sms(String text);

    void email(String text);
    void redesSociais(String text);
    void whatsApp(String text);
}
