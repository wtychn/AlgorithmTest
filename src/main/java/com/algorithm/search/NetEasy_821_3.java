package com.algorithm.search;

import java.util.*;
/***
 * @Description: 纸张分配问题
 * @level mid
 * @author wtychn
 * @Date 2021/8/21
 */
public class NetEasy_821_3 {

    private int solution(List<Integer> numList) {
        int n = numList.size();
        int[] paper = new int[n];
        Queue<Integer> idxQueue = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            int former = i - 1 < 0 ? n + i - 1 : i - 1;
            if (numList.get(former) >= numList.get(i) &&
                    numList.get(i) <= numList.get((i + 1) % n)) {
                paper[i] = 1;
                idxQueue.offer(i);
            }
        }
        while (!idxQueue.isEmpty()) {
            int cur = idxQueue.poll();
            int former = cur - 1 < 0 ? n - 1 : cur - 1;
            int later = cur + 1 >= n ? 0 : cur + 1;

            if (paper[former] == 0) {
                paper[former] = numList.get(former) > numList.get(cur) ?
                        paper[cur] + 1 : paper[cur];
                idxQueue.offer(former);
            } else {
                if (numList.get(former) > numList.get(cur)) {
                    paper[former] = Math.max(paper[cur], paper[former]);
                } else if(numList.get(former) < numList.get(cur)) {
                    paper[cur] = Math.max(paper[cur], paper[former]);
                }
            }

            if (paper[later] == 0) {
                paper[later] = numList.get(later) > numList.get(cur) ?
                        paper[cur] + 1 : paper[cur];
                idxQueue.offer(later);
            } else {
                if (numList.get(later) > numList.get(cur)) {
                    paper[later] = Math.max(paper[cur], paper[later]);
                } else if(numList.get(later) < numList.get(cur)) {
                    paper[cur] = Math.max(paper[cur], paper[later]);
                }
            }
        }

        return Arrays.stream(paper).sum();
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String nums = s.nextLine();
        String[] strs = nums.split(" ");
        List<Integer> list = new ArrayList<>();
        for (String str : strs) {
            list.add(Integer.parseInt(str));
        }

        NetEasy_821_3 main = new NetEasy_821_3();
        System.out.println(main.solution(list));
    }
}
