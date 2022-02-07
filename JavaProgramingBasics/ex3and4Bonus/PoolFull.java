package ex3and4Bonus;

import java.util.Scanner;

public class PoolFull {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int capacity = Integer.parseInt(scanner.nextLine());
        int pipe_1 = Integer.parseInt(scanner.nextLine());
        int pipe_2 = Integer.parseInt(scanner.nextLine());
        double time = Double.parseDouble(scanner.nextLine());
        double pool;
        double pipe1_percent;
        double pipe2_percent;

        pool = (pipe_1 * time) + (pipe_2 * time);

        pipe1_percent = pipe_1 * time;
        pipe1_percent = pool / pipe1_percent;
        pipe1_percent = 100 / pipe1_percent;

        pipe2_percent = pipe_2 * time;
        pipe2_percent = pool / pipe2_percent;
        pipe2_percent = 100 / pipe2_percent;

        if(pool <= capacity){
            pool = capacity / pool;
            pool = 100 / pool;
            System.out.printf("The pool is %.2f%% full. Pipe 1: %.2f%%. Pipe 2: %.2f%%.", pool, pipe1_percent, pipe2_percent);
        }
        else{
            pool = pool - capacity;
            System.out.printf("For %.2f hours the pool overflows with %.2f liters.", time, pool);
        }
    }
}
