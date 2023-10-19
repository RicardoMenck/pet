package petshop.amigao;

import java.util.ArrayList;
import java.util.List;

public class Agenda {
    private List<Agendamento> horariosAgendados;

    public Agenda() {
        horariosAgendados = new ArrayList<>();
    }

    //Método para verificar a disponibilidade de horário
    public boolean horarioDisponivel(Agendamento novoAgendamento) {
        for(Agendamento agenda : horariosAgendados){
            if(agenda.getData().equals(novoAgendamento.getData()) && agenda.getHorario().equals(novoAgendamento.getHorario())) {
                // Já existe um atendimento marcado para o dia e horário indicado
                System.out.println("Horário indisponível!");
                return false;
            }
        }
        //Esse horário está disponível
        horariosAgendados.add(novoAgendamento);
        System.out.println("O seu horário foi agendado para o seu amigo fiel!");
        return true;
    }
}
