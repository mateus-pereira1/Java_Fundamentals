public class Mensagem implements EnviarMensagem {

    private String texto;


    @Override
    public void sms(String text) {
        System.out.println("Enviado sms...");
        System.out.println(text);

    }

    @Override
    public void email(String text) {
        System.out.println("Enviado e-mail...");
        System.out.println(text);
    }

    @Override
    public void redesSociais(String text) {
        System.out.println("Enviado para redes sociais...");
        System.out.println(text);
    }

    @Override
    public void whatsApp(String text) {
        System.out.println("Enviado whatsapp...");
        System.out.println(text);
    }


}
