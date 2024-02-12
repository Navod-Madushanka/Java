package Example_4;

public abstract class Test {
    public void executeTest(){
        System.out.println("Test is begun.... ");
        setTestEnvironment();
        clearResources();
        unitTest();
        integratedTest();
        performanceTest();
        System.out.println("Test is finished.... ");
    }

    public abstract void clearResources();
    public abstract void setTestEnvironment();
    private void unitTest(){
        System.out.println("Unit test is running");
    }
    private void integratedTest(){
        System.out.println("Integrated test is running");
    }
    private void performanceTest(){
        System.out.println("Performance test is running");
    }

}
