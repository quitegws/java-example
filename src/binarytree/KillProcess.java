package binarytree;

import java.util.*;

/**
 * @Author: gws
 * @Date: 19/03/2018 22:29
 * @Description:
 */
public class KillProcess {
//    Given pid = [1, 3, 10, 5], ppid = [3, 0, 5, 3], kill = 5, return [5,10].
    /**
     * @param pid: the process id
     * @param ppid: the parent process id
     * @param kill: a PID you want to kill
     * @return: a list of PIDs of processes that will be killed in the end
     */
    public List<Integer> killProcess(List<Integer> pid, List<Integer> ppid, int kill) {
        // Write your code here

        if (pid == null || ppid == null) {
            return null;
        }
        if (pid.size() != ppid.size()) {
            return null;
        }

        HashMap<Integer, Integer> map = new HashMap<>(pid.size());
        HashSet<Integer> ppids = new HashSet<>();
        LinkedList<Integer> result = new LinkedList<>();

        for (int i = 0; i < pid.size(); i++) {
            int p = ppid.get(i);
            ppids.add(p);
            map.put(pid.get(i), p);
        }

        HashSet<Integer> cur = new HashSet<>();
        cur.add(kill);
        result.add(kill);
        while (containsPid(cur, ppids)) {
            HashSet<Integer> tmp = new HashSet<>();
            for (int i = 0; i < pid.size(); i++) {
                if (cur.contains(ppid.get(i))) {
                    tmp.add(pid.get(i));
                }
            }

            cur.clear();
            cur.addAll(tmp);
            result.addAll(tmp);
        }

        return result;
    }

    public boolean containsPid(HashSet<Integer> one, HashSet<Integer> another){
        for (int i : one) {
            if (another.contains(i)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        ArrayList<Integer> pid = new ArrayList<>();
        ArrayList<Integer> ppid = new ArrayList<>();

        pid.add(1);
        pid.add(3);
        pid.add(10);
        pid.add(5);
        ppid.add(3);
        ppid.add(0);
        ppid.add(5);
        ppid.add(3);

        List list = new KillProcess().killProcess(pid, ppid, 5);

        System.out.println(list);
    }
}
