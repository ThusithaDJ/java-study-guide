package lambdaexp;

public class Employee {

    private RelationshipStatus status;

    public Employee(RelationshipStatus status) {
        this.status = status;
    }

    public String getRelationshipStatusAsString() {
        return status.getStatus();
    }
}
