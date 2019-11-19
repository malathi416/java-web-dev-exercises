package org.launchcode.java.studios.countingcharacters;

import java.util.HashMap;

public class CountingCharacters {
    public static void main(String[] args){
        HashMap<Character, Integer> message = new HashMap<>();
        String sentence="If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with. So if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero. Once you’ve done that, it’s pretty straightforward from there.";
        char[] charactersInString = sentence.toCharArray();
        int count = 0;

        for (Character letter : charactersInString) {
            if(message.containsKey(letter)){
                message.put(letter, message.get(letter) +1);
            } else {
                message.put(letter, 1);
            }
        }
        for (Character letter : message.keySet()) {
            System.out.println((letter)+":"+message.get(letter));
        }

    }
}
