public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    }

    class Character {
        
        private int id;
        private int casting_stat_value;
        private String character_class_value;
        private int character_level_value;
        private int[][] spell_list;

        public Character (String name, int casting_stat, String character_class, int character_level) {
            
            id = Integer.parseInt(name);
            casting_stat_value = casting_stat;
            character_class_value = character_class;
            character_level_value = character_level;
        }

    }
}
