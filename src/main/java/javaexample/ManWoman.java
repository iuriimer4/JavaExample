package javaexample;

public class ManWoman {
        public static  void main(String[] args) {
            Man man = new Man();
            Woman woman = new Woman();
            man.wife = new Woman();
            woman.husband = new Man();
        }
        public static  class Man {
            public int age;
            public int height;
            public Woman wife;
        }
        public static class Woman {
            public int age;
            public int height;
            public Man husband;
        }
    }
