
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pokemon.CSVController;
import java.util.ArrayList;
import java.util.Map;
import static org.junit.jupiter.api.Assertions.*;

public class CSVControllerTest {

    private CSVController csvController;

    @BeforeEach
    public void setUp() {
        csvController = new CSVController();
    }

    @Test
    public void testCreatePokemonList_ValidFile() {
        String filePath = "../../main/java/pokemon/pokemon_data_pokeapi.csv";
        int option = 1; 

        Map<String, ArrayList<String>> result = csvController.createPokemonList(filePath, option);

        assertNotNull(result);
        assertFalse(result.isEmpty());
        assertTrue(result.containsKey("Pikachu"));
        assertEquals(9, result.get("Pikachu").size());
    }

    @Test
    public void testCreatePokemonList_InvalidFile() {
        String filePath = "../../main/java/pokemon/pokemon_data_pokeapi.csv";
        int option = 1;

        Map<String, ArrayList<String>> result = csvController.createPokemonList(filePath, option);

        assertNull(result);
    }



    @Test
    public void testCreatePokemonList_InvalidOption() {
        String filePath = "../../main/java/pokemon/pokemon_data_pokeapi.csv";
        int option = -1; // Assuming -1 is an invalid option for FactoryMap.createMap

        Map<String, ArrayList<String>> result = csvController.createPokemonList(filePath, option);

        assertNull(result);
    }
}