package lambdaexp;

public class LambdaMain {

    public static void main(String[] args) {
        /*
        Without Lambda
        new Employee(new RelationshipStatus() {
            @Override
            public String getStatus() {
                return "Complicated";
            }
        });
        */
        Employee employee = new Employee(() -> "Complicated");
        System.out.println(employee.getRelationshipStatusAsString());

/*
        without lambda
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Inside runnable run");
            }
        });
*/


        Thread thread = new Thread(() -> System.out.println("Inside runnable run"));
        thread.start();

        boolean isLoyal = false;

        Employee marriedMan = new Employee(() -> {

            return isLoyal ? "Married" : "Single";
        });
        System.out.println(marriedMan.getRelationshipStatusAsString());
    }
}
