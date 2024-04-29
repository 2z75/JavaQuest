public class Movies {
    public static void main(String[] args) {
        String[] films = {"Indiana Jones et les Aventuriers de l'arche perdue",
                          "Indiana Jones et le Temple maudit",
                          "Indiana Jones et la Dernière Croisade"};

        String[][] actors = {{"Harrison Ford", "Karen Allen", "Paul Freeman"},
                              {"Harrison Ford", "Kate Capshaw", "Jonathan Ke Quan"},
                              {"Harrison Ford", "Sean Connery", "Denholm Elliott"}};

        for (int i = 0; i < films.length; i++) {
            System.out.print("Dans le film " + films[i] + ", les principaux acteurs sont : ");
            for (int j = 0; j < actors[i].length; j++) {
                System.out.print(actors[i][j]);

                if (j < actors[i].length - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println();
        }
    }
}
