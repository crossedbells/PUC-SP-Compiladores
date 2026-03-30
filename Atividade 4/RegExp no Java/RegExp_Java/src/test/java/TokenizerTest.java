import java.util.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class TokenizerTest {

    @Test
    public void testTokenize(){
        String codigo = "position = initial + rate * 60";
        String regexp = "(?<ID>[a-zA-Z_][a-zA-Z0-9_]*)|(?<NUM>\\d+)|(?<OP>[=+\\-*])";

        List<String[]> tokens = Tokenizer.tokenize(codigo, regexp);

        String[][] esperado = {
                {"ID", "position"},
                {"OP", "="},
                {"ID", "initial"},
                {"OP", "+"},
                {"ID", "rate"},
                {"OP", "*"},
                {"NUM", "60"}
        };

        assertEquals(esperado.length, tokens.size(), "as quantidades de tokens divergem");

        for(int i = 0; i < esperado.length; i++){
            assertArrayEquals(esperado[i], tokens.get(i), "token" + i + "não confere");
        }
    }
}
