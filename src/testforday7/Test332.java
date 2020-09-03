package testforday7;

import java.util.*;

/**
 * @author wyf
 * @create 2020/8/27
 */
public class Test332 {
    public List<String> findItinerary(List<List<String>> tickets) {
        Map<String, PriorityQueue<String>> ticketMap = new HashMap<>();
        List<String> result = new ArrayList<>();
        for (List<String> ticket : tickets) {
            if (ticketMap.containsKey(ticket.get(0))) {
                ticketMap.get(ticket.get(0)).offer(ticket.get(1));
            } else {
                PriorityQueue<String> destination = new PriorityQueue<>();
                destination.offer(ticket.get(1));
                ticketMap.put(ticket.get(0), destination);
            }
        }
        String key = "JFK";
        result.add(key);
        while (ticketMap.size() != 0) {
            String keyOld = key;
            PriorityQueue<String> temp = ticketMap.get(key);
            PriorityQueue<String> newQ = new PriorityQueue<>();
            while (!temp.isEmpty() && !ticketMap.containsKey(temp.peek())) {
                key = temp.poll(); // 第一个元素不一定有票
                newQ.offer(key);
            }
            while (!newQ.isEmpty()) {
                temp.offer(newQ.poll());
            }
            key = temp.poll(); // 第一个元素
            result.add(key);
            if (temp.isEmpty()) ticketMap.remove(keyOld);

        }


        return result;
    }

    public static void main(String[] args) {
        PriorityQueue<String> priorityQueue = new PriorityQueue<>();
        priorityQueue.offer("KUL");
        priorityQueue.offer("NRT");
        System.out.println(priorityQueue.peek());

        List<List<String>> tic = new ArrayList<>();
        List<String> s1 = new ArrayList<>();
        s1.add("MUC");
        s1.add("LHR");
        tic.add(s1);

        List<String> s2 = new ArrayList<>();
        s2.add("JFK");
        s2.add("MUC");
        tic.add(s2);

        List<String> s3 = new ArrayList<>();
        s3.add("SFO");
        s3.add("SJC");
        tic.add(s3);

        List<String> s4 = new ArrayList<>();
        s4.add("LHR");
        s4.add("SFO");
        tic.add(s4);
        Test332 t = new Test332();
        t.findItinerary(tic);

    }
}
