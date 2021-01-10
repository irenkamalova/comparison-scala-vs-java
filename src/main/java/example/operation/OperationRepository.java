package example.operation;

import java.util.*;

public class OperationRepository {
    private final Set<Operation> operations = new HashSet<>();

    public void handle(Operation operation) {
        switch (operation) {
            case ADD:
            case INSERT:
            case UPDATE:
                operations.add(operation);
                break;
            case DELETE:
                operations.remove(operation);
                break;
        }
    }

    public Set<Operation> getAll() {
        return operations;
    }
}

