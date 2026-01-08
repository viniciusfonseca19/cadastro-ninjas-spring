package team.horizon.CadastroDeNinjas.Missoes;

import jakarta.persistence.*;
import team.horizon.CadastroDeNinjas.Ninjas.NinjaModel;

@Entity
@Table(name = "tb_missoes")
public class MissoesModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    private String dificuldade;

    @Transient
    private NinjaModel ninja;


}
