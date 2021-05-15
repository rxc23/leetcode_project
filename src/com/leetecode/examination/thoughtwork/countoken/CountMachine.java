package com.leetecode.examination.thoughtwork.countoken;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


//设计一个计票器，输入候选人列表和投票结果，计算出每个候选人的票数、无效票数、获得票数最多的人
//输入：["A","B","C"]

//输入：["A","F","A","B","A","B","A","C","E"]
//输出：A=4,B=2,C=1,invalidVotes=2 winner=A
public class CountMachine {

    private static Map<String, Integer> map = new HashMap<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] candicates = br.readLine().trim().split(" "); //候选人
        String[] votes = br.readLine().trim().split(" "); //投票情况

        countMachine(candicates, votes);

    }


    public static Map<String, Integer> countMachine(String[] candicates, String[] votes) {
        if (candicates == null || votes == null) {
            return null;
        }

        int countvalid = 0;

        for (int i = 0; i < candicates.length; ++i) {
            int count = 0;
            for (int j = 0; j < votes.length; ++j) {
                if (candicates[i].equals(votes[j])) {
                    count++;
                }
            }
            countvalid = countvalid + count;
            map.put(candicates[i], count);
        }
        map.put("invalidVotes", votes.length - countvalid);


        List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o2.getValue() - o1.getValue();  //降序
            }
        });

        if (list.get(0).getValue().equals(map.get("invalidVotes"))) {
            System.out.println("没有人获胜");
            return null;
        } else {
            for (Map.Entry<String, Integer> entry : list) {
                System.out.print(entry + " ");
            }
            System.out.print("winner:" + list.get(0).getKey());
        }


        return null;
    }

}
