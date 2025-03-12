package pokemon;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;



public class CSVController {


    public Map<String,ArrayList<String>> createPokemonList(String filePath, int option) {
        ArrayList<String> pokemons = new ArrayList<String>();
        String line;
        String key="";
        Map<String,ArrayList<String>> hashPokemon = null;
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");
                key = values[0];
                for(int i = 1; i < values.length; i++)
                {
                    pokemons.add(values[i]);
                }
            }
            hashPokemon = FactoryMap.createMap(option);
            hashPokemon.put(key, pokemons);
            pokemons.clear();

        } catch (IOException e) {
            e.printStackTrace();
        }
        return hashPokemon;
    }
}