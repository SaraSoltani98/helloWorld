package se.iths.sara.helloworld;

public class HelloWorld {
    public static void main(String[] args) {
        String[] word = {"Hello", "World", "!"};
        print(word);


    }

    public static void print(String[] word) {
        for (int i = 0; i < word.length; i++) {
            System.out.print(word[i] + " ");
        }

    }

}
