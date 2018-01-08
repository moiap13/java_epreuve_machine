public class count_objects extends Thread{
    private static int carre_count;
    private static int cercle_count;
    private static int triangle_count;

    public count_objects()
    {
        carre_count = 0;
        cercle_count = 0;
        triangle_count = 0;
        run();
    }

    public void run() {

        if (draw_zone.array_formes != null) {
            while (draw_zone.array_formes.size() < 60) {
                carre_count = 0;
                cercle_count = 0;
                triangle_count = 0;

                interface_forme f;

                for (int i = 0; i < draw_zone.array_formes.size(); i++) {
                    f = draw_zone.array_formes.get(i);
                    if (f instanceof carre)
                        carre_count++;
                    else if (f instanceof cercle)
                        cercle_count++;
                    else if (f instanceof triangle)
                        triangle_count++;
                }

                System.out.println("Il y a " + carre_count + " Carré(s), " + cercle_count + " Cercle(s) et " + triangle_count + " Triangle(s) de dessinés");
            }
        }
    }
}
