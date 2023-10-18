package petshop.amigao;

import java.util.ArrayList;
import java.util.List;

public class Agenda {
    private List<Agendamento> horariosAgendados;

    public Agenda() {
        this.horariosAgendados = new ArrayList<>();
    }

    //Método para verificar a disponibilidade de horário
    public boolean horarioDisponivel(Agendamento novoAgendamento) {
        for(Agendamento agenda : horariosAgendados){
            if(agenda.equals(novoAgendamento)) {
                // Esse horário já está agendado
                return false;
            }
        }
        //Esse horário está disponível
        return true;
    }

    // Método da classe
    public void agendamento(Agendamento novoHorario) {
        if (horarioDisponivel(novoHorario)) {
            horariosAgendados.add(novoHorario);
            System.out.println("Agendamento realizado " + novoHorario);
        } else System.out.println("Erro ao tentar realizar o agendamento.");
    }
}
