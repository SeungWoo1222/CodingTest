import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        ArrayList<Integer> arr = new ArrayList<>();

        int len = Integer.parseInt(br.readLine());

        // arr 삽입
        for (int i=0; i<len; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            arr.add(x);
        }

        // 정렬
        arr.sort(Comparator.naturalOrder());

        // arr 출력
        for (int j=0; j<arr.size(); j++) {
            int y = arr.get(j);
            bw.write(y + "\n");
        }

        br.close();

        bw.flush();
        bw.close();
    }
}
