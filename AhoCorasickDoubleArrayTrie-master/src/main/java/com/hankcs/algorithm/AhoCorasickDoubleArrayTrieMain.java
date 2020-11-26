package com.hankcs.algorithm;

import java.util.TreeMap;

public class AhoCorasickDoubleArrayTrieMain {

	public static void main(String[] args) {
		
		// Collect test data set
        TreeMap<String, String> map = new TreeMap<>();
        String[] keyArray = new String[]
                {
                        "hers",
                        "his",
                        "she",
                        "he"
                };
        for (String key : keyArray){
            map.put(key, key);
        }
        // Build an AhoCorasickDoubleArrayTrie
        AhoCorasickDoubleArrayTrie<String> acdat = new AhoCorasickDoubleArrayTrie<>();
        acdat.build(map);
        // Test it
        final String text = "uhers";
        acdat.parseText(text, new AhoCorasickDoubleArrayTrie.IHit<String>()
        {
            @Override
            public void hit(int begin, int end, String value){
                System.out.printf("[%d:%d]=%s%n", begin, end-1, value);
            }
        });

	}

}
