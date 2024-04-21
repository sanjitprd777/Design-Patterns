import java.util.*;

public class Main {

    public static void main(String[] args) {
        List<int[]> edge[] = new ArrayList[6];
        edge[0] = new ArrayList<>();
        edge[0].add(new int[]{3,3,3});

        List<int[]> []l = new ArrayList[10];
        l[0] = new ArrayList<>();
        l[0].add(new int[]{2,3,4,4});
        l[0].add(new int[]{8,6,4,3});
        Arrays.stream(l).sorted();

        List<Integer> ll = new ArrayList<>(10);
        for (int i=1;i<15;++i)
            ll.add(i);
        System.out.println(ll);

        List<int[]> ab = new ArrayList<>();
        ab.add(new int[]{3,4,6});
        ab.add(new int[]{63,24,46});
        ab.add(new int[]{36,42,64});
        Collections.sort(ab, new cmp());
        for (int[] a : ab)
            System.out.println(a);

        Set<List> s = new HashSet<>();
        s.add(List.of(2,2,2));
        s.add(List.of(2,12,2));
        s.add(List.of(2,2,24));
        System.out.println(s.size());
    }

    static class cmp implements Comparator<int[]> {

        @Override
        public int compare(int[] a, int[] b) {
            if (a[1]>b[1])
                return 1;
            return -1;
        }
    }
}
