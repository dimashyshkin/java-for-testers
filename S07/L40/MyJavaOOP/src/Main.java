public class Main {
    public static void main(String[] args) {
        // Create a class called Programming
        // This class should have constructor, that accepts language argument
        // This class should have a method called learningStatus()
        // Also, class should have another boolean variable, learningComplete. The default value should be false
        // Second method of the class, that is called completeLearning()
        // This method should just change the value of learningComplete variable from false to true
        // learningStatus() method should print "Learning ..."  and the name of the language, if you are still learning it
        // And, if you finish learning, then the message should be "Mastered ..." and the language name

        // Here in the main method, create an object of a class.
        // Call learningStatus() method to print the status
        // Then change the status using completeLearning() method
        // And call learningStatus() method to print the status again

        Programming programming = new Programming("Java");
        programming.learningStatus();
        programming.completeLearning();
        programming.learningStatus();

        /*ClassDemo instance = new ClassDemo();
        instance.printNumber();

        ClassDemo instance2 = new ClassDemo();
        instance2.printNumber();*/

        /*Lamp kitchenLamp = new Lamp("Kitchen");
        Lamp bedroomLamp = new Lamp("Bedroom");

        kitchenLamp.printLightStatus();
        bedroomLamp.printLightStatus();

        kitchenLamp.lightStatus = true;

        kitchenLamp.printLightStatus();
        bedroomLamp.printLightStatus();*/


    }
}
