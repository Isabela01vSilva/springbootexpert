package Isabela01vSilva.github.cursospringbootexpert.produtosapi.todos;

import org.springframework.stereotype.Component;

@Component
public class MailSender {

    public void enviar(String mensagem) {
        System.out.println("Enviado Email: " + mensagem);
    }
}
