package br.com.estabulo;

import br.com.estabulo.dto.AlunoDTO;

import java.util.List;

public class AlunosBase {
    public List<AlunoDTO> listarTodos(){
        var luiz = new AlunoDTO("Luiz", "123");
        var douglas = new AlunoDTO("Douglas", "345");
        var augusto = new AlunoDTO("Augusto", "678");

        return List.of(luiz, douglas, augusto);
    }
}
