import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//        ArrayList<Integer> arr = new ArrayList<>();

        int goal = Integer.parseInt(br.readLine());
        int N = 0;
        int cnt = 0;

//        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
//        int x = Integer.parseInt(st.nextToken());
//        int y = Integer.parseInt(st.nextToken());
//        int z = Integer.parseInt(st.nextToken());

        while (goal > cnt) {
//            System.out.println("cnt : " + cnt);
            N++;
            String strN = String.valueOf(N);
            if (strN.contains("666")) {
//                System.out.println("666이 포함됨, N : " + N + " cnt : " + cnt);
                cnt++;
                if (cnt == goal) {
                    break;
                }
            };
        }
        bw.write(N + "");
        br.close();

        bw.flush();
        bw.close();
    }
}
