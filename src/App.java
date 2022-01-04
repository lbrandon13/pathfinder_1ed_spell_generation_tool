public class App {
    public static void main(String[] args) throws Exception {
        Character testCharacter = new Character("test", 18, "wizard", 5);

        System.out.println(testCharacter.getId());
        System.out.println(testCharacter.getCastingStatValue());
        System.out.println(testCharacter.getCharacterClassValue());
        System.out.println(testCharacter.getCharacterLevelValue());
        
        testCharacter.generateSpellList();
        
    }

    static class Character {
        
        private int id;
        private int castingStatValue;
        // change to enum type?
        private String characterClassValue;
        private int characterLevelValue;
        // using simple 2d array will mean each spell level has same max 
        // spells, so either need to have an array for each spell level, or
        // store the available number of each spell as attribute, so can be
        // referred to and will then need to check for nulls when handling 
        // the array
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

        public void generateSpellList() {

            int maxSpellLevel = 1;
            int numberOfSpells = 1;
            // currently don't include stat bonus extra spells
            if (characterClassValue.equals("wizard")) {
                switch (characterLevelValue) {
                    case 1: maxSpellLevel = 1;
                            numberOfSpells = 1;
                            break;
                    case 2: maxSpellLevel = 1;
                            numberOfSpells = 2;
                            break;
                    case 3: maxSpellLevel = 2;
                            numberOfSpells = 2;
                            break;
                    case 4: maxSpellLevel = 2;
                            numberOfSpells = 3;
                            break;
                    case 5: maxSpellLevel = 3;
                            numberOfSpells = 3;
                            break;
                    case 6: maxSpellLevel = 3;
                            numberOfSpells = 4;
                            break;
                    case 7: maxSpellLevel = 4;
                            numberOfSpells = 4;
                            break;
                    case 8: maxSpellLevel = 4;
                            numberOfSpells = 4;
                            break;
                    case 9: maxSpellLevel = 5;
                            numberOfSpells = 4;
                            break;
                    case 10: maxSpellLevel = 5;
                            numberOfSpells = 4;
                            break;
                    case 11: maxSpellLevel = 6;
                            numberOfSpells = 4;
                            break;
                    case 12: maxSpellLevel = 6;
                            numberOfSpells = 4;
                            break;
                    case 13: maxSpellLevel = 7;
                            numberOfSpells = 4;
                            break;
                    case 14: maxSpellLevel = 7;
                            numberOfSpells = 4;
                            break;
                    case 15: maxSpellLevel = 8;
                            numberOfSpells = 4;
                            break;
                    case 16: maxSpellLevel = 8;
                            numberOfSpells = 4;
                            break;
                    case 17: maxSpellLevel = 9;
                            numberOfSpells = 4;
                            break;
                    case 18: maxSpellLevel = 9;
                            numberOfSpells = 4;
                            break;
                    case 19: maxSpellLevel = 9;
                            numberOfSpells = 4;
                            break;
                    case 20: maxSpellLevel = 9;
                            numberOfSpells = 4;
                            break;       
                }
            }

            spellList = new int[maxSpellLevel][numberOfSpells];
        }


    }
}
