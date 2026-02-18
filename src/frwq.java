import java.util.*;

class frwq {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
       
        int n = sc.nextInt();
        int[] device = new int[n];
        int[] time = new int[n];

        for (int i = 0; i < n; i++) {
            device[i] = sc.nextInt();
            time[i] = sc.nextInt();
        }

        int freq = sc.nextInt();
        int d = sc.nextInt();

        Map<Integer, List<Integer>> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            map.putIfAbsent(device[i], new ArrayList<>());
            map.get(device[i]).add(time[i]);
        }

        List<Integer> ans = new ArrayList<>();

        for (int num : map.keySet()) {

            List<Integer> times = map.get(num);
            Collections.sort(times);

            int l = 0;
            for (int r = 0; r < times.size(); r++) {

                while (times.get(r) - times.get(l) > d) {
                    l++;
                }

                if (r - l + 1 >= freq) {
                    ans.add(num);
                    break;
                }
            }
        }

        
        System.out.println(ans);
        sc.close();
    }
}
