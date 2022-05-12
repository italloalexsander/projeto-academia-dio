package me.dio.academia.digital.entity.form;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.br.CPF;

import javax.validation.constraints.*;
import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AlunoForm {

  @NotEmpty(message = "Campo obrigatório")
  @Size(min = 3, max = 50, message = "Campo nome deve ter entre {min} e {max} caracteres")
  private String nome;

  @NotEmpty(message = "Campo obrigatório")
  @CPF(message = "'${validatedValue} é inválido")
  private String cpf;

  @NotEmpty(message = "Campo obrigatório")
  @Size(min = 3, max = 50, message = "Campo bairro deve ter entre {min} e {max} caracteres")
  private String bairro;

  @NotNull(message = "Campo obrigatório")
  @Past(message = "Data '${validatedValue} é inválida")
  private LocalDate dataDeNascimento;
}
