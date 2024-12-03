package br.com.tamawilson.records;

public class Main {
    public static void main(String[] args) {
        ExampleClass exampleClass = new ExampleClass();
        exampleClass.setName("Wilson");
        exampleClass.setActive(true);
        System.out.println(exampleClass.toString());


        ExampleLombok exampleLombok = new ExampleLombok();
        exampleLombok.setName("Wilson");
        exampleLombok.setActive(false);
        System.out.println(exampleLombok.toString());
        exampleLombok.setActive(true);
        System.out.println(exampleLombok.toString());

        ExampleRecord exampleRecord = new ExampleRecord("Wilson", 18, 1.0d, true, 'A', 1, "Rua 1");
        exampleRecord.isActive();
        System.out.println(exampleRecord.toString());
    }
}