package com.algorithms.utils;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class URLShortener {
    static int sequence = 2;
    static List<Map.Entry<String, Integer>> listServers = new ArrayList();

    public static void main(String[] args) throws IOException {
        Map<String, Integer> mapServers = new HashMap<>();
        mapServers.put("192.168.16.5", 1000);
        mapServers.put("192.168.16.7", 1000);
        mapServers.put("192.168.16.9", 1000);
        mapServers.put("192.168.16.16", 1000);
        startServersList(mapServers);
        System.out.println(getServerIP(mapServers));
    }

    public static String getServerIP(Map<String, Integer> mapServers) {
        if (sequence > listServers.size() - 1)
            sequence = 0;
        mapServers.put(listServers.get(sequence).getKey(), listServers.get(sequence).getValue() - 1);
        String ip = listServers.get(sequence).getKey();
        sequence++;
        return ip;
    }

    public static void startServersList(Map<String, Integer> mapServers) {
        for (Map.Entry<String, Integer> entry : mapServers.entrySet()) {
            listServers.add(entry);
        }
    }
}
