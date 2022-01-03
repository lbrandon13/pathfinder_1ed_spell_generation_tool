import java.io.ObjectInputStream.GetField;

public class App {
    public static void main(String[] args) throws Exception {
        Character testCharacter = new Character("test", 18, "wizard", 5);

        System.out.println(testCharacter.getId());
        System.out.println(testCharacter.getCastingStatValue());
        System.out.println(testCharacter.getCharacterClassValue());
        System.out.println(testCharacter.getCharacterLevelValue());
    }

    static class Character {
        
        private int id;
        private int castingStatValue;
        private String characterClassValue;
        private int characterLevelValue;
        private int[][] spellList;

        public Character(String name, int casting_stat, String character_class, int character_level) {
            
            // in time replace with function to turn string value to int to form unique identifier
            try {
                id = Integer.parseInt(name);
            }
            catch (NumberFormatException e) {
                id = 0;
            }
            castingStatValue = casting_stat;
            characterClassValue = character_class;
            characterLevelValue = character_level;
        }

        public int getId() {
            return id;
        }

        public int getCastingStatValue() {
            return castingStatValue;
        }

        public String getCharacterClassValue() {
            return characterClassValue;
        }

        public int getCharacterLevelValue() {
            return characterLevelValue;
        }
    }
}
