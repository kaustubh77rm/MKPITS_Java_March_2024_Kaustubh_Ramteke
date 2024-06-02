//1. **Task Scheduler**: Develop a Java program that schedules tasks based on
// their priorities using the PriorityQueue class. Tasks with higher priority
// should be executed before tasks with lower priority. Implement operations such
// as adding tasks, removing tasks, and executing tasks based on their priority.
package assn_16.priorityqueue;

import java.util.*;
public class RemovebyPriority {
    public List<Integer> sort(List<Integer> list) {
        HashMap<Integer, Integer> hashMap=new HashMap<Integer, Integer>();

        for (int i=0; i<list.size(); i++) {
            hashMap.put(list.get(i), hashMap.getOrDefault(list.get(i),0)+1);
        }
        Collections.sort(list,(n1,n2)->
                {
                    int freq1=hashMap.get(n1);
                    int freq2=hashMap.get(n2);
                    if (freq1 != freq2) {
                        return freq2-freq1;
                    }
                    return n1-n2;
                }
        );
        return list;
    }
    public static void main(String[] args) {
        RemovebyPriority r = new RemovebyPriority();
        List<Integer> list=new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(5);
        list=r.sort(list);
        System.out.println(list);
    }
}