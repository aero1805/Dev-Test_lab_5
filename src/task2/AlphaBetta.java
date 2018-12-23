package task2;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class AlphaBetta {
    private List alpha;
    private List beta;
    int N;

    public AlphaBetta(int N){
        this.N = N;
        this.alpha = new ArrayList();
        this.beta = new ArrayList();
        for(int i = 0; i < N; i++){
            this.alpha.add((int)(Math.random()*199 + 1));
        }
    }



    private void take_beta(){
        int N_b = 0;

        for (int el = 200; el > 0; el--) {
            for (int i = 0; i < this.N; i++) {
                if (this.alpha.get(i).equals(el)){
                    this.beta.add(el);
                    N_b++;
                }
            }
            if (N_b >= 15) return;
        }
    }

    public List getBeta(){
        take_beta();
        return this.beta;
    }

    public void print_betta() throws IOException {
        take_beta();
        for (Object el : this.beta) {
            System.out.print(el + " ");
        }

        FileWriter fw = new FileWriter("Task_2_out");
        for (Object el : this.beta) {
            fw.write( el + " ");
        }
        fw.close();
    }

    public void print_alpha(){
        for (Object el : this.alpha) {
            System.out.println(el + " ");
        }
    }

}
