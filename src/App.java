public class App {
    public static void main(String[] args) throws Exception {
        Character testCharacter = new Character("test", 18, "wizard", 5);

        Spell testSpell = new Spell("fireball", "evocation", "wizard", 3, "level d6 damage, up to 10");

        System.out.println(testCharacter.getId());
        System.out.println(testCharacter.getCastingStatValue());
        System.out.println(testCharacter.getCharacterClassValue());
        System.out.println(testCharacter.getCharacterLevelValue());

        System.out.println(testSpell.getName());
        
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

        /* 
         * how to handle searching?
         * 
         * first thought is to store spell objects in single hashmap:
         * 
         * makes retrieval easy when key (int) is known
         * however to generate spell list from full hashmap would be very intensive?
         * would loop through each item in hashmap, then extract and compare spell level and spell class vs desired one
         * would store relevant ones in a list?, then randomly pick from that list (with some kind of weighting?)
         * 
         * second thought is to manually store prebuilt lists in various classes, so either instances of a large class, or have extended class
         * so would have a wizard class/instance (for example) which would have 9 list/arrays of possible spells
         * so when adding new spells would need to be added to hashmap and then each instance of the various classes
         * so seems that being able to save the various classes and spells and hashmaps is very important  
         * 
        */
        public void generateSpellList() {

            int maxSpellLevel = 1;
            int numberOfSpells = 1;
            // currently don't include stat bonus extra spells
            if (characterClassValue.equals("wizard") || characterClassValue.equals("druid") ) {
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
            else if (characterClassValue.equals("cleric")) {
                switch (characterLevelValue) {
                    case 1: maxSpellLevel = 1;
                            numberOfSpells = 2;
                            break;
                    case 2: maxSpellLevel = 1;
                            numberOfSpells = 3;
                            break;
                    case 3: maxSpellLevel = 2;
                            numberOfSpells = 3;
                            break;
                    case 4: maxSpellLevel = 2;
                            numberOfSpells = 4;
                            break;
                    case 5: maxSpellLevel = 3;
                            numberOfSpells = 4;
                            break;
                    case 6: maxSpellLevel = 3;
                            numberOfSpells = 4;
                            break;
                    case 7: maxSpellLevel = 4;
                            numberOfSpells = 5;
                            break;
                    case 8: maxSpellLevel = 4;
                            numberOfSpells = 5;
                            break;
                    case 9: maxSpellLevel = 5;
                            numberOfSpells = 5;
                            break;
                    case 10: maxSpellLevel = 5;
                            numberOfSpells = 5;
                            break;
                    case 11: maxSpellLevel = 6;
                            numberOfSpells = 5;
                            break;
                    case 12: maxSpellLevel = 6;
                            numberOfSpells = 5;
                            break;
                    case 13: maxSpellLevel = 7;
                            numberOfSpells = 5;
                            break;
                    case 14: maxSpellLevel = 7;
                            numberOfSpells = 5;
                            break;
                    case 15: maxSpellLevel = 8;
                            numberOfSpells = 5;
                            break;
                    case 16: maxSpellLevel = 8;
                            numberOfSpells = 5;
                            break;
                    case 17: maxSpellLevel = 9;
                            numberOfSpells = 5;
                            break;
                    case 18: maxSpellLevel = 9;
                            numberOfSpells = 5;
                            break;
                    case 19: maxSpellLevel = 9;
                            numberOfSpells = 5;
                            break;
                    case 20: maxSpellLevel = 9;
                            numberOfSpells = 5;
                            break;       
                }
            }
            /*
            for adding once spontaneous casters are handled
            else if (characterClassValue.equals("sorcerer")) {
                switch (characterLevelValue) {
                    case 1: maxSpellLevel = 1;
                            numberOfSpells = 3;
                            break;
                    case 2: maxSpellLevel = 1;
                            numberOfSpells = 4;
                            break;
                    case 3: maxSpellLevel = 1;
                            numberOfSpells = 5;
                            break;
                    case 4: maxSpellLevel = 2;
                            numberOfSpells = 6;
                            break;
                    case 5: maxSpellLevel = 2;
                            numberOfSpells = 6;
                            break;
                    case 6: maxSpellLevel = 3;
                            numberOfSpells = 6;
                            break;
                    case 7: maxSpellLevel = 3;
                            numberOfSpells = 6;
                            break;
                    case 8: maxSpellLevel = 4;
                            numberOfSpells = 6;
                            break;
                    case 9: maxSpellLevel = 4;
                            numberOfSpells = 6;
                            break;
                    case 10: maxSpellLevel = 5;
                            numberOfSpells = 6;
                            break;
                    case 11: maxSpellLevel = 5;
                            numberOfSpells = 6;
                            break;
                    case 12: maxSpellLevel = 6;
                            numberOfSpells = 6;
                            break;
                    case 13: maxSpellLevel = 6;
                            numberOfSpells = 6;
                            break;
                    case 14: maxSpellLevel = 7;
                            numberOfSpells = 6;
                            break;
                    case 15: maxSpellLevel = 7;
                            numberOfSpells = 6;
                            break;
                    case 16: maxSpellLevel = 8;
                            numberOfSpells = 6;
                            break;
                    case 17: maxSpellLevel = 8;
                            numberOfSpells = 6;
                            break;
                    case 18: maxSpellLevel = 9;
                            numberOfSpells = 6;
                            break;
                    case 19: maxSpellLevel = 9;
                            numberOfSpells = 6;
                            break;
                    case 20: maxSpellLevel = 9;
                            numberOfSpells = 6;
                            break;       
                }
            }
            */

            spellList = new int[maxSpellLevel][numberOfSpells];
        }


    }

    static class Spell {

        private String name;
        // change to enum?
        private String school;
        // change to enum?
        // will need multiple instances of same spell with different 
        // spell_class value to allow for same spell at different
        // levels
        private String spellClass;
        private int level;
        private String description;
        // in time add extra variables for determining macro function?

        public Spell(String name, String school, String spellClass, int level, String description) {
                this.name = name;
                this.school = school;
                this.spellClass = spellClass;
                this.level = level;
                this.description = description;
        }

        public String getName() {
                return name;
        }

        public String getSchool() {
                return school;
        }

        public String getSpellClass() {
                return spellClass;
        }

        public int getLevel() {
                return level;
        }

        public String getDescription() {
                return description;
        }
    }
}
