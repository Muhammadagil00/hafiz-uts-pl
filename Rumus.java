import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


    public class Rumus {
        public static void main(String[] args) {
            String namaFile = "C:\\Users\\ACER\\IdeaProjects\\banng gii\\src\\attacking.csv";
            List<> Rumus = new ArrayList<>();
            try {
                BufferedReader hafiz = new BufferedReader(new FileReader(namaFile));
                String line;
                hafiz.readLine();
                while ((line = hafiz.readLine()) !=null) {
                    String[] row = line.split(",");
                    Main player = new Main();
                    player.serial = Integer.parseInt(row[0]);
                    player.playername = row[1];
                    player.club = row[2];
                    player.posisition = row[3];
                    player.assist = Integer.parseInt(row[4]);

                    ucl.add(player);


                    ucl.size();
                }
            } catch (IOException e){
                System.err.println(e);
            }
            for (int i = 0; i < ucl.size() ; i++) {
                System.out.println(ucl.get(i).playername + " " + ucl.get(i).assist);
            }
        }
    }

}
