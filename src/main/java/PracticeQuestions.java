package main.java;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.*;

public class PracticeQuestions {

    public static void main(String[] args) throws Exception{

        // an array of reverse sorted ints
//        int[] arrDesc = Arrays.stream(arr).boxed()
//                .sorted(Collections.reverseOrder())
//                .mapToInt(Integer::intValue)
//                .toArray();
        PracticeQuestions q = new PracticeQuestions();
//        int[] A = {9, 818, 174, 237, 892, 109, 522, 27, 59, 336, 605, 865, 714, 86, 708, 535, 138, 948, 836, 287, 179, 754, 466, 856, 153, 53, 958, 951, 262, 341, 769, 491, 772, 509, 336, 120, 98, 805, 169, 984, 520, 447, 256, 266, 348, 351, 60, 563, 45, 638, 29, 479, 400};
//        Arrays.sort(A);
//        for(int i:A)
//        System.out.print(q.candy(A, 852));
//        int[] B = {-6, -4, -6, 0, -8};
////        int[] B = {1, 2};
////        int[] C = {1, 2};
////        int[] D = {2, 3};
////        int[] E = {2, 3};
////        Arrays.sort(A);
//        ArrayList<String> aa = new ArrayList<>();
//        aa.add("2");
//        aa.add("2");
//        aa.add("/");
//
//        LinkedList<Integer> list = new LinkedList<>();
//        String xx = "/..";
//        LRU lru = new LRU(3);
//        lru.set(1, 2);
//        lru.set(3, 6);
//        lru.set(2, 6);
//        lru.set(7, 8);
//        lru.set(1, 2);
//        String[] a = {"cat", "dog", "god", "tca"};
////        String A = "101";
//        int temp;
//        String[] a1 = {"a", "b"};
//        String[] b = {"a", "b"};
//        int[] qqq = q.solve(a1, b);
//        for(int c:qqq)
//        System.out.println(c);

//        List<String> aaa = (List<String>) Arrays.stream(a).toList();
//        ArrayList<ArrayList<Integer>> aa = q.anagrams(aaa);
//        for(int i=0;i<aa.size();i++)
//        {
//            for(int j=0;j<A.length;j++)
//            {
//                System.out.print(A[j] + " ");
//            }
//            System.out.println();
//        }
//        int[] x = q.solve(A);

//        int s = q.maximumGap(A);
//        for(int i=0;i<s.length;i++)
//        long a = 1876;
//        long b = 7430;
//        long x = a*b;
//        long c = 411753753/x;
//        String c = "1";
//        int i = c.charAt(0) - '0';
//        System.out.println(String.format("%32s", Integer.toBinaryString(1000000000)).replaceAll(" ", "0"));

//        BufferedReader s = new BufferedReader(new InputStreamReader(System.in));
//        String x = s.readLine();
//        int T = Integer.parseInt(x);
//        while(T > 0)
//        {
//            String[] sizes = s.readLine().split(" ");
//            int n = Integer.parseInt(sizes[0]);
//            int m = Integer.parseInt(sizes[1]);
//            String[] input = new String[n];
//            String[] prefix = new String[m];
//            int[] w = new int[n];
//            input = s.readLine().split(" ");
//            String[] weight = s.readLine().split(" ");
//            for(int i=0;i<n;i++) {
//                w[i] = Integer.parseInt(weight[i]);
//            }
//            prefix = s.readLine().split(" ");
//            Trie root = new Trie();
//            for(String ip:input)
//                q.insertInTrie(root, ip);
//            HashMap<String, ArrayList<Integer>> map = new HashMap<>();
//            for(int i=0;i<n;i++) {
//                ArrayList<Integer> temp;
//                if(map.containsKey(input[i]))
//                    temp = map.get(input[i]);
//                else
//                    temp = new ArrayList<>();
//                temp.add(w[i]);
//                map.put(input[i], temp);
//            }
//            for(String pre:prefix) {
//                ArrayList<String> res = q.printAutoComplete(root, pre);
//                if(res.size() == 0)
//                    System.out.print("-1 ");
//                else {
//                    for (int i = 0; i < Math.min(res.size(), 5); i++)
//                        System.out.print(res.get(i) + " ");
//                }
//                System.out.println();
//            }
//            T--;
//        }
//        s.close();
//        ConnectionPool lConnectionPool = ConnectionPool.getInstance();
        Long ts = 1695055438000L;
        Date dd = new Date(ts);
        SimpleDateFormat dt = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        System.out.println(dt.format(dd));

        MyStack obj = new MyStack();
        obj.push(1);
        obj.push(2);
        int param_2 = obj.top();
        int param_3 = obj.pop();
        int param_6 = obj.pop();
        boolean param_4 = obj.empty();
    }
    public int size = 0;
    public int solve(int[] A, int[] B) {
        int res = Integer.MIN_VALUE;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < A.length; i++) {
            int dif = (B[i] - A[i]);
            if (map.containsKey(dif))
                map.put(dif, map.get(dif) + 1);
            else
                map.put(dif, 1);
        }
        for (int key : map.keySet()) {
            System.out.println(map.get(key));
            res = Math.max(res, map.get(key));
        }
        return res;
    }

    public int isValidSudoku(final String[] A) {

        for (int i = 0; i < 9; i++) {
            HashSet<Integer> set = new HashSet<>();
            for (int j = 0; i < 9; j++) {
                if (A[i].charAt(j) != '.') {
                    int val = A[i].charAt(j) - '0';
                    if (set.contains(val))
                        return 0;
                    set.add(val);
                }
            }
        }

        for (int i = 0; i < 9; i++) {
            HashSet<Integer> set = new HashSet<>();
            for (int j = 0; i < 9; j++) {
                if (A[j].charAt(i) != '.') {
                    int val = A[j].charAt(i) - '0';
                    if (set.contains(val))
                        return 0;
                    set.add(val);
                }
            }
        }

        for (int i = 0; i < 7; i += 3) {
            HashSet<Integer> set = new HashSet<>();
            for (int j = 0; j < 7; j += 3) {
                for (int k = 0; k < 3; k++) {
                    for (int l = 0; l < 3; l++) {
                        if (A[i + k].charAt(j + l) != '.') {
                            int val = A[i + k].charAt(j + l) - '0';
                            if (set.contains(val))
                                return 0;
                            set.add(val);
                        }
                    }
                }
            }
        }
        return 1;
    }

    public int[] maxset(int[] A) {
//        int sum = Integer.MIN_VALUE, sumc = 0;
//        int eId=A.length, size=0, sizem=0;
//        for(int i=0;i<A.length;i++)
//        {
//            if(A[i]<0)
//            {
//                sumc = 0;
//                size=0;
//                continue;
//            }
//
//            size++;
//            sumc+=A[i];
//
//            if(sum<=sumc)
//            {
//                sum = sumc;
//                sizem = size;
//                eId=i;
//            }
//        }
//        System.out.println(eId);
//        if(sum==Integer.MIN_VALUE)
//        {
//            return new int[0];
//        }
//        int s = eId - sizem + 2;
//        int[] res = new int[sizem];
//
//        for(int i=0;i<sizem;i++)
//        {
//            res[i] = A[i+s-1];
//        }
//        return res;

        int anchor = 0, start = 0, end = 0;
        long sum = 0, maxSum = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] < 0) {
                // If element is negative, update sum and range
                anchor = i + 1;
                sum = 0;
            } else {
                // If element is positive, update sum and range
                sum += A[i];
                if (sum > maxSum) {
                    start = anchor;
                    end = i + 1;
                    maxSum = sum;
                } else if (sum == maxSum) {
                    if (i + 1 - anchor > end - start) {
                        end = i + 1;
                        start = anchor;
                    }
                }
            }
        }
        int[] res = new int[end - start];
        for (int i = 0; i < res.length; i++) {
            res[i] = A[start + i];
        }
        return res;
    }

    public int[] flip(String A) {
        int sum = Integer.MIN_VALUE, sumc = 0;
        int eId = A.length(), size = 0, sizem = 0;
        for (int i = 0; i < A.length(); i++) {
            int val = A.charAt(i) - '0';
            size++;
            if (val == 1)
                sumc -= 1;
            else
                sumc += 1;

            if (sum < sumc) {
                sum = sumc;
                sizem = size;
                eId = i;
            }

            if (sumc < 0) {
                sumc = 0;
                size = 0;
            }
        }
        if (sum == -1) {
            return new int[0];
        }

        int[] rs = new int[2];
        rs[0] = eId - sizem + 2;
        rs[1] = eId + 1;
        return rs;
    }

    public int solve(int[][] A) {
        long res = 0;

        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[0].length; j++) {
                res += A[i][j] * ((i + 1) * (j + 1) * (A.length - i) * (A[0].length - j));
            }
        }
        return (int) res;


    }

    public int[] solve(int[][] A, int[] B, int[] C, int[] D, int[] E) {
        long[][] pf = new long[A.length][A[0].length];
        pf[0][0] = A[0][0];
        int m = 1000000007;
        for (int i = 1; i < A.length; i++) {
            pf[i][0] = (A[i][0] % m + pf[i - 1][0] % m) % m;
        }
        for (int i = 1; i < A[0].length; i++) {
            pf[0][i] = (A[0][i] % m + pf[0][i - 1] % m) % m;
        }
        for (int i = 1; i < A.length; i++) {
            for (int j = 1; j < A[0].length; j++) {
                pf[i][j] = (pf[i - 1][j] % m + pf[i][j - 1] % m - pf[i - 1][j - 1] % m + A[i][j] % m) % m;
            }
        }
        int[] res = new int[B.length];
        for (int i = 0; i < B.length; i++) {
            long sum;
            int r1 = B[i] - 1, r2 = D[i] - 1, c1 = C[i] - 1, c2 = E[i] - 1;
            if (r1 == 0 || c1 == 0) {
                if (r1 == 0 && c1 == 0)
                    sum = pf[r2][c2] % m;
                else if (r1 == 0)
                    sum = pf[r2][c2] % m - pf[r2][c1 - 1] % m;
                else
                    sum = pf[r2][c2] % m - pf[r1 - 1][c2] % m;
                if (sum < 0)
                    sum = (sum % m + m) % m;
                else
                    sum %= m;
                res[i] = (int) sum;
            } else {
                sum = ((pf[r2][c2] % m + m) % m + (pf[r1 - 1][c1 - 1] % m) - (pf[r1 - 1][c2] % m) - (pf[r2][c1 - 1] % m)) % m;
                if (sum < 0)
                    sum = (sum % m + m) % m;
                else
                    sum %= m;
                res[i] = (int) sum;
            }

        }
        return res;
    }

    public int solve(int[][] A, int B) {
        for (int i = 1; i < A.length; i++) {
            A[i][0] = (A[i][0] + A[i - 1][0]);
        }
        for (int i = 1; i < A[0].length; i++) {
            A[0][i] = (A[0][i] + A[0][i - 1]);
        }
        for (int i = 1; i < A.length; i++) {
            for (int j = 1; j < A.length; j++) {
                A[i][j] += (A[i - 1][j] + A[i][j - 1] - A[i - 1][j - 1]);
            }
        }
        long res = Integer.MIN_VALUE;
        for (int i = 0; i < A.length - B; i++) {
            for (int j = 0; j < A[0].length - B; j++) {
                if (i == 0 && j == 0) {
                    long sum = A[i + B - 1][j + B - 1];
                    res = Math.max(res, sum);
                } else if (i == 0) {
                    long sum = A[i + B - 1][j + B - 1] - A[i + B - 1][j - 1];
                    res = Math.max(res, sum);
                } else if (j == 0) {
                    long sum = A[i + B - 1][j + B - 1] - A[i - 1][j + B - 1];
                    res = Math.max(res, sum);
                } else {
                    long sum = A[i + B - 1][j + B - 1] + A[i - 1][j - 1] - A[i - 1][j + B - 1] - A[i + B - 1][j - 1];
                    res = Math.max(res, sum);
                }
            }
        }
        return (int) res;
    }

    public int maximumGap(final int[] A) {
        int res = 0;
        int i = 0, j = A.length - 1;
        while (i < j) {
            if (A[i] <= A[j]) {
                res = Math.max(res, j - i);
                j--;
            } else
                i++;
        }
        return res;
    }

    public int[][] generateMatrix(int A) {
        int[][] res = new int[A][A];
        int e = 1;
        int t = 0, l = 0;
        int r = A - 1, b = A - 1;
        while (t <= b && r >= l) {
            for (int i = l; i <= r; i++) {
                res[t][i] = e;
                e++;
            }
            t++;
            for (int i = t; i <= b; i++) {
                res[i][r] = e;
                e++;
            }
            r--;
            for (int i = r; i >= l; i--) {
                res[b][i] = e;
                e++;
            }
            b--;
            for (int i = b; i >= t; i--) {
                res[i][l] = e;
                e++;
            }
            l++;
        }
        return res;
    }

    public ArrayList<ArrayList<Integer>> anagrams(final List<String> A) {
        ArrayList<String> temp = new ArrayList<>();
        for (String word : A) {
            char[] s = word.toCharArray();
            Arrays.sort(s);
            String nW = new String(s);
            temp.add(nW);
        }
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        HashMap<String, ArrayList<Integer>> map = new HashMap<>();
        for (int i = 0; i < A.size(); i++) {
            ArrayList<Integer> t;
            if (map.containsKey(temp.get(i))) {
                t = map.get(temp.get(i));
            } else {
                t = new ArrayList<>();
            }
            t.add(i + 1);
            map.put(temp.get(i), t);
        }
        for (Map.Entry e : map.entrySet()) {
            res.add((ArrayList<Integer>) e.getValue());
        }
        return res;
    }

    int curr;
    int[][] ans;

    public int[][] towerOfHanoi(int A) {
        curr = 0;
        int m = (1 << A) - 1;
        ans = new int[m][3];
        rec(A, 1, 3);
        return ans;
    }

    public void rec(int disk, int start, int end) {

        if (disk == 1) {
            ans[curr++] = new int[]{disk, start, end};
            return;
        }
        rec(disk - 1, start, 6 - start - end);
        ans[curr++] = new int[]{disk, start, end};
        rec(disk - 1, 6 - start - end, end);
    }

    public int[] solve(int[] A) {
        int newS = (int) Math.sqrt(A.length);
        int[] res = new int[newS];
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < A.length; i++) {
            if (map.containsKey(A[i])) {
                int c = map.get(A[i]);
                map.put(A[i], c + 1);
            } else {
                map.put(A[i], 1);
            }
        }
        int[] arrDesc = Arrays.stream(A).boxed()
                .sorted(Collections.reverseOrder())
                .mapToInt(Integer::intValue)
                .toArray();
        int s = 0;
        for (int i = 0; i < A.length; i++) {
            if (map.get(arrDesc[i]) > 0 && s < newS) {
                res[s] = arrDesc[i];
                int f = map.get(arrDesc[i]);
                map.put(arrDesc[i], f - 1);
                s++;
                for (int j = 0; j < s; j++) {
                    if (i != j) {
                        int gcd = gcd(res[j], arrDesc[i]);
                        f = map.get(gcd);
                        map.put(gcd, f - 2);
                    }
                }
            }
        }
        return res;
    }

    public int gcd(int A, int B) {
        if (A == B)
            return A;
        if (A == 0)
            return B;
        if (B == 0)
            return A;

        return A > B ? gcd(A % B, B) : gcd(A, B % A);
    }

    public ArrayList<Interval> insert(ArrayList<Interval> intervals, Interval newInterval) {
        ArrayList<Interval> res = new ArrayList<>();
        for (int i = 0; i < intervals.size(); i++) {

        }


        return res;
    }

//    public int solve(int A)
//    {
//        long count = 0;
//        int m = 1000000007;
//        for(int i=0;i<32;i++)
//        {
//            int x = (int) Math.pow(2,i+1);
//            int s = x/2;
//            int t = (A+1)/x;
//            t = t*s;
//            count+=t%m;
//            count%=m;
//
//            int nc = (A+1)%x;
//
//            if(nc-s>0)
//            {
//                nc-=s;
//                count+=nc%m;
//            }
//
//            count%=m;
//        }
//        return (int)count%m;
//    }

    public int searchInsert(int[] A, int B) {
        int n = A.length;
        int l = 0, r = n - 1;
        int mid;
        while (l <= r) {
            mid = (l + r) / 2;
            if (A[mid] == B)
                return mid;
            else if (A[mid] < B)
                l = mid + 1;
            else
                r = mid - 1;
        }
        return l;
    }

    public int solve(int A, int B, int C) {
        int m = 1000000007;
        if (B == C) {
            return B % m * A % m;
        }
        long res = 0;
        long l = Math.min(B, C);
        long r = l * A;
        long mid, g = gcd(B, C), pos;
        long lcm = (long) C * B / g;
        while (l < r) {
            mid = l + (r - l) / 2;
            pos = (mid / B) % m + (mid / C) % m - (mid / lcm) % m;
            if (pos < A)
                l = mid + 1;
            else {
                res = mid % m;
                r = mid;
            }
        }
        return (int) res % m;
    }

    public int bitonicMax(int[] A, int B) {
        int res = 0;
        int l = 0, r = A.length - 1;
        int mid, max = 0;
        while (l <= r) {
            mid = (l + r) / 2;
            if (A[mid] > A[mid - 1] && A[mid] > A[mid + 1]) {
                max = mid;
                break;
            } else if (A[mid] < A[mid + 1])
                l = mid + 1;
            else
                r = mid - 1;
        }
        l = 0;
        r = max;
        while (l <= r) {
            mid = (l + r) / 2;
            if (A[mid] == B)
                return mid;
            else if (A[mid] < B)
                l = mid + 1;
            else
                r = mid - 1;
        }
        l = max + 1;
        r = A.length - 1;
        while (l <= r) {
            mid = (l + r) / 2;
            if (A[mid] == B)
                return mid;
            else if (A[mid] > B)
                l = mid + 1;
            else
                r = mid - 1;
        }
        return -1;
    }

    public int subarrayOr(int[] A) {
        long res = 0;
        int m = 1000000007;
        long n = A.length;
        for (int i = 0; i < 32; i++) {
            long id = n;
            for (int j = (int) n - 1; j >= n; j--) {
                if ((A[j] & (1 << i)) != 0)
                    id = i;
                res += (n % m - id % m) * (1 << i) % m;
            }
        }
        return (int) res % m;
    }

    public int solve(int[] A, int B) {
        int n = A.length;
        int i = 0, j = n - 1;
        int c = 0;
        while (i < j) {
            if (i != j) {
                if (A[i] + A[j] == B) {
                    int x = A[i], xx = i;
                    while ((i < j) && (A[i] == x))
                        i++;
                    int y = A[j], yy = j;
                    while ((j >= i) && (A[j] == y))
                        j--;
                    if (x == y) {
                        int temp = i - xx + yy - j - 1;
                        c += (temp * (temp + 1)) / 2;
                    } else
                        c += (i - xx) * (yy - j);
                } else if (A[i] + A[j] > B)
                    j--;
                else
                    i++;
            }
        }
        return c;
    }

    public int solve(String A, String B) {
        String c = "" + A + B + B;
        int n = c.length();
        int res = 0;
        int[] z = new int[n];
        z[0] = n;
        int sk = A.length();
        int l = 0, r = 0;
        for (int i = 1; i < n; i++) {
            if (i > r) {
                l = i;
                r = i;
                while (r < n && c.charAt(r) == c.charAt(r - l)) {
                    r++;
                }
                z[i] = r - l;
                r--;
            } else {
                int j = i - l;
                if (j + z[j] < r - l)
                    z[i] = z[j];
                else {
                    l = i;
                    r++;
                    while (r < n - 1 && c.charAt(r) == c.charAt(r - l)) {
                        r++;
                    }
                    z[i] = r - l;
                    r--;
                }

            }
        }
        for (int i = sk; i < z.length - sk; i++) {
            if (z[i] >= sk)
                res++;
        }
        return res;
    }

    public int parentheses(String A) {
        Stack<Character> s = new Stack<>();
        for (int i = 0; i < A.length(); i++) {
            char c = A.charAt(i);
            if (c == '{' || c == '(' || c == '[')
                s.push(c);
            else {
                char x;
                if (c == '}') {

                    x = '{';
                    if (s.peek() == x)
                        s.pop();
                    else
                        return 0;
                }
                if (c == ']') {
                    x = '[';
                    if (s.peek() == x)
                        s.pop();
                    else
                        return 0;
                }
                if (c == ')') {
                    x = '(';
                    if (!s.isEmpty() && s.peek() == x)
                        s.pop();
                    else
                        return 0;
                }
            }
        }
        return s.size() == 0 ? 1 : 0;
    }

    public String solve(int A) {
        String res = "";
        Deque<String> q = new ArrayDeque<>();
        ArrayList<String> ar = new ArrayList<>();
        q.add("1");
        q.add("2");
        int k = 2;
        while (k < A) {
            StringBuffer s = new StringBuffer(q.getFirst());
            s.append("1");
            StringBuffer t = new StringBuffer(q.getFirst());
            t.append("2");
            q.add(s.toString());
            q.add(t.toString());
            k += 2;
            ar.add(q.remove());
        }

        while (!q.isEmpty())
            ar.add(q.remove());
        StringBuilder s = new StringBuilder(ar.get(A - 1));
        StringBuilder t = new StringBuilder(ar.get(A - 1));
        s.append(t.reverse());
        return s.toString();

    }

    public int evalRPN(ArrayList<String> A) {
        Stack<String> stack = new Stack<>();
        for (int i = 0; i < A.size(); i++) {
            if (A.get(i) == "+" || A.get(i) == "-" || A.get(i) == "/" || A.get(i) == "*") {
                int a = Integer.parseInt(stack.peek());
                stack.pop();
                int b = Integer.parseInt(stack.peek());
                stack.pop();
                int p = 0;
                switch (A.get(i)) {
                    case "+":
                        p = a + b;
                        break;
                    case "-":
                        p = a - b;
                        break;
                    case "/":
                        p = a / b;
                        break;
                    case "*":
                        p = a * b;
                        break;
                }
                stack.push(String.valueOf(p));
            } else
                stack.push(A.get(i));
        }

        int res = Integer.parseInt(stack.peek());
        return res;
    }

    public String simplifyPath(String A) {
        Stack<String> stack = new Stack<>();
        for (int i = 0; i < A.length(); i++) {
            if (A.charAt(i) == '/')
                continue;

            StringBuilder wd = new StringBuilder();
            while (i < A.length() && A.charAt(i) != '/')
                wd.append(A.charAt(i++));

            if (wd.toString().equals("..")) {
                if (!stack.isEmpty())
                    stack.pop();
            } else if (wd.toString().equals("."))
                continue;
            else if (wd.length() != 0)
                stack.push(wd.toString());
        }
        Stack<String> temp = new Stack<>();
        while (!stack.isEmpty()) {
            temp.push(stack.pop());
        }
        StringBuffer res = new StringBuffer("/");
        while (!temp.isEmpty()) {
            res.append(temp.pop());
            res.append("/");
        }
        return res.toString();
    }

    public String solve(String A) {
        StringBuffer res = new StringBuffer();
        ArrayDeque<Character> qq = new ArrayDeque<>();
        HashSet<Character> set = new HashSet<>();
        for (int i = 0; i < A.length(); i++) {
            char c = A.charAt(i);
            if (!qq.isEmpty() && qq.contains(c)) {
                qq.remove(c);
                set.add(c);
            } else {
                if (!set.contains(c))
                    qq.add(c);
            }

            if (!qq.isEmpty())
                res.append(qq.getFirst());
            else
                res.append('#');
        }
        return res.toString();
    }

    public int[] slidingMaximum(final int[] A, int B) {
        int s = A.length;
        int[] res = new int[s - B + 1];
        Deque<Integer> qq = new ArrayDeque<>();
        for (int i = 0; i < B; i++) {
            while (!qq.isEmpty() && qq.getLast() < A[i])
                qq.removeLast();
            qq.add(A[i]);
        }
        res[0] = qq.getFirst();
        for (int i = B; i < s; i++) {
            if (A[i - B] == qq.getFirst())
                qq.removeFirst();
            while (!qq.isEmpty() && qq.getLast() < A[i])
                qq.removeLast();
            qq.add(A[i]);
            res[i - B + 1] = qq.getFirst();
        }
        return res;
    }

    public ArrayList<Integer> postorderTraversal(TreeNode A) {
        if (A == null)
            return null;
        ArrayList<Integer> res = new ArrayList<>();
        Stack<TreeNode> a = new Stack<>();
        Stack<TreeNode> b = new Stack<>();
        a.push(A);
        TreeNode ref;
        while (!a.isEmpty()) {
            ref = a.pop();
            if (ref.left != null)
                a.push(ref.left);
            if (ref.right != null)
                a.push(ref.right);
            b.push(ref);
        }
        while (!b.isEmpty()) {
            ref = b.pop();
            res.add(ref.val);
        }
        Collections.reverse(res);
        return res;

    }

    public ArrayList<ArrayList<Integer>> levelOrder(TreeNode A) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        ArrayDeque<TreeNode> qq = new ArrayDeque<>();
        qq.add(A);
        while (!qq.isEmpty()) {
            ArrayList<Integer> t = new ArrayList<>();
            int s = qq.size();
            for (int i = 0; i < s; i++) {
                TreeNode temp = qq.pop();
                t.add(temp.val);
                if (temp.left != null)
                    qq.add(temp.left);
                if (temp.right != null)
                    qq.add(temp.right);
            }

            res.add(t);
        }
        return res;
    }

    public TreeNode buildTree(int[] A, int[] B) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int s = A.length;
        for (int i = 0; i < s; i++)
            map.put(A[i], i);

        return finalTree(A, B, map, s - 1, 0, 0, s - 1);
    }

    public TreeNode finalTree(int[] A, int[] B, HashMap<Integer, Integer> map, int pS, int pE, int iS, int iE) {
        if (pS < pE || iS > iE)
            return null;

        TreeNode node = new TreeNode(B[pS]);
        int id = map.get(B[pS]);
        int t = pS - (iE - id);
        node.left = finalTree(A, B, map, pE, t - 1, iS, id - 1);
        node.right = finalTree(A, B, map, pS - 1, t, id + 1, iE);
        return node;
    }

    public ArrayList<Integer> inOrderTraversal(TreeNode A)
    {
        ArrayList<Integer> res = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        TreeNode c = A;
        while(c != null || stack.size()>0)
        {
            while(c != null)
            {
                stack.add(c);
                c = c.left;
            }
            c = stack.pop();
            res.add(c.val);
            c = c.right;
        }
        return res;
    }

    public int solve(TreeNode A, TreeNode B) {
        long res = 0;
        int m = 1000000007;
        ArrayList<Integer> inA = inOrderTraversal(A);
        ArrayList<Integer> inB = inOrderTraversal(B);
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<inA.size();i++)
            set.add(inA.get(i));
        for(int i=0;i<inB.size();i++)
        {
            if(set.contains(inB.get(i)))
                res += inB.get(i)%m;
        }
        return (int)res%m;
    }

    ArrayList<Long> pB = new ArrayList<>(), pC = new ArrayList<>();

    public int lca(TreeNode A, int B, int C) {
        pB.clear();
        pC.clear();
        boolean b = findNode(A, B, pB);
        boolean c = findNode(A, C, pC);

        int i;
        for(i=0;i<pB.size() && i<pC.size();i++)
        {
            if(pB.get(i) != pC.get(i))
                break;
        }
        long res = pB.get(i-1);
        return i==0?-1: (int) res;
    }

    public boolean findNode(TreeNode A, int B, ArrayList<Long> res)
    {
        if(A == null)
            return false;

        res.add((long)A.val);

        if(A.val == B)
            return true;
        if(A.left != null && findNode(A.left, B, res))
            return true;
        if(A.right != null && findNode(A.right, B, res))
            return true;

        res.remove(res.size()-1);

        return false;
    }

    public int[] solve(String[] A, String[] B) {
        int[] res = new int[B.length];
        Trie root = new Trie();
        for(int i=0;i<A.length;i++)
        {
            insertInTrie(root, A[i]);
        }
        for(int i=0;i<B.length;i++)
        {
            if(searchInTrie(root, B[i]))
                res[i] = 1;
            else
                res[i] = 0;
        }
        return res;
    }

    public boolean searchInTrie(Trie root, String A)
    {
        Trie cur = root;
        for(int i=0;i<A.length();i++)
        {
            char c = A.charAt(i);
            int id = c - 'a';
            if(cur.ar[id] == null)
                return false;
            else {

                System.out.println(cur.ar[id].val);
                cur = cur.ar[id];
            }
        }
        return cur.isEnd;
    }

    public void insertInTrie(Trie node, String A)
    {
        Trie cur = node;
        for(int i=0;i<A.length();i++)
        {
            int id = A.charAt(i) - 'a';
            if(cur.ar[id] == null)
                cur.ar[id] = new Trie(A.charAt(i));
            cur = cur.ar[id];
        }

        cur.isEnd = true;
    }

    public ArrayList<String> printAutoComplete(Trie node, String prefix)
    {
        ArrayList<String> res = new ArrayList<>();
        Trie cur = node;
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < prefix.length(); i++) {
            char c = prefix.charAt(i);
            int id = c - 'a';
            if (cur.ar[id] == null)
                return res;
            else
                cur = cur.ar[id];
            s.append(cur.val);
        }
        listMaker(cur, res, s);
        return res;
    }
    public void listMaker(Trie node, ArrayList<String> res, StringBuilder s)
    {
        if(node.isEnd) {
            int c = node.count;
            while(c-- > 0)
                res.add(s.toString());
        }

        for(int i=0;i<26;i++)
        {
            if(node.ar[i] == null)
                continue;
            else
            {
                listMaker(node.ar[i], res, s.append(node.ar[i].val));
                s.setLength(s.length()-1);
            }
        }
    }

    public int findCountOfString(Trie node, String f)
    {
        int res = 0;
        Trie cur = node;
        int i;
        for(i=0;i<f.length();i++)
        {
            int id = f.charAt(i) - 'a';
            if(cur.ar[id] == null)
                break;
            else
                cur = cur.ar[id];
        }
        res = i != f.length()?0:cur.count;
        return res;
    }

    public void insertInHeap(int[] heap, int val)
    {
        size += 1;
        heap[size] = val;
        heapifyUp(heap);
    }

    public void heapifyUp(int[] heap)
    {
        int id = size;
        while(id > 1)
        {
            if(heap[id] < heap[id/2])
            {
                int c = heap[id];
                heap[id] = heap[id/2];
                heap[id/2] = c;
            }
            id /= 2;
        }
    }

    public int heapifyDown(int[] heap)
    {
        int res = heap[1];
        int x = heap[1];
        heap[1] = heap[size];
        heap[size] = x;
        size-=1;
        int id = 1;
        while((id*2) <= size)
        {
            if(id*2 + 1 > size)
            {
                if(heap[id] > heap[id*2])
                {
                    int c = heap[id];
                    heap[id] = heap[(id*2)];
                    heap[(id*2)] = c;
                    id = id*2;
                }
                else
                    break;
            }
            else if(heap[id] > heap[id*2] || heap[id] > heap[(id*2) + 1])
            {
                if(heap[id*2] > heap[(id*2)+1])
                {
                    int c = heap[id];
                    heap[id] = heap[(id*2)+1];
                    heap[(id*2)+1] = c;
                    id = id*2 + 1;
                }
                else
                {
                    int c = heap[id];
                    heap[id] = heap[id*2];
                    heap[id*2] = c;
                    id = id*2;
                }
            }
            else
                break;
        }
        return res;
    }

    public int candy(int[] A, int B) {
        PriorityQueue<Integer> min = new PriorityQueue<>();
        int res = 0;
        for(int i=0;i<A.length;i++)
            min.add(A[i]);
        while(min.peek()<=B && min.size()>1)
        {
            if(min.peek() <= B) {
                int c = min.remove();
                res += c / 2;
                int n = min.remove() + (int) Math.ceil(c / 2);
                min.add(n);
            }
        }
        return res;
    }
    public int[] runningMedian(int[] A) {
        int[] res = new int[A.length];
        PriorityQueue<Integer> right = new PriorityQueue<>();
        PriorityQueue<Integer> left = new PriorityQueue<>(Collections.reverseOrder());
        res[0] = A[0];
        left.add(A[0]);
        for(int i=1;i<A.length;i++)
        {
            if(A[i] <= res[i-1])
                left.add(A[i]);
            else
                right.add(A[i]);

            if(Math.abs(right.size() - left.size()) == 2)
            {
                if(right.size() > left.size())
                    left.add(right.remove());
                else
                    right.add(left.remove());
            }

            if(right.size() - left.size() == 1)
                res[i] = right.peek();
            else if(left.size() - right.size() == 1)
                res[i] = left.peek();
            else if(right.size() == left.size())
                res[i] = left.peek();

        }
        return res;
    }

    public int[] kPlaces(int[] A, int B) {
        int[] res = new int[A.length];
        PriorityQueue<Integer> min = new PriorityQueue<>();
        for(int i=0;i<=B;i++)
            min.add(A[i]);
        int id=0;
        for(int i=B+1;i<A.length;i++)
        {
            res[id++] = min.remove();
            min.add(A[i]);
        }
        while(min.size()>0)
            res[id++] = min.remove();

        return res;
    }
    public int[] athLargest(int A, int[] B) {
        int[] res = new int[B.length];

        for(int i=0;i<A;i++)
            res[i] = -1;
        return res;
    }

    /**
     * Given an array of integers nums and an integer target, return indices of the
     * two numbers such that they add up to target. You may assume that each input
     * would have exactly one solution, and you may not use the same element twice.
     */
    public int[] twoSum(int[] nums, int target)
    {
        int[] res = new int[2];
        for(int i=0;i<nums.length;i++)
        {
            int x = target - nums[i];
            for(int j=i+1;j<nums.length;j++)
            {
                if(nums[j] == x)
                {
                    res[0] = i;
                    res[1] = j;
                }
            }
        }
        return res;
    }

    /**
     * Starting from right taking it as centre, spread left and right to find palindromes and find the max length
     * sub string palindrome.
     *
     * @param s input string
     * @return Longest Palindromic SubString
     */
    public String longestPalindromicSubString(String s)
    {
        int length = 0;
        int max_length = 0;
        int substr_sp = -1;
        int substr_ep = -1;
        int sp = -1;
        int ep = -1;

        for(int i=s.length()-1; i>=0; i--){
            sp = i;
            ep = i;

            while(sp>=0 && ep<=s.length()-1){
                if(s.charAt(sp) == s.charAt(ep)){
                    length = ((ep)-(sp))+1;
                    if(length >= max_length){
                        max_length = length;
                        substr_sp = sp;
                        substr_ep = ep;
                    }
                }
                else
                    break;

                sp--;
                ep++;
            }
        }


        for(int i=s.length()-2; i>=0; i--){
            sp = i;
            ep = i+1;

            while(sp>=0 && ep<=s.length()-1){
                if(s.charAt(sp) == s.charAt(ep)){
                    length = ((ep)-(sp))+1;
                    if(length >= max_length){
                        max_length = length;
                        substr_sp = sp;
                        substr_ep = ep;
                    }
                }else{
                    break;
                }
                sp--;
                ep++;
            }
        }


        if(max_length == 1){
            return s.charAt(0)+"";
        }

        return s.substring(substr_sp, substr_ep+1);
    }

    /**
     * A substring of s is considered balanced if all zeroes are before ones and the number of zeroes
     * is equal to the number of ones inside the substring.
     * Notice that the empty substring is considered a balanced substring.
     * @param s input string
     * @return length of the longest balanced substring of s
     */
    public int findTheLongestBalancedSubstring(String s) {
        int res = 0, c0 = 0, c1 = 0;
        //iterating and counting 0 first and then 1 from left
        for(int i = 0; i<s.length();)
        {
            while(i<s.length() && s.charAt(i) == '0')
            {
                c0++;
                i++;
            }
            while(i<s.length() && s.charAt(i) == '1')
            {
                c1++;
                i++;
            }

            res = Math.max(res, 2*(Math.min(c0, c1)));
//            resetting for further iterations
            c0 = 0;
            c1 = 0;
        }
        return res;
    }

    /**
     * Given two integers dividend and divisor, divide two integers without using
     * multiplication, division, and mod operator
     * @param dividend
     * @param divisor
     * @return quotient
     */
    public int divide(int dividend, int divisor) {
        if(dividend == Integer.MIN_VALUE && divisor==-1) return Integer.MAX_VALUE;
        boolean sign = dividend>0 ^ divisor>0;
        int res = 0;
        dividend = Math.abs(dividend);
        divisor = Math.abs(divisor);
        while(dividend - divisor >= 0) {
            int temp = divisor;
            int c=0;
            while (dividend - temp >= 0) {
                temp = temp << 1;
                c++;
            }
            temp = divisor;
            dividend = dividend - (temp << c-1);
            res += 1 << c-1;
        }

        if(sign)
            return -res;
        return res;
    }

    /**
     * Write a function to find the longest common prefix string amongst an array of strings.
     * @param strs List of strings
     * @return longestCommonPrefix
     */
    public String longestCommonPrefix(String[] strs) {
        StringBuilder res = new StringBuilder();
        //sorting array lexicographically and finding common prefix of first and last string
        Arrays.sort(strs);
        String s1 = strs[0], s2 = strs[strs.length - 1];
        int i = 0;
        while(i<s1.length() && i<s2.length())
        {
            if(s1.charAt(i) == s2.charAt(i))
                res.append(s1.charAt(i++));
            else
                break;
        }
        return res.toString();
    }

    /**
     * Given an integer array nums, return all the triplets summing to 0
     * @param nums integer array
     * @return unique triplets with sum 0
     */
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> res  = new HashSet<>();
        if(nums.length==0)
            return new ArrayList<>(res);
        Arrays.sort(nums);
        for(int i=0; i<nums.length-2;i++){
            int j =i+1;
            int k = nums.length-1;
            while(j<k)
            {
                int sum = nums[i]+nums[j]+nums[k];
                if(sum == 0)
                    res.add(Arrays.asList(nums[i], nums[j++], nums[k--]));
                else if (sum>0)
                    k--;
                else
                    j++;
            }
        }
        return new ArrayList<>(res);
    }

    /**
     * Convert an Array Into a 2D Array With Conditions
     * Sorting array to find frequency to find number of rows and filling accordingly
     *
     * @param nums input array
     * @return 2D matrix satisfying all conditions
     */
    public List<List<Integer>> findMatrix(int[] nums) {
        int minRows = 1, count = 1;
        Arrays.sort(nums);

        for(int i=1;i<nums.length;i++)
        {
            if (nums[i] == nums[i - 1])
                count++;
            else
                count = 1;

            minRows = Math.max(count, minRows);
        }

        List<List<Integer>> lRes = new ArrayList<>();
        for(int i=0; i<minRows; i++)
        {
            lRes.add(new ArrayList<>());
        }

        int s = 0;
        lRes.get(0).add(nums[s]);
        for(int i=1; i<nums.length; i++)
        {
            if(nums[i] == nums[i-1])
                s += 1;
            else
                s = 0;

            if(s < minRows)
                lRes.get(s).add(nums[i]);
        }

        return lRes;
    }

    /**
     * Checking number of devices on each floor and multiplying
     * @param bank floor plan with security devices
     * @return number of beams
     */
    public int numberOfBeams(String[] bank) {
        int res = 0, count1=0, count2 = 0, start = 0;
        for(int i=0;i<bank.length;i++)
        {
            count1 = countOnes(bank[i]);
            if(count1 != 0)
            {
                start = i;
                break;
            }
        }

        for(int i=start+1;i<bank.length;i++)
        {
            count2 = countOnes(bank[i]);
            if(count2!=0)
            {
                res += (count1*count2);
                count1 = count2;
            }
        }
        return res;
    }
    public int countOnes(String floor)
    {
        int count1 = 0;
        for(int j = 0; j<floor.length(); j++)
            if(floor.charAt(j) == '1')
                count1++;

        return count1;
    }

}
