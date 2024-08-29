import org.example.Livro;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LivroTest {

    Livro livro = new Livro("Dom Casmurro", "Machado de Assis", "1998");

    @Test
    public void testGetTitulo(){
        assertEquals("Dom Casmurro", livro.getTitulo());
    }

    @Test
    public void testEmprestar(){
        assertTrue(livro.getDisponivel());
        livro.emprestar();
        assertFalse(livro.getDisponivel());
    }

    @Test
    public void testDevolver(){
        livro.emprestar();
        assertFalse(livro.getDisponivel());
        livro.devolver();
        assertTrue(livro.getDisponivel());
    }

}
