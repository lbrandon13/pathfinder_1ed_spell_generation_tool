import java.io.ObjectInputStream.GetField;

public class App {
    public static void main(String[] args) throws Exception {
        Character testCharacter = new Character("test", 18, "wizard", 5);
    }

    static class Character {
        
        private int id;
        private int castingStatValue;
        private String characterClassValue;
        private int characterLevelValue;
        private int[][] spellList;

        public Character(String name, int casting_stat, String character_class, int character_level) {
            
            id = Integer.parseInt(name);
            castingStatValue = casting_stat;
            characterClassValue = character_class;
            characterLevelValue = character_level;
        }

    }
}
