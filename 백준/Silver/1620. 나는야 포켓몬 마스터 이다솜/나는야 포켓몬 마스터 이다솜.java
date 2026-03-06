import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//        ArrayList<Integer> arr = new ArrayList<>();

//        int len = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
//        int z = Integer.parseInt(st.nextToken());
        // HashMap에서 key 기반 서칭이 효율이 좋고, Value기반 서칭은 순회O(n) 이기때문에 두 맵을 만들어서 진행
        HashMap<Integer, String> intMap = new HashMap<>();
        HashMap<String, Integer> nameMap = new HashMap<>();

        for (int i = 1; i <= n; i++) {
            String name = br.readLine();
            intMap.put(i, name);
            nameMap.put(name, i);
        }

        // isDigit - 1. 첫글자가 숫자인지 확인, 분기하는 로직
        for (int j = 0; j < m; j++) {
            String target = br.readLine();
            if (Character.isDigit(target.charAt(0))) {
                bw.write(intMap.get(Integer.parseInt(target)) + "\n");
            } else {
                bw.write(nameMap.get(target) + "\n");
            }
        }

        // isDigit - 2. 모든 글자가 숫자인지 확인, 분기하는 로직
//        for (int j=0; j<m; j++) {
//            boolean isInteger = true;
//            String target = br.readLine();
//            for (int k=0; k<target.length(); k++) {
//                if (!Character.isDigit(target.charAt(k))) {
//                    isInteger = false;
//                    break;
//                }
//            }
//            if (isInteger) {
//                bw.write(intMap.get(Integer.parseInt(target)) + "\n");
//            } else {
//                bw.write(nameMap.get(target) + "\n");
//            }
//    }

        br.close();

        bw.flush();
        bw.close();
    }
}
